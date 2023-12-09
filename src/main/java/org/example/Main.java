package org.example;

import org.example.controller.AuthController;
import org.example.db.DataBase;
import org.example.db.InitDataBase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        DataBase.initTable();

        InitDataBase.adminInit();
        InitDataBase.addCompanyCard();

//        AuthController authController = new AuthController();
//        authController.start();



        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        AuthController authController = (AuthController) applicationContext.getBean("authController");
        authController.start();


    }
}
