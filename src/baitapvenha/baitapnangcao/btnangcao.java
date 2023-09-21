package baitapvenha.baitapnangcao;

import java.util.Scanner;

public class btnangcao {
    public static Scanner sc = new Scanner(System.in);
    public static String regexPatternEmail = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";

    /**
     * Cho phép các ký tự số từ 0 đến 9
     * Cho phép cả chữ hoa và chữ thường từ a đến z
     * Cho phép các ký tự đặc biệt gạch dưới “_”, gạch nối “-” và dấu chấm “.”
     * Dấu chấm không được phép ở đầu và cuối phần local part
     * Các dấu chấm liền nhau sẽ vi phạm
     * Đối với phần local part, số lượng ký tự đối ta là 64
     **/

    //Số diện thoại
    public static String regexPatternPhone = "^(0[0-9]{9}|84[0-9]{9}|\\\\+848[0-9]{8}|\\\\+849[0-9]{8})$";
    // Ngày tháng năm
    public static String regexPatternDate = "(0[1-9]|1[0-9]|2[0-9]|3[0-1]|[1-9])/(0[1-9]|1[0-2]|[1-9])/([0-9]{4})";

    // Mật khẩu
    public static String regexPatternPass = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$";

    // kiểm tra số
    public static String regexPatternNumber="\\d+";

    public static void main(String[] args) {

        // tạo lớp Validation kiểm tra sự chính xác của các dữ liệu sau :
        // email : gmail.com
        // số điện thoai : vietnam
        // mật khẩu : bảo mật cao
        // ngày tháng năm : dd/MM/yyyy
        // validate chuỗi nhập vào có phải
        // là số không  "217864" : bắt người dùng nhập đến khi nhập đúng số
        // thị mới hiển thị, nếu ko là số thì nhâp lại ;


        System.out.println("Nhập lựa chọn");
        int choice = Integer.parseInt(sc.nextLine());

        switch (choice) {
            case 1:
                checkEmail();
                break;
            case 2:
                checkPhone();
                break;
            case 3:
                checkDate();
                break;
            case 4:
                checkPass();
                break;
            case 5:
                checkNumber();
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ");
                break;

        }


    }

    public static void checkEmail() {
        while (true) {
            System.out.println("Nhập vào Email: ");
            String email = sc.nextLine();
            if (email.matches(regexPatternEmail)) {
                System.out.println("Email hợp lệ");
                break;
            } else {
                System.out.println("Email không hợp lệ, mời nhập lại");
            }
        }
    }

    public static void checkPhone() {
        while (true) {
            System.out.println("Nhập vào phone number: ");
            String phoneNumber = sc.nextLine();

            if (phoneNumber.matches(regexPatternPhone)) {
                System.out.println("Số điện thoại hợp lệ");
                break;

            } else {
                System.out.println("Số điện thoại không hợp lệ, yêu cầu nhập lại");
            }

        }
    }

    public static void checkDate() {
        while (true) {
            System.out.println("Nhập vào ngày tháng năm: ");
            String date = sc.nextLine();

            if (date.matches(regexPatternDate)) {
                System.out.println("Ngày hợp lệ");
                break;
            } else {
                System.out.println("Ngày không hợp lệ, yêu cầu nhập lại");
            }
        }
    }
    public static void checkPass() {
        while (true) {
            System.out.println("Nhập mật khẩu vào: ");
            String passWord = sc.nextLine();

            if (passWord.matches(regexPatternPass)) {
                System.out.println("Mật khẩu hợp lệ");
                break;
            } else {
                System.out.println("Mật khẩu không hợp lệ, yêu cầu nhập lại");
            }
        }
    }
    public static void checkNumber() {
        while (true) {
            System.out.println("Nhập vào chuỗi số: ");
            String passWord = sc.nextLine();

            if (passWord.matches(regexPatternNumber)) {
                System.out.println("Chuỗi là chuỗi số");
                break;
            } else {
                System.out.println("Chuỗi không phải là chuỗi số, yêu cầu nhập lại");
            }
        }
    }
}
