package NgayThangNamTrongJava;

import java.util.Calendar;

public class ThayDoiThoiGianCuaHeThong {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		//thay đổi ngày hiện tại thành ngày 9
		//tháng hiện tại thành tháng 12
		//năm hiện tại thành nam8 201
		//giờ hiện tại thành 10
		//phút hiện tại thành 59
		//và giây hiện tại thành 59
		//sử dụng phương thức set()
		calendar.set(Calendar.DAY_OF_MONTH, 9);
		calendar.set(Calendar.MONTH, Calendar.DECEMBER);
		calendar.set(Calendar.YEAR, 2018);
		calendar.set(Calendar.HOUR_OF_DAY, 10);
		calendar.set(Calendar.MINUTE, 59);
		calendar.set(Calendar.SECOND, 59);
		
		//Hiển thị thờ gian hiện tại sau khi thay đổi 
		System.out.println(calendar.getTime());
		
		//hoặc chúng ta có thể thay đổi tất cả như sau
		calendar.set(2016, Calendar.APRIL, 30, 20, 23, 8);
		
		System.out.println(calendar.getTime());

	}

}
