package VongLapWhile;

import java.util.Scanner;

public class TinhTongBinhPhuong {

	public static void main(String[] args) {
		int n = 0, i = 1;
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(n <=0) {
		System.out.println("Nhập vào số nguyên dương n:");
		n = scanner.nextInt();
	}
   while(i <= n) {
	  sum += i*i;
	  i++;
}
System.out.println("Tổng=" + sum);
}
}