package com.spring.boot.template.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

public class Data {
    @Setter
    @Getter
    @JsonProperty
    private Integer value;
}
