package com.umesh.example.MyFirstProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Zoo {

    @Autowired
    private Bird bird;

    @Autowired
     private Fish fish;

    @GetMapping("zoo")
    public String getBirdSound(){

        return bird.chirp();
    }

    @GetMapping("fish")
    public String fish(){

        return fish.swim();
    }


}
