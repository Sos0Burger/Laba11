package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст");
        String ip =in.nextLine();
        
        Pattern pattern = Pattern.compile("(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])(\\.(?!$)|$)){4}");
        Matcher m = pattern.matcher(ip);
        
        if (m.find()){
            System.out.println(m.group());
        }
        else{
            System.out.println("Нет корректного IP");
        }
    }
}
