package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст");
        String ip =in.nextLine();

        boolean isFind;
        int mathcesCount = 0;
        
        Pattern pattern = Pattern.compile("((^|\\s)(([1-9]?\\d|1\\d\\d|2[0-5][0-5]|2[0-4]\\d)\\.){3}([1-9]?\\d|1\\d\\d|2[0-5][0-5]|2[0-4]\\d))");
        Matcher m = pattern.matcher(ip);
        
        while(isFind = m.find()){
            if(isFind) {
                System.out.println((m.group()).replace(" ", ""));
                mathcesCount++;
            }
            if(mathcesCount == 0){
                System.out.println("Нет корректного IP");
                break;
            }
        }
    }
}
