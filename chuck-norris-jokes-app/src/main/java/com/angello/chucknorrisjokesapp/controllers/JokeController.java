package com.angello.chucknorrisjokesapp.controllers;

import com.angello.chucknorrisjokesapp.services.JokeService;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private JokeService jokeService;

//    @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/",""})
//    @RequestMapping("/jokes")
    public String printJoke(Model model){
        System.out.println("Quote called");
        model.addAttribute("joke", jokeService.getJoke());
        return "chucknorris";
    }
}
