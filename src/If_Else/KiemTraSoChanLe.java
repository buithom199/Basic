package If_Else;

import java.util.Scanner;

public class KiemTraSoChanLe {

	public static void main(String[] args) {
		int number;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào số cần kiểm tra");
		number = scanner.nextInt();
		
		//Số chẵn là số chia hết cho 2
		if(number % 2 == 0) {
			System.out.print(number + "là số chẵn");
		}else {
			//Ngược lại là số lẻ
			System.out.print(number + "là số lẻ");
		}

	}

}
