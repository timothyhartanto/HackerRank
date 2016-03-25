package com.project.fillthejar;

import java.io.*;

public class FillTheJar {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String read = br.readLine();
        String[] split;
        split = read.split(" ");
        double N = Double.parseDouble(split[0]);
        double M = Double.parseDouble(split[1]);
        double result = 0;

        for(int i = 0; i < M; i ++){
            read = br.readLine();
            split = read.split(" ");

            result += ((Double.parseDouble(split[1]) - Double.parseDouble(split[0]) + 1) * Double.parseDouble(split[2]));
         }
        
        result = result / N;
        System.out.println(Math.round(result - 0.5));
	}
}

