package ChuoiString;

public class HamViTriCuoiCungCuaChuoi {

	public static void main(String[] args) {
		//Cú pháp: int result = string1.lastIndexOf(String string2)
		
		int result;
		String string1 = "Happy new year and new year!";
		String string2 = "new year!";
		
		result = string1.lastIndexOf(string2);
		System.out.println("Vị trí cuối cùng xuất hiện chuỗi" + string2 +
				"trong chuổi" + string1 + "=" + result);

	}

}
