package XuLySoLieuTrongJaVa;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ChuongTrinhTinhTienLuong {

	public static void main(String[] args) {
		final double phanTramThue = 0.15d;
		long tienLuongNhan;
		double tienLuongThucTe, thueThuNhap;
		Scanner scanner = new Scanner(System.in);
		
		//định dạng số ở dạng tiền tệ sử dụng DecimalFormat
		//với cách định dạng này thì sẽ được phân cách bằng dấu phẩy
		//và phần thập phân sẽ bao gồm 2 số 0
		
		DecimalFormat currencyDecimalFormat  = new DecimalFormat("$#,###,##0.00");
		System.out.println("Nhập tiền lương hằng tháng:");
		tienLuongNhan = scanner.nextLong();
		
		//tính thuế thu nhập = 15%lương được nhận
		thueThuNhap = tienLuongNhan *0.15;
		
		//tiền lương thực tế sau khi đóng thuế = tiền lương nhận - thuế thu nhập
		tienLuongThucTe = tienLuongNhan - thueThuNhap;
		System.out.println("Tiền lương còn lại sau khi đóng thuế thu nhập =" 
		+ currencyDecimalFormat.format(thueThuNhap) + "=" + currencyDecimalFormat.format(tienLuongThucTe));

	}

}
