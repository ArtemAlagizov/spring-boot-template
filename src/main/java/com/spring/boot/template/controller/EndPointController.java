package com.spring.boot.template.controller;

import com.spring.boot.template.model.Data;
import com.spring.boot.template.service.JavaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * Rest controller, provides /calculate endpoint
 */
@CrossOrigin()
@RestController
@RequestMapping("/calculate")
@Api(value = "Calculation ting", description = "Calculation on the input")
public class EndPointController {
    private JavaService javaService;

    @Autowired
    protected EndPointController(JavaService javaService) {
        this.javaService = javaService;
    }

    @RequestMapping(method = RequestMethod.GET, path="/get-value")
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(value = "Get calculation result", response = Data.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved calculated value"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    })
    public Data calculate(Integer input) {
        return javaService.calculate(input);
    }

    @RequestMapping(method = RequestMethod.POST, path="/create-value")
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation(value = "Create calculation", response = Data.class)
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successfully created a value"),
            @ApiResponse(code = 401, message = "You are not authorized to create the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    })
    public Data create(Integer input) {
        return javaService.calculate(input);
    }
}