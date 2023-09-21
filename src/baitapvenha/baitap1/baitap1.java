package baitapvenha.baitap1;

import java.util.Scanner;

public class baitap1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập chuỗi");
        String str=sc.nextLine();
         if (str.isEmpty()){
             System.out.println("chuỗi rỗng");
         }else {
             System.out.println("chuỗi có giá trị");
         }

    }
}
