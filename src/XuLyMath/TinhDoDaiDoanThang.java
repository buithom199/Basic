package XuLyMath;

import java.util.Scanner;

public class TinhDoDaiDoanThang {

	public static void main(String[] args) {
		double xA, yA; //tọa độ diểm A
		double xB, yB; //tọa độ điểm B
		double dodaiAB; //độ dài doạn thẳng AB
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhập tọa độ diểm A:");
		System.out.println("Nhập hoành độ diểm A:");
		xA = scanner.nextDouble();
		System.out.println("Nhập tung độ điểm A:");
		yA = scanner.nextDouble();
		
		System.out.println("Nhập tọa độ diểm B");
		System.out.println("Nhập hoành độ điểm B");
		xB = scanner.nextDouble();
		System.out.println("Nhập tung độ điểm B:");
		yB = scanner.nextDouble();
		
		//tính độ dài AB
		dodaiAB = Math.sqrt(Math.pow((xB- xA), 2) + Math.pow((yB-yA), 2));	
		System.out.println("Độ dài doạn thẳng AB = " + dodaiAB);

	}

}
