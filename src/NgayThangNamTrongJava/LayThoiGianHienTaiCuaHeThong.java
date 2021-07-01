package NgayThangNamTrongJava;

import java.util.Calendar;

public class LayThoiGianHienTaiCuaHeThong {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		//Hiển thị ngày hiện tại
		//Calendar.DAY_OF_MONTH sẽ cho biết ngày hiện tại của tháng hiện tại
		//hàm get() sẽ trả về giá trị ngày hiện tại
		System.out.println("Ngày hiện tại là" + calendar.get(Calendar.DAY_OF_MONTH));
		
		//Hiển thị tháng hiện tại
		//sử dụng Calendar.MONTH
		//vì tháng trong Java sẽ chạy từ 0 đến 11
		//tức là nếu hiện giờ là tháng 7 thì chương trình sẽ hiển thị là tháng 6
		//vì vậy để hiển thị đúng thì ta sẽ cộng thêm tháng đó cho 1
		System.out.print("Tháng hiện tại là:");
		System.out.println(calendar.get(Calendar.MONTH) + 1);
		
		//Hiển thị năm hiện tại
		//Calendar.Year sẽ cho biết năm hiện tại
		System.out.println("Năm hiện tại là" + calendar.get(Calendar.YEAR));
		
		//Hiển thị giờ hiện tại
		//Sự khác nhau giữa HOUR và HOUR_OF_DAY là
		//HOUR sẽ hiển tthi5 theo khung giờ 12 giờ, ví dụ 11 giờ tối sẽ hiển thị là 11
		//còn HOUR_OF_DAY sẽ hiển thị theo khung giờ 23 giờ, ví dụ 11 giờ tối sẽ hiển thị là 23
		System.out.println("Giờ hiện tại" + calendar.get(Calendar.HOUR));
		System.out.println("Giờ hiện tại" + calendar.get(Calendar.HOUR_OF_DAY));
		
		//Hiển thị phút hiển tại
		//Sử Calendar.MINUTE
		System.out.println("Phút hiện tại" + calendar.get(Calendar.MINUTE));
		
		//hiển thị giâ hiện tại
		//sử dụng Calendar.SECOND
		System.out.println("Giây hiện tại là" + calendar.get(Calendar.SECOND));

	}

}
