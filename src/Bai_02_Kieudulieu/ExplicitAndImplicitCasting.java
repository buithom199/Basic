package Bai_02_Kieudulieu;

public class ExplicitAndImplicitCasting {

	public static void main(String[] args) {
		int height = 6;
		double mass = 220.23456;
		
		//Implicit casting
		double result = height;
		System.out.println("Giá trị của biến result sau khi ép kiểu = " + result);
		int result1 = (int)mass;
		System.out.println("Giá trị của biến result sau khi ép kiểu = " + result1);

	}

}
