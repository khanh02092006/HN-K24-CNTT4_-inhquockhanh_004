package cau1;

import java.util.Scanner;

public class demnguyenamvaphuam {
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s = sc.nextLine();
        int na =0 , pa = 0;
        for( int i =0 ;i< s.length();i++){
            char c = Character.toLowerCase(s.charAt(i));
            if( c >= 'a' && c<= 'z'){
                if(c== 'a' || c== 'e' ||c== 'i' || c=='0' || c=='u'  ){
                    na++;
                } else {
                    pa++;
                }
            }
        }
        if(na >pa){
            System.out.println(" nguyên âm lớn hơn (nguyên âm:  " + na + "phụ âm: "+ pa +" )");
        }else if (pa >na){
            System.out.println( " phụ âm nhiều hơn (nguyên âm : " +na + "phụ âm "+pa +")");
        }else {
            System.out.println(" bằng nhau ");
        }
    }

}
