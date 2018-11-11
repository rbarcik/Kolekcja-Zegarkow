package com.kodilla;

import java.util.*;
import java.lang.*;
import java.io.*;

public class KolekcjaZegarkow {
    public static void main (String[] args) throws java.lang.Exception
    {
        class Clock
        {
            private Integer minutes;

            public Clock (int minutes) {
                this.minutes = minutes;
            }
            public int getMinutes() {
                return this.minutes;
            }
            public void setMinutes(int minutes) {
                this.minutes = minutes;
            }
            public String toString() {
                return "Minutes= " + minutes;
            }
            @Override
            public boolean equals(Object o){
                final Clock cl = (Clock) o;
                return this.minutes.equals(cl.getMinutes());
            }
        }
        //creating Clock objects
        Clock clock1 = new Clock(1);
        Clock clock2 = new Clock(35);
        Clock clock3 = new Clock(24);
        Clock clock4 = new Clock(15);
        //initialising closkList
        LinkedList<Clock> clocksList = new LinkedList<Clock>();
        //adding clocks to the list
        clocksList.add(clock1);
        clocksList.add(clock2);
        clocksList.add(clock3);
        clocksList.add(clock4);
        //displaying clocks
        for(int i=0; i < clocksList.size(); i++) {
            System.out.println("Clock " + (i+1) + " " + clocksList.get(i));
        }
        System.out.println("Minutes after update");
        // updating clocks, adding minutes + 1
        for(int i = 0; i < clocksList.size(); i++) {
            int minInt = (clocksList.get(i).getMinutes()) + 1;
            clocksList.get(i).setMinutes(minInt);
        }
        for(int i=0; i < clocksList.size(); i++) {
            System.out.println("Clock " + (i+1) + " " + clocksList.get(i));
        }
    }
}
