package ChuoiString;

import java.util.Scanner;

public class Vidu06 {

	public static void main(String[] args) {
		int n;
		String chuoiString;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhập vào chuỗi bất kỳ");
		chuoiString = scanner.nextLine();
		System.out.println("Nhập vào số nguyên");
		n = scanner.nextInt();
		
		if(n<2) {
			System.out.println(chuoiString);
		}else {
			for(int i =0; i<n; i++) {
				//in chuỗi trên cùng một dòng
				System.out.println(chuoiString);
			}
		}

	}

}
