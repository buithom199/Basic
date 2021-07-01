package VongLapWhile;

import java.util.Scanner;

public class TinhGiaiThua {

	public static void main(String[] args) {
		int n, temp = 1;
		long giaiTthua = 1;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhập vào số n:");
		n = scanner.nextInt();
		
		while((n <= 0) || (n>10)) {
			System.out.println("Nhập lại số n");
			n = scanner.nextInt();
		}
		//Nếu giá trị biến temp còn nhỏ hong7 hoặc bằng n
		//thì còn thực hiện đoạn lệnh bên trong while
		while(temp <= n) {
			giaiTthua *= temp;
			temp++;
		}
		System.out.println( n + "! = " + giaiTthua);

	}

}
