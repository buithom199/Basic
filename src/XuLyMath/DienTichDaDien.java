package XuLyMath;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DienTichDaDien {

	public static void main(String[] args) {
		int soCanh;
		double doDaiMoiCanh, dienTich;
		Scanner scanner = new Scanner(System.in);
		DecimalFormat dcFormat = new DecimalFormat("#.##");
		
		System.out.println("Nhập vào số cạnh của đa giác:");
		soCanh = scanner.nextInt();
		System.out.println("Nhập vào độ dài của cạnh:");
		doDaiMoiCanh = scanner.nextDouble();
		
		//tính diện tích đa giác
		dienTich = (soCanh*Math.pow(doDaiMoiCanh, 2)/(4*Math.tan(Math.PI/soCanh)));
		System.out.println("Diện tích đa giác =" +dcFormat.format(dienTich));

	}

}
