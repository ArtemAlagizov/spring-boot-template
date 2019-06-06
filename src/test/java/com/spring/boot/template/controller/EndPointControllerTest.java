package com.spring.boot.template.controller;

import com.spring.boot.template.model.Data;
import com.spring.boot.template.service.JavaService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.internal.verification.VerificationModeFactory.times;

@RunWith(MockitoJUnitRunner.class)
public class EndPointControllerTest {
    @InjectMocks
    private EndPointController endPointController;

    @Mock
    private JavaService javaService;


    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
        Data data = new Data();

        data.setValue(8);

        when(javaService.calculate(any())).thenAnswer(invocationOnMock -> data);
    }

    @Test
    public void shouldCallCalculateOfJavaServiceWhenCalculateIsCalled() {
        endPointController.calculate(new Data());

        verify(javaService, times(1)).calculate(any());
    }

    @Test
    public void shouldReturnDataFromJavaServiceWhenCalculateIsCalled() {
        assertTrue(endPointController.calculate(new Data()).getValue() == 8);
    }
}
