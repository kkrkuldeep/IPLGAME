package com.ipl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

public class MatchPlayedPerYear {

    public static void main(String[] args) throws Exception{
        Scanner sn = new Scanner(System.in);

        System.out.println("Match played per year");
        String file = "/home/kuldeep/Downloads/matches.csv";
        System.out.println("************************************************");
        matchPlayedPerYear(file);
        System.out.println("************************************************");


    }

    public static void matchPlayedPerYear(String file) throws  Exception {

        // read a file
        FileReader read = new FileReader(file);
        BufferedReader br = new BufferedReader(read);
        String st = "";


        // Don't read first line
        st = br.readLine();
        HashMap<String,Integer> map = new HashMap<>();

        while ((st = br.readLine()) != null) {

            String[] str = st.split(",");

            // Calculated the Match played by year and Stored in Hashmap
            if (map.containsKey(str[1])) {
                map.put(str[1], map.get(str[1]) + 1);
            } else {
                map.put(str[1], 1);
            }
        }

        // print result here
        System.out.println(map);
    }

}
