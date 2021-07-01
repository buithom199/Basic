package NgayThangNamTrongJava;

import java.util.Calendar;
import java.util.Scanner;

public class Vidu10 {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		String dayString = " ";
		Scanner scanner = new Scanner(System.in);
		
		//Tìm ngày hiện tại
		int today = calendar.get(Calendar.DAY_OF_WEEK);
		
		//Hiển thị ngày hiện tại
		switch (today) {
		case 1:
			dayString = "Chủ nhật";
			break;
		case 2:
			dayString = "Thứ hai";
			break;
		case 3:
			dayString = "Thứ ba";
			break;
		case 4:
			dayString = "Thứ tư";
			break;
		case 5:
			dayString = "THứ năm";
			break;
		case 6:
			dayString = "Thứ sáu";
			break;
		case 7:
			dayString = "Thứ bảy";
			break;
		}
		System.out.println("Hôm nay là" + dayString);
		System.out.println("Nhập vào số ngày cách ngày hiện tại:");
		int n = scanner.nextInt();
		
		int day = today + n;
		//tìm ngày cách ngày hiện tại n ngày
		switch (day) {
		case 1:
			dayString = "Chủ nhật";
			break;
		case 2:
			dayString = "Thứ hai";
			break;
		case 3:
			dayString = "Thứ ba";
			break;
		case 4:
			dayString = "Thứ tư";
			break;
		case 5:
			dayString = "THứ năm";
			break;
		case 6:
			dayString = "Thứ sáu";
			break;
		case 7:
			dayString = "Thứ bảy";
			break;

		}
		System.out.println("Ngày cách ngày hiện tại" + n+ "ngày là" + dayString);

	}

}
