package ca.sheridancollege.mcowans.quiz1.beans;

import java.util.ArrayList;
import java.util.Random;

public class Tablenum {

    ArrayList<Integer> Tableamount = new ArrayList<Integer>();

    Random rand = new Random();

    void addnewTable(int amount)
    {
        int i = 0;
        while ( i < amount)
        {

            int num = rand.nextInt(1,9);
            Tableamount.add(num);
            i++;
        }
    }
}
