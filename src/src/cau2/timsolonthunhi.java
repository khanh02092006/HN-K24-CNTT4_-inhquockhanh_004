package cau2;

import java.util.Scanner;

public class timsolonthunhi {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for (int i=0;i<n;i++){
            a[i] =sc.nextInt();
        }
        int max1 =a[0];
        int max2 =Integer.MIN_VALUE;
        for(int i =1;i<n;i++){
            if(a[i] >max1){
                max2=max1;
                max1=a[i];
            }else if(a[i] >max2 && a[i] !=max1){
                max2=a[i];
            }
        }
        if(max2 == Integer.MIN_VALUE){
            System.out.println(" không tồn tại so lớn thứ nhì ");
        }else {
            System.out.println("max:" +max1 +"Second :" +max2);
        }
    }
}
