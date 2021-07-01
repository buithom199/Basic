package NgayThangNamTrongJava;

import java.util.Calendar;

public class Vidu11 {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		int currentYear = calendar.get(Calendar.YEAR);
		System.out.println("Năm hiện tại là" + currentYear);
		String canString = " ", chiString = " ";
		
		//Tìm can bằng cách lấy năm đó chia lấy dư cho 10
		switch (currentYear %10) {
		case 0:
			canString = "Canh";
			break;

		case 1:
			canString ="Tân";
			break;
		case 2:
			canString = "Nhâm";
			break;

		case 3:
			canString ="Quý";
			break;
			
		case 4:
			canString = "Giáp";
			break;

		case 5:
			canString ="Ất";
			break;
		
		case 6:
			canString = "Bính";
			break;

		case 7:
			canString ="Đinh";
			break;
			
		case 8:
			canString = "Mậu";
			break;

		case 9:
			canString ="Kỷ";
			break;
		}
		
		//Tìm chi bằng cách lấy năm đó chia lấy dư cho 12
		switch (currentYear%12) {
		case 0:
			chiString = "Thân";
			break;

		case 1:
			chiString ="Dậu";
			break;
		case 2:
			chiString = "Tuất";
			break;

		case 3:
			chiString ="Hợi";
			break;
			
		case 4:
			chiString = "Tý";
			break;

		case 5:
			chiString ="Sửu";
			break;
		
		case 6:
			chiString = "Dần";
			break;

		case 7:
			chiString ="Mão";
			break;
			
		case 8:
			chiString = "Thìn";
			break;

		case 9:
			chiString ="Tỵ";
			break;
			
		case 10:
			chiString ="Ngọ";
			break;
		case 11:
			chiString ="Mùi";
			break;
		
		}
		System.out.println("Can chi của năm" + currentYear + "là"
				+(canString + " " + chiString));

	}

}
