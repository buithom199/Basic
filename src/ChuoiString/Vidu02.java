package ChuoiString;

import java.util.Scanner;

public class Vidu02 {

	public static void main(String[] args) {
		String chuoiString;
		int soKyTuInHoa = 0, soKyTuInThuong = 0, soChuSo = 0;
		Scanner scanner = new Scanner(System.in);
		
		//Nếu độ dài chuỗi nhập vào còn lớn hơn 80 thì phải nhập lại
		do {
			System.out.println("Nhập vào 1 chuỗi bất kỳ:");
			chuoiString = scanner.nextLine();
		}while(chuoiString.length() >80);
		
		//Dếm và in ra số lần đầu xuất hiện của ký tự đó trong chuỗi
		//Duyệt từ đầu đến cuối chuỗi
		//Nếu có ký tự nào tại vị tri i bằng với ký tự ch thì tăng biến count lên 1
		for(int i =0; i<chuoiString.length(); i++) {
			//Hàm isUpperCase() là hàm dùng để kiểm tra ký tự tại vị trí i
			//Có phải là ký tự in hoa hay không
			if(Character.isUpperCase(chuoiString.charAt(i))){
				soKyTuInHoa++;
			}
			
			//Hàm isLowerCase() là hàm dùng để kiểm tra ký tự tại vị trí i
			//Có phải là ký tự in hoa hay không
			if(Character.isLowerCase(chuoiString.charAt(i))) {
				soKyTuInThuong++;
			}
			
			//Hàm isDigit() là hàm dùng để kiểm tra ký tự tại vị trí i
			//Có phải là số hay không
			if(Character.isDigit(chuoiString.charAt(i))) {
				soChuSo++;
			}
		}
		System.out.println("Trong chuỗi" + chuoiString + "có" + soKyTuInHoa
				+ "ký tự in hoa, " + "có" +soKyTuInThuong + "ký tự in thường"+
				"và có"+ soChuSo + "số");

	}

}
