package Bai_04_HangSo;

public class ConstantError {
//Khai báo hằng số
	public static String CHUOI = "Hello Freetuts";
	public static void main(String[] args) {
		System.out.println(CHUOI);
		
		//Thay đổi giá trị biến CHUOI
		CHUOI = "Welcome to Freetuts!";
		System.out.println(CHUOI);

	}

}
