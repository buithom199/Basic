package NgayThangNamTrongJava;

import java.util.Calendar;

public class CongTruThoiGianCuaHeThong {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println("Thời gian hiện tại là" + calendar.getTime());
		
		//cộng thời gian
		//Sử dụng phuong thức add()
		calendar.add(Calendar.MONTH, 4);//thêm 4 tháng
		calendar.add(Calendar.DAY_OF_MONTH, 5);// và thêm 5 ngày
		System.out.println("Thời gian hiện tại sau khi thay đổi là" + calendar.getTime());
		
		//trừ thời gian
		//sử dụng phương thức add()
		calendar.add(Calendar.HOUR_OF_DAY, 2);//giảm giờ hiện tại đi 2 tiếng
		calendar.add(Calendar.MINUTE, -3);//giảm phút hiện tại đi 3 phút
		System.out.println("Thời gian hiện tại sau khi thay đổi là" + calendar.getTime());

	}

}
