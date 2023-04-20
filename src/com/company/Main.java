package com.company;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Pattern pattern = Pattern.compile("(((\\d|\\d\\d|1\\d\\d|2[0-4]\\d|25[0-5])\\.){3})(25[0-5]|2[0-4]\\d|1\\d\\d|\\d\\d|\\d)");
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Paguro\\IdeaProjects\\lab_13\\log.txt")))
        {
            System.out.println("Input the string");
            String str = in.nextLine();
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()) {
                writer.write(matcher.group() + "\n");
            }
            else {
                writer.write("no IP" + "\n");
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
