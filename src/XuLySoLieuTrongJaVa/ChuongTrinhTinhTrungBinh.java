package XuLySoLieuTrongJaVa;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class ChuongTrinhTinhTrungBinh {

	public static void main(String[] args) {
		float number = 0, soTB, tong = 0;
		int n=9;
		Scanner scanner = new Scanner(System.in);
		
		//nhập vào 9 số thực bất kỳ từ bàn phím
		for(int i =0; i<n; i++) {
			System.out.println("Nhập vào số thực" + i+ ":");
			number =scanner.nextFloat();
			tong += number;
		}
		
		//tính số trung bình
		soTB = tong/n;
		
		//định dạng soTB ở dạng
		//dùng dấu chấm phẩy để phân cách phần thập phân và phần nguyên của số đó
		//bằng cách sử dụng phương thức setDecimalSeperator() của DecimalFormatSymbols
		DecimalFormatSymbols symbols = DecimalFormatSymbols.getInstance();
		symbols.setDecimalSeparator(';');
		String patternString = "#.###";
		//làm tròn đến 3 chử số phần thập phân và có dấu chấm phẩy ngăn cách
		DecimalFormat dcFormat = new DecimalFormat(patternString,symbols);
		String stbSrString = dcFormat.format(soTB);
		System.out.println("Trung bình của 10 số vừa nhập = " + stbSrString);

	}

}
