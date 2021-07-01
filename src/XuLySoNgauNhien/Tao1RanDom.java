package XuLySoNgauNhien;

import java.util.Random;

public class Tao1RanDom {

	public static void main(String[] args) {
		Random rdRandom = new Random(); //Khai báo 1 dối tượng Random
		int number = rdRandom.nextInt();//trả về 1 số nguyên bất kỳ
		System.out.println("Số vừa được sinh ra là" + number);
		
		int number1 = rdRandom.nextInt(4);//trả về 1 số nguyên nàm phạm vi [0...3)
		System.out.println("Số vừa được sinh ra là" + number1);
		
		//trả về 1 số nguyên nằm trong phạm vị [-4...-1]
		//dối với rd.nextInt(4) thì số lớn nhất là 3 và số nhỏ nhất là 0
		//ta có 3-4=-1 và 0-4=-4
		//nên các số được sinh ra sẽ nằm trong doạn [-4..-1]
		int number2 = -4 + rdRandom.nextInt(4);
		System.out.println("Số vừa được sinh ra là" + number2);

	}

}
