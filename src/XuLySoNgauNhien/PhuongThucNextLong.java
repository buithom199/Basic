package XuLySoNgauNhien;

import java.util.Random;

import ChuoiString.KhaiBaoChuoiKyTu;

public class PhuongThucNextLong {

	public static void main(String[] args) {
		Random rdRandom = new Random(); //khai báo 1 đối tượng Random
		
		//trả về 1 số bất k2 có kiểu long
		long longNumber = rdRandom.nextLong();
		System.out.println("Số vừa được sinh ra là" + longNumber);

	}

}
