package com.sixdee.test.interviewbit.strings;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

import com.sixdee.fw.util.StringUtils;

public class CompareVersionNumbers {

	
	private static void compare(String v1, String v2) {
		v1 = v1.replaceAll("\\s", "");
        v2 = v2.replaceAll("\\s", "");
        String[] a1 = v1.split("\\.");
        String[] a2 = v2.split("\\.");
        List<String> l1 = Arrays.asList(a1);
        List<String> l2 = Arrays.asList(a2);


        int i=0;
        while(true){
            Double d1 = null;
            Double d2 = null;

            try{
                d1 = Double.parseDouble(l1.get(i));
            }catch(IndexOutOfBoundsException e){
            }

            try{
                d2 = Double.parseDouble(l2.get(i));
            }catch(IndexOutOfBoundsException e){
            }

            if (d1 != null && d2 != null) {
                if (d1.doubleValue() > d2.doubleValue()) {
                   // return 1;
                } else if (d1.doubleValue() < d2.doubleValue()) {
                   // return -1;
                }
            } else if (d2 == null && d1 != null) {
                if (d1.doubleValue() > 0) {
                   // return 1;
                }
            } else if (d1 == null && d2 != null) {
                if (d2.doubleValue() > 0) {
                   // return -1;
                }
            } else {
                break;
            }
            i++;
        }
       // return 0;

	}

}
