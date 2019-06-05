package com.spring.boot.template.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@ApiModel(description = "All details about the data.")
public class Data {
    @Setter
    @Getter
    @JsonProperty
    @ApiModelProperty(notes = "The very important value")
    private Integer value;
}
