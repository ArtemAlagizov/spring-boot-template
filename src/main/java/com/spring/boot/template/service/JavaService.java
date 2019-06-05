package com.spring.boot.template.service;

import com.spring.boot.template.model.Data;
import org.springframework.stereotype.Service;

@Service
public class JavaService {
    public Data calculate(Data input) {
        Integer result = input.getValue() * 19;
        Data data = new Data();

        data.setValue(result);

        return data;
    }
}
