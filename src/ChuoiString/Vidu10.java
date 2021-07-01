package ChuoiString;

import java.util.Scanner;

public class Vidu10 {

	public static void main(String[] args) {
		String chuoiString;
		char kyTu;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhập một chuỗi bất kỳ");
		chuoiString = scanner.nextLine();
		
		for(int i = 0 ; i< chuoiString.length(); i++) {
			kyTu = chuoiString.charAt(chuoiString.length()-i -1);
			//Kiểm tra ký tự tại vị trí i
			//Có giống với ký tự tại vị trí (chuoiString.length() - i -1) hay không
			if(chuoiString.charAt(i) == kyTu) {
				System.out.println("Chuỗi này là chuỗi Panlyndrome");
				break;
			}else {
				System.out.println("Chuỗi này không là chuỗi Panlyndrome");
				break;
			}
		}

	}

}
