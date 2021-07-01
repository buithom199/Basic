package ChuoiString;

import java.util.Scanner;

public class Vidu08 {

	public static void main(String[] args) {
	   String chuoiString;
	   char kyTu;
	   int count = 0;
	   Scanner scanner = new Scanner(System.in);
	   
	   System.out.println("Nhập vào một chuỗi bất kỳ");
	   chuoiString = scanner.nextLine();
	   
	   //Duyệt từ đầu đến cuối chuỗi
	   for(int i =0; i<chuoiString.length(); i++) {
		   //Trả về ký tự tại vị trí thứ i trong chuỗi
		   //Và gắn vào cho biến kyTu
		   kyTu = chuoiString.charAt(i);
		   
		   //Kiểm tra ký tự tại vị trí i có phải khoảng trắng không
		   if(Character.isSpace(kyTu)) {
			   count++;
		   }
	   }
	   System.out.println("Số khoảng trắng có trong chuỗi" + chuoiString
			   + "=" +count);

	}
	

}
