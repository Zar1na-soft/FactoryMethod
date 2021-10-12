package com.company;

public class microUSB implements Charge{
    @Override
    public void charge() {
        System.out.println("Charge type:microUSB. Successful.");
    }
}
