package com.example.alberoteam;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
@SpringBootApplication
public class AlberoTeamApplication {

    public static  void main(String[] args) {
        TreeMap<Attaccanti, Integer> treeMap = new TreeMap<>(
                Comparator.comparingInt(Attaccanti -> Attaccanti.goal)
        );

        treeMap.put(new Attaccanti("Cristiano","Ronaldo",903 ,39  ),0);
        treeMap.put(new Attaccanti("Lionel","Messi",844,36),0);
        treeMap.put(new Attaccanti("*Josef","Bican",820,88),0);
        treeMap.put(new Attaccanti("*Edson Arandes","Pelè",757,82),0);
        treeMap.put(new Attaccanti("Romario","De souza faria",746,58),0);
        for (Map.Entry<Attaccanti,Integer> emtry : treeMap.entrySet()) {
            Attaccanti attaccanti = emtry.getKey();
            System.out.println( attaccanti.name + " " + attaccanti.lastname + " ( GOAL fatti : " +attaccanti.goal + " ) , Età -> " +attaccanti.age  );

        }
    }

}
