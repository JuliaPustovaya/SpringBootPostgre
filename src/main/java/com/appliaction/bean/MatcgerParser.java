package com.appliaction.bean;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcgerParser {

  public static void getRegulars(String nameFilter,String contactName) {
        String pattern = nameFilter.replaceAll(" ","+");
        //String text = "acode 2 alearn java tutorial";
        String text = contactName;
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        while (m.find()) {
            System.out.print(text.substring(m.start(), m.end()) + "*");
        }


    }
}