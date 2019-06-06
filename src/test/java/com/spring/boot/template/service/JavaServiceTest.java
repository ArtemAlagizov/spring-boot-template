package com.spring.boot.template.service;

import com.spring.boot.template.model.Data;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class JavaServiceTest {
    @InjectMocks
    private JavaService javaService;

    @Test
    public void shallReturn152WhenInputIs8() {
        Data data = new Data();

        data.setValue(8);

        assertTrue(javaService.calculate(data).getValue() == 152);
    }

    @Test
    public void shallReturn0WhenInputIs0() {
        Data data = new Data();

        data.setValue(0);

        assertTrue(javaService.calculate(data).getValue() == 0);
    }

    @Test
    public void shallReturnNegative152WhenInputIsNegative8() {
        Data data = new Data();

        data.setValue(-8);

        assertTrue(javaService.calculate(data).getValue() == -152);
    }
}
