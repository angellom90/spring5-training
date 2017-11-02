package com.angello.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by Angello Manrique on 5/23/17.
 */
@Controller
public class MyController {

    public String hello(){
        System.out.println("Hello!!! ");

        return "foo";
    }
}
