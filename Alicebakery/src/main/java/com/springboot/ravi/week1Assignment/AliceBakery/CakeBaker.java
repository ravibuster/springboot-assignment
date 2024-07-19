package com.springboot.ravi.week1Assignment.AliceBakery;

import org.springframework.stereotype.Service;

@Service
public class CakeBaker {
     private Frosting frosting;
     private Syrup syrup;

    public CakeBaker(Syrup syrup, Frosting frosting) {
        this.syrup = syrup;
        this.frosting = frosting;
    }

    public void bakeCake(){
        System.out.println("cake is being prepared with " + frosting.getFrostingType()+" Frosting"+" and " + syrup.getSyrupType()+" syrup");
    }
}
