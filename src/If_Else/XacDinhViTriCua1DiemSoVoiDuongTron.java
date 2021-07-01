package If_Else;

import java.util.Scanner;

public class XacDinhViTriCua1DiemSoVoiDuongTron {

	public static void main(String[] args) {
		int hoanhDoDiemM, tungDoDiemM, hoanhDoTamO, tungDoTamO, banKinhR;
		String viTri;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhập vào hoành độ tâm O:");
		hoanhDoTamO = scanner.nextInt();
		System.out.println("Nhập vào tung độ tâm O:");
		tungDoTamO = scanner.nextInt();
		System.out.println("Nhập vào hoành độ điểm M");
		hoanhDoDiemM = scanner.nextInt();
		System.out.println("Nhập vào tung độ điểm M");
		tungDoDiemM = scanner.nextInt();
		System.out.println("Nhập vào bán kính R");
		banKinhR = scanner.nextInt();
		
		//Tính bình phương khoảng cách từ tâm O tới điểm M
		int khoangcachOM = (hoanhDoDiemM -hoanhDoTamO) * (hoanhDoDiemM - hoanhDoTamO)+
				(tungDoDiemM-tungDoTamO) * (tungDoDiemM -tungDoTamO);
		
		//Tính bình phương bán kính
		int bankinh = banKinhR * banKinhR;
		
		//So sánh bình phương khoảng cách OM với bình phương bán kinh
		if(khoangcachOM < bankinh) {
			viTri = "Điểm M nằm bên trong đường tròn";
		}else if (khoangcachOM == bankinh) {
			viTri = "Điểm M nằm trên đường tròn";
			
		}else {
			viTri = "Điểm M nằm ngoài đường tròn";
		}
		System.out.println(viTri);

	}

}
