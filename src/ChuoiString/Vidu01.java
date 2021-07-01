package ChuoiString;

import java.awt.Choice;
import java.util.Scanner;

public class Vidu01 {

	public static void main(String[] args) {
		String chuoiString ;
		char kyTu;
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		
		//Nếu độ dài chuỗi nhập vào còn lớn hơn 80 thì phải nhập lại
		do {
			System.out.println("Nhập vào 1 chuỗi bất kỳ");
			chuoiString = scanner.nextLine();
		}while(chuoiString.length() > 80);
		
		System.out.println("Nhập vào ký tự cần đếm số lần xuất hiện");
		kyTu = scanner.next().charAt(0);
		
		//Đếm và in ra số lần xut61 hiện của ký tự đó trong chuỗi
		//Duyệt từ đầu đến cuối chuỗi
		//Nếu có ký tự nào tại vị trí i bằng với ký tự ch thì tăng biến count lên 1
		for (int i =0; i<chuoiString.length(); i++) {
			if(kyTu == chuoiString.charAt(i)) {
				count++;
			}
		}
		System.out.println("Số lần xuất hiện của ký tự" + kyTu + "trong chuỗi" + chuoiString + "=" +count);
	}
	

}
