package com.ipl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EconomicalBlowerOfYear {
    public static void main(String[] args) throws Exception{

        Scanner sn = new Scanner(System.in);

        // File Path
        String file = "/home/kuldeep/Downloads/deliveries.csv";

        // Call method here
        topEconomyBolwer(file,2015);


    }

    public static void topEconomyBolwer(String file, int year) throws Exception{

        String st = "";
        FileReader file1 = new FileReader(file);
        BufferedReader br = new BufferedReader(file1);

        HashMap<String, Integer> map = new HashMap<>(); //Store Bowler name and Runs
        HashMap<String, Integer> nab = new HashMap<>(); //Store name and Bowls
        HashMap<String, Float> ans = new HashMap<>(); //Store Economy

        //Skip Not necessary
        st = br.readLine();

        // Start readLine
        while((st = br.readLine()) != null) {

            // Split where ',' occur
            String[] str = st.split(",");

            // give the correct year
            if (Integer.valueOf(str[0]) >= 518 && Integer.valueOf(str[0]) <= 576 ) {

                // Build Data here
                if (map.containsKey(str[8])) {
                    map.put(str[8], map.get(str[8]) + Integer.valueOf(str[17]));
                    nab.put(str[8], nab.get(str[8]) + 1);
                } else {
                    map.put(str[8], 1);
                    nab.put(str[8], 1);
                }
            }else{

            }
        }

            // Calculating Min Value
            float min = Float.MAX_VALUE;
            String BowlerName = "";

            for(String s : map.keySet()){

                // calculate Economy
                float avg = (float)(map.get(s) / (float)(nab.get(s) / 6));

                // Make A map of Economy
                ans.put(s,avg);

                if(avg <= min){
                    min = avg;
                    BowlerName = s;
                }
            }

            // J Yadav
            System.out.println(BowlerName);

    }

}
