package XuLySoNgauNhien;

import java.text.DecimalFormat;
import java.util.Random;

public class ChuongTrinh2SoNguyen {

	public static void main(String[] args) {
		int firstNumber, secondNumber;
		DecimalFormat dcFormat = new DecimalFormat("#.##");
		Random rdRandom = new Random();
		
		//sinh 2 số nguyên ngẫu nhiên trong phạm vị [-10 ...10]
		firstNumber = -10 + rdRandom.nextInt(21);
		secondNumber = -10 + rdRandom.nextInt(21);
		
		//Hiển thị 2 số
		System.out.println("Hai số vừa được sinh ra là" + firstNumber 
				+ "và" + secondNumber);
		//tính trung bình của 2 số đó
		//chia 2.0 để kết quả của phép chia có kiểu double
		double tb = (firstNumber + secondNumber)/2.0;
		System.out.println("Trung bình của" + firstNumber + "và" + secondNumber
				+ "=" +dcFormat.format(tb));

	}

}
