package com.ipl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

public class ExtraRuns {
    public static void main(String[] args) throws Exception {
        Scanner sn = new Scanner(System.in);

        // File Path
        String del = "/home/kuldeep/Downloads/deliveries.csv";
        teamWonMatchesPerYear(del,2015);
    }

    public static void teamWonMatchesPerYear (String del, int year) throws Exception {

        // Reading a file
        FileReader read = new FileReader(del);
        BufferedReader br = new BufferedReader(read);
        String st = "";

        HashMap<String, Integer> map = new HashMap<>();

        st = br.readLine();

        // Populating data here
        while((st = br.readLine()) != null){

            // Split using regex
            String[] str = st.split(",");

            // Count Extra runs here
            if ((Integer.valueOf(str[0]) >= 577 && Integer.valueOf(str[0]) <= 636) ){

                if(map.containsKey(str[3])){
                    map.put(str[3],map.get(str[3]) + Integer.valueOf(str[16]));
                }else{
                    map.put(str[3], Integer.valueOf(str[16]));
                }
            }
        }

        // Print the result of all team of Year ( 2015 )
        System.out.println(map);
    }

}
