package ChuoiString;

import java.util.Scanner;

public class HamXacDinhDoDaiChuoiKyTu {

	public static void main(String[] args) {
		// Cú pháp: int length = tên_chuỗi.length();
		String chuoiString;
		int doDai;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhập vào chuỗi bất kỳ từ bàn phím:");
		chuoiString = scanner.nextLine();
		
		//Tính độ dài chuỗi
		doDai = chuoiString.length();
		
		System.out.println("Chuỗi" + chuoiString + "có độ dài =" + doDai);

	}

}
