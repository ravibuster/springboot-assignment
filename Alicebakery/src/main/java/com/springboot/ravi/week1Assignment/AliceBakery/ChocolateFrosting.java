package com.springboot.ravi.week1Assignment.AliceBakery;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "Frosting", havingValue = "Chocolate")
public class ChocolateFrosting implements Frosting{

    @Override
    public String getFrostingType() {
        return "Chocolate";
    }
}
