package If_Else;

import java.util.Scanner;

public class XacDinhDoTuoiCua1Nguoi {

	public static void main(String[] args) {
		int age, year;
		String name, ageGroup;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhập tên vào");
		name = scanner.next();
		System.out.println("Nhập năm sinh vào");
		year = scanner.nextInt();
		
		//Xác định độ tuổi tương ứng
		age = 2021 - year; //2021 là năm hiện tại
		if(age < 16) {
			ageGroup = "Tuổi vị thành niên";
		}else if (age >= 16 || age < 18 ) {
			ageGroup = "Tuổi trưởng thành";
			
		}else {
			ageGroup = "Già rồi!";
		}
		System.out.println("Bạn" + name + "thuộc nhóm" + ageGroup);
		

	}

}
