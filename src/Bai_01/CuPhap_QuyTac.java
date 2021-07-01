package Bai_01;

import java.util.Scanner;

public class CuPhap_QuyTac {
	
	// Quy tắc chung
	// 1. Nên khai báo có ý nghĩa và thể hiện được mục đích cùa file/biến/phương thức
	// 2. Tên khai báo không nên dài quá 20 ký tự hoặc có thể ít hơn nhưng phải đảm bảo đầy đủ về mặt ý nghĩa của nó, tên cũng ko dc quá dài quá ngắn
//	public static void main (String[] args) {
//		String tenString;
//		Scanner scanner = new Scanner(System.in);
//		//Hiễn thị dòng thông báo và xuống dòng
//		System.out.println("Mời bạn nhập vào chuỗi");
//		tenString = scanner.nextLine();
//		//Hiển thị chuỗi
//		System.out.println("Chào mừng bạn" + tenString + "đến với Freetuts.net!");
//	}
	
	public static void main(String[] args) {
//        String ten;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Mời bạn nhập vào chuỗi: "); // hiển thị dòng thông báo và xuống dòng
//        ten = scanner.nextLine();
//        // hiển thị chuỗi
//        System.out.println("Chào mừng bạn " + ten + " đến với Freetuts.net!");
        System.out.println("Tab: " + "Welcome\tto Freetuts!");
        System.out.println("Backspace: " + "Welcome to\b Freetuts!");
        System.out.println("New line: " + "Welcome\nto Freetuts!"); 
        System.out.println("Welcome to\rFreetuts!"); // /r
        System.out.println("Single quote: " + "Welcome to\'Freetuts!");
        System.out.println("Double quote: " + "Welcome to\''Freetuts!");
        System.out.println("Backslash: " + "Welcome to\\Freetuts!");
    }

}
