package XuLySoLieuTrongJaVa;

import java.text.NumberFormat;
import java.util.Locale;

public class DinhDangSo {

	public static void main(String[] args) {
		NumberFormat currentLoacaleFormat = NumberFormat.getInstance();
		
		//định dạng số của khu vự mặc định của máy ảo JVM
		//sử dụng phương thức format()
		double doubleNumber = 10.08d;
		String string = currentLoacaleFormat.format(doubleNumber);
		System.out.println("Số" + doubleNumber + "sau khi định dạng =" + string);
		
		//tạo 1 NumberFormat để định dạng số theo tiêu chuẩn của nước Anh
		Locale localeEN = new Locale("en", "EN");
		NumberFormat enNumberFormat  = NumberFormat.getInstance(localeEN);
		
		//đối với số có kiểu long được định dạng theo chuẩn của nước Anh
		//thì phần ngàn của số được phân cách bằng dấu phẩy
		long longNumber = 12345678L;
		String string2 = enNumberFormat.format(longNumber);
		System.out.println("Số" + longNumber + "sau khi định dạng =" + string);
		
		//Tạo 1 NumberFormat để định dạng số theo tiêu chuẩn của Việt Nam
		Locale localeVN = new Locale("vi","VN");
		NumberFormat vnNumberFormat = NumberFormat.getInstance(localeVN);
		
		//đối với số float được định dạng theo chuẩn của Việt Nam
		//thì phần thập phân của số được phân cách bằng dấu phâỷ
		double doubleNumber1 = 10.17d;
		String str2 = vnNumberFormat.format(doubleNumber1 + "Sau khi định dạng =" + string2); 

	}

}
