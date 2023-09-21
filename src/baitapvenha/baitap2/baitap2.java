package baitapvenha.baitap2;

import java.util.Scanner;

public class baitap2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập chuỗi 1");
        String str1=sc.nextLine();
        System.out.println("Nhập chuỗi 2");
        String str2=sc.nextLine();

        if (str1.equals(str2)){

            System.out.println("chuỗi giống nhau");
        }else {
            System.out.println("chuỗi khác nhau");
        }

    }
}
