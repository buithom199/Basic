package NgayThangNamTrongJava;

import java.time.YearMonth;

public class Vidu04 {

	public static void main(String[] args) {
		//Để sử dụng YearMonth chúng ta sẽ import gói thư viện java.time.YearMonth của Java
		//tạo 1 biến yearMonth
		//biến này là sự kết hợp của tháng và năm
		//tháng và năm trong bài tập này là tháng 11 và năm 2007
		YearMonth yearMonth = YearMonth.of(2021, 6);
		
		//lấy thứ của ngày đầu thàng
		//hàm atDay().getDayOfWeek().name()
		//sẽ trả về tên của thứ trong tuần ứng với ngày 1 (ngày đầu tiên của tháng)
		String firtString = yearMonth.atDay(1).getDayOfWeek().name();
		System.out.println("Thứ của ngày đầu tiên trong tháng là" + firtString);
		
		//lấy thứ của ngày cuối cùng trong tháng
		//hàm atEndOfMonth().getDayOfWeek().name()
		//sẽ trả về tên của thứ trong tuần ứng với ngày cuối cùng của tháng
		String lastString = yearMonth.atEndOfMonth().getDayOfWeek().name();
		System.out.println("Thứ của ngày cuối cùng trong tháng là " + lastString);

	}

}
