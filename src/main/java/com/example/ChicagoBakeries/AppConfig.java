package com.example.ChicagoBakeries;

import org.springframework.context.annotation.Bean;

import java.awt.*;

public class AppConfig {

    @Bean(name = "iBakeryValidator")
    public BakeryValidator createBakeryValidator() { return new BakeryValidator(); }

    @Bean(name = "iBakery")
    public Bakery createBakery() { return new Bakery(); }

    @Bean(name = "iFlowControl")
    public FlowControl createFlowControl() {
        return new FlowControl(createBakeryValidator(), createBakery());
    }
}
