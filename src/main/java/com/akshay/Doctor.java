package com.akshay;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

public class Doctor  extends  Staff{



    public String getQualifiaction() {
        return Qualifiaction;
    }

    public void setQualifiaction(String qualifiaction) {
        Qualifiaction = qualifiaction;
    }

    // property Injection
    private String Qualifiaction;

    void assist(){
        System.out.println("Doctor is Assisting.... ");
    }
}
