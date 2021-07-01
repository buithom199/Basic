package ChuoiString;

public class HamLoaiBoKhoangTrangDauCuoi {

	public static void main(String[] args) {
		// Cú pháp: String string1 = string1.trim();
		
		String string1 = new String("  Welcome to Freetuts.net!   ");
		
		//Loại bỏ các khoản trắng thừa trong chuỗi string1
		string1 = string1.trim();
		
		System.out.println("Chuỗi sau khi loại bỏ khoảng trắng thừa là" + string1);

	}

}
