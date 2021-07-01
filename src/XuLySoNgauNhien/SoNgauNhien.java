package XuLySoNgauNhien;

import java.util.Random;

public class SoNgauNhien {

	public static void main(String[] args) {
		Random rdRandom = new Random();
		double firstNumber, secondNumber, thirdNumber, max, min;
		
		firstNumber = rdRandom.nextDouble();
		secondNumber = rdRandom.nextDouble();
		thirdNumber = rdRandom.nextDouble();
		
		System.out.println("Ba số vừa được sinh ra là" + firstNumber +
				"," + secondNumber + "và" + thirdNumber);
		
		//tìm số lớn nhất
		max = firstNumber;
		if(max < secondNumber) {
			max = secondNumber;
			
		}
		if(max < thirdNumber) {
			max = thirdNumber;
		}
		System.out.println("Số lớn nhất trong 3 số là" + max);
		
		//tìm số nhỏ nhất
		min = firstNumber;
		if(min > secondNumber) {
			min = secondNumber;
		}
		if(min > thirdNumber) {
			min = thirdNumber;
		}
		System.out.print("Số nhỏ nhất trong 3 số là" + min);

	}

}
