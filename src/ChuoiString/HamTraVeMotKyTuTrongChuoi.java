package ChuoiString;

public class HamTraVeMotKyTuTrongChuoi {

	public static void main(String[] args) {
		// Cú pháp: char character = chuoi.charAt (int index);
		String chuoiString = "Happy new year!";
		
		//Trả về ký tự có chỉ số là 4 trong chuỗi
		//Ký tự 'H' có chỉ số là 0
		//Nên ký tự có chỉ số 4 là ký tự 'y'
		
		char character = chuoiString.charAt(4);
		System.out.println(character);

	}

}
