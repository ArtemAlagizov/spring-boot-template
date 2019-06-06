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
    @ApiModelProperty(notes = "Very important value", example = "6", required = true)
    private Integer value;

    @Setter
    @Getter
    @JsonProperty
    @ApiModelProperty(notes = "Very important id", example = "45", position = 1)
    private Integer id;
}
