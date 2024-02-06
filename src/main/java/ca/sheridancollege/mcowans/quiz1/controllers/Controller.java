package ca.sheridancollege.mcowans.quiz1.controllers;


import ca.sheridancollege.mcowans.quiz1.beans.Tablenum;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Random;

public class Controller {

    ArrayList<Integer> Tableamount = new ArrayList<Integer>();
    Random rand = new Random();
    @GetMapping("/")
    public String index()
    {
        int amount = rand.nextInt(1,9);




       return "index";
    }
}
