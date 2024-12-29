package com.umesh.example.MyFirstProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @Autowired CalculatorService calculatorService;

    @GetMapping("/add")

    public double addition(@RequestParam double a,@RequestParam double b){

        return calculatorService.add(a,b);
    }

    @GetMapping("/sub")

    public double substraction(@RequestParam double a,@RequestParam double b){

        return calculatorService.sub(a,b);
    }
    @GetMapping("/multi")

    public double multiplication(@RequestParam double a,@RequestParam double b){

        return calculatorService.multi(a,b);

    }
    @GetMapping("/divide")
    public double divide(@RequestParam double a, @RequestParam double b) {
        return calculatorService.div(a, b);
    }
}
