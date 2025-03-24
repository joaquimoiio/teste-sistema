package com.example.teste.endidy;

import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class calculadoraTest {
    @InjectMocks
    private calculadora calculadora;
    @Mock
    private calculadora calculadoraMock;
    @BeforeEach
    void setup(){
        MockitoAnnotations.openMocks(this);
        calculadora = new calculadora();
    }
}
