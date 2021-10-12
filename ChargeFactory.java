package com.company;

public class ChargeFactory {
    public Charge charging(String str){
        if(str == null || str.isEmpty()){
            return null;
        }
        if("microUSB".equals(str)){
            return new microUSB();
        }
        else if("TypeC".equals(str)){
            return new TypeC();
        }
        else if("Wireless".equals(str)){
            return new Wireless();
        }
        return null;
    }
}
