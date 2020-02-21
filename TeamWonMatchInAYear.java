package com.ipl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

public class TeamWonMatchInAYear {

    public static void main(String[] args) throws Exception{
        Scanner sn = new Scanner(System.in);

        String file = "/home/kuldeep/Downloads/matches.csv";
        System.out.println("To get Team Won matches in year ");
        System.out.println("Enter the year: ");
        int year1 = sn.nextInt();

        teamWonMatchesPerYear(file,year1);

    }

    public static void teamWonMatchesPerYear (String file, int year) throws Exception {

        // Reading a file
        FileReader read = new FileReader(file);
        BufferedReader br = new BufferedReader(read);
        String st = "";
        int count = 0;

        // Don't read first line
        st = br.readLine();

        // Populate the team who won Matches
        HashMap<String,Integer> map = new HashMap<>();

        while ((st = br.readLine()) != null) {

            // Break lines using Regex Here
            String[] str = st.split(",");

            if ((Integer.valueOf(str[1]) == year)){

                // Fill HashMap Here
                if(map.containsKey(str[10])){
                    map.put(str[10], map.get(str[10]) + 1);
                }else{
                    map.put(str[10], 1);
                }
            }else {

            }
        }

        // Print Result Here
        System.out.println(map);

    }
}
