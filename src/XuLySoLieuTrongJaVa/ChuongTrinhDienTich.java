package XuLySoLieuTrongJaVa;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ChuongTrinhDienTich {

	public static void main(String[] args) {
		int banKinh;
		double soPI = 3.14d;
		double area;
		DecimalFormat dcFormat = new DecimalFormat("#.##");
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhập vào bán kính hình tròn:");
		banKinh = scanner.nextInt();
		area = soPI * banKinh *banKinh;
		System.out.println("Dien tích hình tròn=" + dcFormat.format(area));
	}

}
