package VongLapFor;

import java.util.Scanner;

public class ChonChucNang {

	public static void main(String[] args) {
		int choiceNumber;
		Scanner scanner = new Scanner(System.in);
		
		//Vòng lặp for vắng mặt cả 3 biểu thức
		for(; ;) {
			System.out.println("1. Nhập");
			System.out.println("2. Xem");
			System.out.println("3. Thoát");
			
			do {
				System.out.println("Bấm số để chọn (1/2/3):");
				choiceNumber = scanner.nextInt();
			}while ((choiceNumber <1) || (choiceNumber > 3));
			switch (choiceNumber) {
			case 1:
				System.out.println("Bạn chọn chức năng đăng nhập!");
				break;
			case 2:
				System.out.println("Bạn chọn chức năng xem!");
				break;
			case 3:
				System.out.println("Bạn chọn chức năng thoát! Tạm biệt!");
				// Thoát chương trình
				System.exit(0);
				break;
			}
		}
		
		

	}

}
