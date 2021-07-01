package VongLapFor;

import java.util.Scanner;

public class ForLongNhau {

	public static void main(String[] args) {
		int num1 , num2;
		Scanner scanner = new Scanner(System.in);
		
		//Vòng lặp for bên ngoài thực thi 3 lần với row = 1,2,3
		for (num1 = 1; num1 <= 3; num1++) {
			//Mỗi lần lặp for bên ngòi
			//Thì vòng lặp for trong sẽ thực hiện 2 lần với col =1,2
			for(num2 = 1; num2 <=2; num2++) {
				System.out.println("number1 =" + num1 + ", number2 =" +num2);
			}
			
		}

	}

}
