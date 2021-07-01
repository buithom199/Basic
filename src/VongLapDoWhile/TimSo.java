package VongLapDoWhile;

import java.util.Scanner;

public class TimSo {

	public static void main(String[] args) {
		int m =0, n, sum = 0;
		Scanner scanner = new Scanner(System.in);
		//Nhập vào số nguyên n
		//Và kiểm tra nếu n < 0 đúng thì quay lại thực hiện câu lệnh bên trong đó
		//Ngược lại thoát ra khỏi vòng lặp
		do {
			System.out.println("Nhập vào số nguyên n:");
			n = scanner.nextInt();
		}while (n < 0);
		
		//Tìm số m
		while((sum + m) < n){
			//Tăng m lên 1 đơn vị và tính sum = sum + m
			sum += ++m;
			//System.out.println(): Hiển thị trên cùng 1 dòng
			System.out.println(m);
			if((sum + m) < n) {
				System.out.println("+");
			}
		}
		if(sum > 0) {
			System.out.println(" = " + sum + "<=" + n);
		}
		System.out.println("m lớn nhất" + m);

	}

}
