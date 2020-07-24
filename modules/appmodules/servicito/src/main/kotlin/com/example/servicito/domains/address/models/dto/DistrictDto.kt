package com.example.servicito.domains.address.models.dto

import com.fasterxml.jackson.annotation.JsonProperty
import com.example.coreweb.domains.base.models.dtos.BaseDto
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

class DistrictDto : BaseDto() {

    @NotBlank
    @JsonProperty("name_en")
    var nameEn: String? = null

    @NotBlank
    @JsonProperty("name_bn")
    var nameBn: String? = null

    @NotNull
    @JsonProperty("division_id")
    var divisionId: Long? = null

}
