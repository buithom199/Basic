package ChuoiString;

import java.util.Scanner;

public class Vidu09 {

	public static void main(String[] args) {
		String chuoiString;
		char kyTu;
		Scanner scanner =  new Scanner(System.in);
		
		System.out.println("Nhập vào một chuỗi bất kỳ");
		chuoiString = scanner.nextLine();
		
		for(int i =0; i<chuoiString.length(); i++) {
			kyTu = chuoiString.charAt(i);
			
			//Kiểm tra ký tự có phải là khoảng trắng không
			if(Character.isSpace(kyTu)) {
				//Nếu ký tự đó là khoảng trắng thì xuống dòng
				System.out.println();
			}else {
				//Nếu ký tự đó không là khoảng trắng
				//thì hiển thị ký tự đó trên 1 dòng
				//cho đến khi gặp khoảng trắng thì xuống dòng
			}
			System.out.println(kyTu);
		}

	}

}
