package NgayThangNamTrongJava;

import java.util.Calendar;

public class PhuongThucRoll {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println("Thời gian hiện tại" + calendar.getTime());
		
		//thay đổi tháng thành 12
		calendar.set(Calendar.MONTH, Calendar.DECEMBER);
		System.out.println("Thời gian hiện tại sau khi thay đổi là:" + calendar.getTime());
		
		//tăng tháng sử dụng phương thức roll()
		//lúc này tháng sẽ là tháng 1 và năm vẫn giữ nguyên
		calendar.roll(Calendar.MONTH, 1);
		System.out.println("Thời gian hiện tại sau khi thay đổi là" + calendar.getTime());

	}

}
