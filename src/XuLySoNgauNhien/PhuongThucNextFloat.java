package XuLySoNgauNhien;

import java.util.Random;

public class PhuongThucNextFloat {

	public static void main(String[] args) {
		Random rdRandom = new Random();//khai báo 1 dối tượng random
		float floatNumber = rdRandom.nextFloat();//trả về 1 số bất kỳ có kiểu là float
		System.out.println("Số vừa được sinh ra là" + floatNumber);

	}

}
