package ChuoiString;

import java.util.Scanner;

public class Vidu07 {

	public static void main(String[] args) {
		String chuoiString;
		char kyTu;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhập vào chuỗi bất kỳ");
		chuoiString = scanner.nextLine();
		
		System.out.println("Các ký tự có trong chuỗi là");
		for(int i =0; i< chuoiString.length(); i++) {
			//Trả về ký tự tại vị trí thứ i trong chuỗi
			//Và gán vào cho biến kyTu
			//i chạy từ 0 đến vị trí độ dài của chuỗi -1
			kyTu = chuoiString.charAt(i);
			System.out.println(kyTu);
		}

	}

}
