package com.test.exceptions;

import java.io.IOException;

public class ExceptionApp {
    public static void main(String[] arg){
    
    UserDAO UserDAO = new UserDAO();

    System.out.println("-----E1-----");
    System.out.println(UserDAO.getUserName().orElse("NO DATA"));
    System.out.println("-----------");

    UserDAO.getUserNameById("123");
}
}