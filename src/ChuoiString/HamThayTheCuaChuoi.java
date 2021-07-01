package ChuoiString;

public class HamThayTheCuaChuoi {

	public static void main(String[] args) {
		// Cú pháp: String.replace(char oldChar, char newChar);
		
		String string1 = new String("Happy new year!");
		
		//ký tự thay thế "l" không có trong chuỗi string1
		System.out.println(string1.replace('l', 'r'));
		
		//Thay thế ký tự 'y' trong string1 thành 'r'
		System.out.println("Chuỗi sau khi thay thế là" +
		 string1.replace('y', 'r'));

	}

}
