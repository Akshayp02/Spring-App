package com.akshay;

public class nurse extends Staff {

    public nurse(String qualifiaction) {
        Qualifiaction = qualifiaction;
    }

    public String getQualifiaction() {
        return Qualifiaction;
    }

    private String Qualifiaction;


    void assist(){
        System.out.println("Nurse is Assisting.... ");
    }
}
