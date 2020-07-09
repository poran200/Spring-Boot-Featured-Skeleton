package com.example.application.chat.models.mappers

import com.example.application.chat.models.dtos.ChatMessageDto
import com.example.application.chat.models.entities.ChatMessage
import com.example.application.chat.services.ChatRoomService
import com.example.common.utils.ExceptionUtil
import com.example.coreweb.domains.base.models.mappers.BaseMapper
import com.example.application.domains.users.services.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import java.text.SimpleDateFormat

@Component
class ChatMessageMapper @Autowired constructor(
        private val userService: UserService,
        private val chatRoomService: ChatRoomService
) : BaseMapper<ChatMessage, ChatMessageDto> {

    override fun map(entity: ChatMessage): ChatMessageDto {
        val dto = ChatMessageDto()
        dto.id = entity.id
        dto.created = entity.createdAt
        dto.updatedAt = entity.updatedAt

        dto.from = entity.from.username
        dto.chatRoomId = entity.chatRoom.id
        dto.content = entity.content
        dto.time = SimpleDateFormat("HH:mm").format(entity.updatedAt)
        return dto
    }

    override fun map(dto: ChatMessageDto, exEntity: ChatMessage?): ChatMessage {
        val entity = exEntity ?: ChatMessage()

        entity.chatRoom = this.chatRoomService.find(dto.chatRoomId).orElseThrow { ExceptionUtil.getNotFound("Chat Room", dto.chatRoomId) }
        entity.from = this.userService.findByUsername(dto.from
                ?: "").orElseThrow { ExceptionUtil.getNotFound("User", dto.from) }
        entity.content = dto.content
        return entity
    }


}