package com.xyz;

import com.Demo;
import org.springframework.stereotype.Component;

@Component
public class DemoImpl implements Demo {
    @Override
    public void foo() {
        System.out.println("DemoImpl BAR....");
    }
}
