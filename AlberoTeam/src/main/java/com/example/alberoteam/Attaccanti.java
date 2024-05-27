package com.example.alberoteam;



public class Attaccanti implements Comparable<Attaccanti> {
     String name;
     String lastname;
     int goal;
     int age;

    public Attaccanti(String name, String lastname, int goal, int age) {
        this.name = name;
        this.lastname = lastname;
        this.goal = goal;
        this.age = age;
    }

    @Override
    public int compareTo(Attaccanti otherAttaccanti) {
        return Integer.compare(otherAttaccanti.goal, this.goal);
    }
}
