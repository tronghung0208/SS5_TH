package string_regex;

import java.util.Scanner;

public class stringBuilderDemo {
    public static void main(String[] args) {
        // Khởi tạo đối tượng
//        StringBuilder string = new StringBuilder("Hing hh");
//        StringBuilder string1 = new StringBuilder();
//        StringBuilder string2 = new StringBuilder(20);
//        StringBuilder string3 = new StringBuilder("20dvdv");

//        chèn append()
        // insert: chèn ở vị trí xác định
        // xóa chuỗi con

//        string.delete(2, 4);
//        string.deleteCharAt(2);

//        VD áp dụng

//        cho người dùng nhập vào 1 chuỗi
//            tìm kiếm ra chuỗi con có đ dài lớn nhất
//        mà sắp xếp các kí tự tăng dần
// input:abcdbzjy
//        output: abcd


//        Bước 1:duyệt qua từng kí tự của chuỗi,
//        Bước 2:tìm ra các chuỗi tăng dần,
//        Bước 3:tìm trong danh sách đấy chuỗi nào có đ dài lớn nhất
        System.out.println("Nhập vào chuỗi");
        StringBuilder input = new StringBuilder(new Scanner(System.in).nextLine());
//        System.out.println(System.currentTimeMillis());
//        String arr="";
        for (int i = 0; i < input.length(); i++) {
            StringBuilder subString = new StringBuilder();
            StringBuilder charector=subString.append(input.charAt(i));

            for (int j = i + 1; j < input.length(); j++) {
                if (input.charAt(j - 1) <= input.charAt(j)) {
                    subString.append((input.charAt(j)));
                    System.out.println("b2: "+(-input.charAt(j - 1)+input.charAt(j)));
                } else {
//                    i=j;
                    break;
                }
            }

        }


    }
}
