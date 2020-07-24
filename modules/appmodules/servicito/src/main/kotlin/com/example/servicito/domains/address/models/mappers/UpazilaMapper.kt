package com.example.servicito.domains.address.models.mappers

import com.example.servicito.domains.address.models.dto.UpazilaDto
import com.example.servicito.domains.address.models.entities.Upazila
import com.example.servicito.domains.address.services.DistrictService
import com.example.common.exceptions.notfound.NotFoundException
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class UpazilaMapper(@Autowired val districtService: DistrictService) {
    fun map(entity: Upazila): UpazilaDto {
        val dto = UpazilaDto()
        dto.id = entity.id
        dto.created = entity.createdAt
        dto.updatedAt = entity.updatedAt

        dto.nameEn = entity.nameEn
        dto.nameBn = entity.nameBn
        dto.thana = entity.thana
        dto.districtId = entity.district?.id
        return dto
    }

    fun map(dto: UpazilaDto, upazila: Upazila?): Upazila {
        var entity = upazila
        if (entity == null) entity = Upazila()

        entity.nameEn = dto.nameEn
        entity.nameBn = dto.nameBn
        entity.thana = dto.thana
        entity.district = districtService.find(dto.districtId!!).orElseThrow { NotFoundException() }
        return entity
    }


}