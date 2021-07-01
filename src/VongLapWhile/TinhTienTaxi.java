package VongLapWhile;

import java.util.Scanner;

public class TinhTienTaxi {

	public static void main(String[] args) {
		float km;
		Scanner scanner = new Scanner(System.in);
		long money = 0;
		//Khai báo hằng số giá mở cửa
		final int STARTING_FEE = 14000;
		//Từ km tiếp theo đến km thứ 25
		final int NEXT_TO_25KM = 16300;
		//Từ km thứ 26 trở đi
		final int FROM_26KM_ONWARDS = 13300;
		
		System.out.println("Nhập vào số km đã đi:");
		km = scanner.nextFloat();
		
		while(km < 0) {
			System.out.println("Số km nhập vào phải lơn hơn 0. Mờ bạn nhập lại");
			km = scanner.nextInt();
		}
		if(km <= 0.8) {
			money = 14000;
		}else if (km <= 25) {
			money = (long) (STARTING_FEE + NEXT_TO_25KM * (km - 0.8));
		}else{
			money = (long) (STARTING_FEE + 16300 * (25 - 0.8) + 13300 * (km -25-0.8));
			
		}
		System.out.println("Số tiền đi" + km + "km =" + money + "đồng");
		

	}

}
