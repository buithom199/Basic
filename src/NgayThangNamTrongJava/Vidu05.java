package NgayThangNamTrongJava;

import java.time.LocalDate;
import java.time.Period;

public class Vidu05 {

	public static void main(String[] args) {
		// LocalDate: mô tả kiểu dữ liệu date chỉ bao gồm ngày, tháng, năm
		// thường được sử dụng để lưu trữ, mô tả: ngày sinh, ngày tốt nghiệp
		// hay ngày vào 1 công ty
		//Để sử dụng localDate chúng ta sẽ import gói thư viện java.time.LocalDate của Java
		LocalDate startDate = LocalDate.of(2021, 01, 15);
		
		LocalDate endDate = LocalDate.of(2021, 06, 22);
		
		//tính sự chênh lệch giữa startDate và andDate
		//sử dụng hàm between() của Peridot
		//Để sử dụng Peridot chúng ta sẽ import gói thư viện java.time.Period của Java
		Period different = Period.between(startDate, endDate);
		System.out.println("Sự chênh lệch giữa startDate và endDate là"
				+ different.getYears() + "năm" + different.getMonths()
				+ "tháng và" + different.getDays() + "ngày");

	}

}
