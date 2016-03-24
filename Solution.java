import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String words[] = s.split("");
        String alphabet[] = new String[26];
        Arrays.fill(alphabet, " ");
        
        for(int i = 1; i < words.length; i++){
            switch(words[i].toLowerCase()){
                case "a":
                	alphabet[0] = "a";
                break;
                case "b":
                	alphabet[1] = "b";
                break;
                case "c":
                	alphabet[2] = "c";
                break;
                case "d":
                	alphabet[3] = "d";
                break;
                case "e":
                	alphabet[4] = "e";
                break;
                case "f":
                	alphabet[5] = "f";
                break;
                case "g":
                	alphabet[6] = "g";
                break;
                case "h":
                	alphabet[7] = "h";
                break;
                case "i":
                	alphabet[8] = "i";
                break;
                case "j":
                	alphabet[9] = "j";
                break;
                case "k":
                	alphabet[10] = "k";
                break;
                case "l":
                	alphabet[11] = "l";
                break;
                case "m":
                	alphabet[12] = "m";
                break;
                case "n":
                	alphabet[13] = "n";
                break;
                case "o":
                	alphabet[14] = "o";
                break;
                case "p":
                	alphabet[15] = "p";
                break;
                case "q":
                	alphabet[16] = "q";
                break;
                case "r":
                	alphabet[17] = "r";
                break;
                case "s":
                	alphabet[18] = "s";
                break;
                case "t":
                	alphabet[19] = "t";
                break;
                case "u":
                	alphabet[20] = "u";
                break;
                case "v":
                	alphabet[21] = "v";
                break;
                case "w":
                	alphabet[22] = "w";
                break;
                case "x":
                	alphabet[23] = "x";
                break;
                case "y":
                	alphabet[24] = "y";
                break;
                case "z":
                	alphabet[25] = "z";
                break;
            }
            
        }
        
        int len = 0;
        for(int i =0; i < alphabet.length; i++){
        	if(alphabet[i].compareTo(" ") == 0){
        		len++;
        	}
        }
        if(len == 0){
        	System.out.println("pangram");
        }
        else{
        	System.out.println("not pangram");
        }
        
    }
}
