package If_Else;

import java.util.Scanner;

public class TimSoNhoNhat {

	public static void main(String[] args) {
		int firstNumber, secondNumber;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào số thứ nhất");
		firstNumber = scanner.nextInt();
		System.out.println("Nhập vào số thứ hai");
		secondNumber = scanner.nextInt();
		
		//Gán giá trị của biến firstNumber cho minNumber
		int minNumber = firstNumber;
		//So sánh firstNumber với secondNumber
		//Nếu firstNumber lớn hơn secondNumber thì sẽ gán giá trị của secondNumber cho minNumber
		//Còn không thì không làm gì cả và kết thúc câu lệnh điều khiển
		if(firstNumber > secondNumber)
			minNumber = secondNumber;
		System.out.println("số nhỏ nhất trong 2 số" + firstNumber + "và" + secondNumber +
				"là" + minNumber);

	}

}
