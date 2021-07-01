package BreakAndContinue;

import java.util.Scanner;

public class Break {

	public static void main(String[] args) {
		int i, sum = 0;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("Nhập vào số");
			i = scanner.nextInt();
			
			//Nếu số nhập < 0 thì sẽ kết thúc vòng lặp
			//Và thực hiện câu lệnh bên ngoài vòng lặp
			
			if(i<0) {
				break;
			}
			sum += i;
			//i còn lớn hơn hoặc bằng 0 thì tiếp tục
		}while (i >= 0);
		System.out.println("Kết quả =" + sum);

	}

}
