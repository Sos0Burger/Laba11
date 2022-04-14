package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String ip = "Айпи 125.255.1.1";
        Pattern pattern = Pattern.compile("\\D|^(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])(\\.(?!$)|$)){4}");
        Matcher m = pattern.matcher(ip);
        if (m.find()){
            System.out.println(m.group());
        }
        else{
            System.out.println("Нет корректного IP");
        }
    }
}
