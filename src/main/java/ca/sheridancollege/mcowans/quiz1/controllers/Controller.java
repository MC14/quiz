package ca.sheridancollege.mcowans.quiz1.controllers;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Controller {

    Random rand = new Random();

    int amount = rand.nextInt(1,9);

    ArrayList<Integer> StartTable = new ArrayList<>();

    void addnewTable(ArrayList<Integer> Table, int amount)
    {
        int i = 0;
        while ( i < amount)
        {

            int num = rand.nextInt(1,9);
            Table.add(num);
            i++;
        }
    }

    public List<Integer> getStart()
    {
        return StartTable;
    }
    //Allows you to get the Table in order to pass it through as an attribute to be used in the table html


    @GetMapping("/")
    public String index(Model model)
    {
        addnewTable(StartTable, amount);
        model.addAttribute("tablenum", getStart());
       return "index";
    }

    @PostMapping("/result")
    public String result(Model model, @ModelAttribute int choice)
    {
        for (int i : StartTable){
            i = i * choice;
        }
        model.addAttribute("tablenum", getStart());
        return "result";
    }
    //Gets the choice from the select in html and uses it to multiply each
}
