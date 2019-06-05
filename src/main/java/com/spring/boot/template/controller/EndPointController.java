package com.spring.boot.template.controller;

import com.spring.boot.template.model.Data;
import com.spring.boot.template.service.JavaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * Rest controller, provides /calculate endpoint
 */
@CrossOrigin()
@RestController
@RequestMapping("/calculate")
public class EndPointController {
    private JavaService javaService;

    @Autowired
    protected EndPointController(JavaService javaService) {
        this.javaService = javaService;
    }

    @RequestMapping(method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Data calculate(Integer input) {
        return javaService.calculate(input);
    }
}