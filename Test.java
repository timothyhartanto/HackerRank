package com.project.test;

import java.io.*;

public class Test {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String read = br.readLine();
        String[] split;
        split = read.split(" ");
        double N = Double.parseDouble(split[0]);
        double M = Double.parseDouble(split[1]);
        double result = 0;

//        double[] a = new double[(int) M];
//        double[] b = new double[(int) M];
//        double[] k = new double[(int) M];
        
        for(int i = 0; i < M; i ++){
            read = br.readLine();
            split = read.split(" ");
//            a[i] = Integer.parseInt(split[0]);
//            b[i] = Integer.parseInt(split[1]);
//            k[i] = Integer.parseInt(split[2]);
            
            result += ((Double.parseDouble(split[1]) - Double.parseDouble(split[0]) + 1) * Double.parseDouble(split[2]));
            //result += ((b[i] - a[i] + 1) * k[i]);
         }
        
        result = result / N;
        System.out.println(Math.round(result - 0.5));
        //Double d = Double.valueOf(result);
        //System.out.println(Integer.valueOf(Double.valueOf(result).intValue()));
	}
}

//Date d = new Date(9, 4, 1980);
//
//Friend f = new Friend("Stephen");
//f.setDate(d);
//
//f.setEmail("a.b@c");
//System.out.println(f);
//System.out.println("\n");
//
//f.setEmail("a@b.c");
//System.out.println(f);
//System.out.println("\n");
//
//f.setEmail("a.b.c");
//System.out.println(f);
//System.out.println("\n");
