package XuLySoNgauNhien;

import java.util.Random;

public class PhuongThucnextBoolean {

	public static void main(String[] args) {
		Random rdRandom = new Random(); //khai báo 1 đối tượng random
		
		//trả về 1 biến bool có giá trị là true hoặc false
		boolean bool = rdRandom.nextBoolean();
		System.out.println("Giá trị của biến bool là" + bool);

	}

}
