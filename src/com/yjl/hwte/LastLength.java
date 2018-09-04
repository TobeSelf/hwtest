package com.yjl.hwte;

import java.util.Scanner;

public class LastLength {

    private static boolean getLastWordLength(byte[] b1,byte[] b2){

       boolean b = true;
       for(int i=0;i<b1.length;i++){
           if(b1[i] != b2[i] ){
               b = false;
               return b;
           }
       }
       return b;
    }

    public static  void main(String[] args){
        Scanner scan  = new Scanner(System.in);
        String s = scan.nextLine().toUpperCase();
        byte[] target= scan.nextLine().toUpperCase().getBytes();
        Integer count = 0;
        for(int i=0;i<s.length();i++){
           Character s1 =  s.charAt(i);
            byte[] gets = s1.toString().getBytes();
            if(target.length == gets.length){
                boolean b = getLastWordLength(target,gets);
                if(b){
                    count++;
                }

            }
        }
        System.out.println(count);
    }
}
