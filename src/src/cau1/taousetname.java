package cau1;

import java.util.Scanner;

public class taousetname {
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s =sc.nextLine().trim();
        String[] words = s.split("\\s+");
        for(int i=0;i< words.length;i++){

            String first = words[i].substring(0,1).toLowerCase();
            String rest = words[i].substring(1).toLowerCase();
            words[i] =first +rest;

        }
        System.out.println("tên chuẩn :");
       for(int i=0 ;i< words.length;i++){
           System.out.println(words[i]+"");
       }
        System.out.println();
        System.out.println("Username");
        System.out.print(words[words.length -1]);
        for (int i=0;i< words.length;i++){
            System.out.print(words[i].charAt(0));
        }
    }
}
