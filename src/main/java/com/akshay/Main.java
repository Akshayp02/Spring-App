package com.akshay;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {


    public static void main(String[] args) {
        /* the Normal way we work with the class and OBJ
         here we create new OBJ of Doctor class but pblm is here that we
         manully need to Distroy that object

        Doctor doctor = new Doctor();
        doctor.assist();

        */

        //  ############ BY Using Spring #############

  /*      ApplicationContext context =
                new ClassPathXmlApplicationContext("spring.xml");

        // XML Base Configuration
        Doctor doctor = context.getBean(Doctor.class);
        doctor.assist();
        System.out.println(doctor.getQualifiaction());


        nurse Nurse = context.getBean(nurse.class);
        Nurse.assist();
        System.out.println(Nurse.getQualifiaction());

*/

        //################## Annotation base Configuration ########

     /*   ApplicationContext context =
                new ClassPathXmlApplicationContext("spring.xml");

        // XML Base Configuration
        Doctor doctor = context.getBean(Doctor.class);
        doctor.assist();
        System.out.println(doctor.getQualifiaction());


*/

        // ########################### Java base Annotation


        ApplicationContext context =
                new AnnotationConfigApplicationContext(beanConfig.class);

        Doctor doctor = context.getBean(Doctor.class);
        doctor.assist();
        System.out.println(doctor.getQualifiaction());


    }
}