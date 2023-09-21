package string_regex;

import java.util.Arrays;

public class string_regex {
    public static void main(String[] args) {
        String fullName = "Trọng Hùng";
        System.out.println(fullName);
        fullName = "Nam béo";
        System.out.println(fullName);

        // So sánh 2 chuỗi
        System.out.println(fullName.equalsIgnoreCase("nam béo"));
//        tìn kiếm chuỗi con trong cha
        System.out.println(fullName.contains("Nam"));

        // chuỗi bắt đầu và kết thúc
        System.out.println(fullName.startsWith("Na"));
        System.out.println(fullName.endsWith("o"));
        // Kiểm tra chuỗi rỗng hay không

        String str = "";
        System.out.println(fullName.isEmpty());


        // tìm kiếm và thay thế chuỗi theo patains

        String conten = "So sánh bằng  trong chuỗi" + " hay trong đối tượng" + " thì phải dùng equals";

        String rs = conten.replace("So sánh bằng  trong chuỗi", "");
        System.out.println(rs);


        // chuyển 1 chuỗi thành mảng
        String numbers="1,2,3,4,5,6";

        String arr[]=numbers.split(",");

        System.out.println(Arrays.toString(arr));

//        chuyển mảng thành chuỗi

      // Loại bỏ khoảng trắng 2 đầu

// bởi vì l 1 mảng kí tự nên có thể duyệt chuỗi
//         sắp xếp
        System.out.println("zz".compareTo("z"));
    }
}
