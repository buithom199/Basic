package Switch_Case;

import java.util.Scanner;

public class HienThiThangTuongUung {

	public static void main(String[] args) {
		int thang;
		String thangTuongUng = " ";
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhập vào 1 số nguyên (từ 1 đến 12 : ");
		thang = scanner.nextInt();
		
		switch (thang) {
		case 1:
			thangTuongUng = "Tháng 1";
			case 2:
				thangTuongUng = "Tháng 2";
			case 3:
				thangTuongUng = "Tháng 3";
				case 4:
					thangTuongUng = "Tháng 4";
				case 5:
					thangTuongUng = "Tháng 5";
				case 6:
					thangTuongUng = "Tháng 6";
				case 7:
					thangTuongUng = "Tháng 7";
					case 8:
						thangTuongUng = "Tháng 8";
						break;
					case 9:
						thangTuongUng = "Tháng 9";
			            break;
			            
					case 10:
						thangTuongUng = "Tháng 10";
						break;
						
					case 11:
						thangTuongUng = "Tháng 11";
						break;
					case 12:
					thangTuongUng = "Tháng 12";
					break;

		default:
			System.out.println("Số nhập vào phải nằm trong khoảng từ 1 đến 12");
		}
		System.out.println(thangTuongUng);

	}

}
