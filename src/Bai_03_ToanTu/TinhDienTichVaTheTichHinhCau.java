package Bai_03_ToanTu;

import java.text.DecimalFormat;
import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

public class TinhDienTichVaTheTichHinhCau {
	public static final float PI = 3.14f;   // khai báo hằng số
    
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
         
	        // Khai báo lớp DecimalFormat dùng để định dạng số
	        DecimalFormat decimalFormat = new DecimalFormat("#.##");
	         
	        System.out.println("Nhập vào bán kính hình cầu (r > 0): ");
	        float radius = scanner.nextFloat();
	         
	        // Tính diện tích bề mặt hình cầu
	        float area = 4 * PI * radius * radius;
	        System.out.println("Diện tích hình cầu = " + decimalFormat.format(area));
	         
	        /*
	         *  Tính thể tích hình cầu
	         *  Lưu ý phải ép kiểu kết quả của 4/3 về số thực nếu không sẽ dẫn đến sai kết quả
	         */
	        float vol = (float)4/3 * PI * radius * radius * radius;
	        System.out.println("Thể tích hình cầu = " + decimalFormat.format(vol));
	    }
	 

}
