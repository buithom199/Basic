package NgayThangNamTrongJava;

public class Vidu09 {

	public static void main(String[] args) {
		int number = (int) (System.currentTimeMillis()%12 +1);
		String monthString = "";
		switch (number) {
		case 1:
			monthString = "Tháng 1";
			break;
			
		case 2: 
			monthString = "Tháng 2";
			break;
			
		case 3:
			monthString = "Tháng 3";
			break;
			
		case 4:
			monthString = "Tháng 4";
			break;
		
		case 5:
			monthString = "Tháng 5";
			break;
			
		case 6:
			monthString = "Tháng 6";
			break;
		case 7:
			monthString = "Tháng 7";
			break;
		case 8:
			monthString = "Tháng 8";
			break;
		case 9:
			monthString = "Tháng 9";
			break;
		case 10:
			monthString = "Tháng 10";
			break;
		case 11:
			monthString = "Tháng 11";
			break;
		case 12:
			monthString = "Tháng 13";
			break;
		

		}
		//Kết quả được ngẫu nhiên sau mỗi lần biên dịch
		System.out.println(monthString);
	}

}
