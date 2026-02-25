package cau2;

import java.util.Scanner;

public class chenphantu {
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int [] a= new int[n];
        for(int i=0 ;i<n;i++) {
            a[i] = sc.nextInt();
        }
            int index =sc.nextInt();
            int x =sc.nextInt();
                    for(int i=n-1 ;i>index ;i--) {
                        a[i] = a[n - 1];
                    }
                        a[index] =x;
                        for(int i=0 ;i<n;i++){
                            System.out.print(a[i] + "");
                        }



    }
}
