package NgayThangNamTrongJava;

import java.util.Calendar;
import java.util.TimeZone;

public class Vidu02 {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		//Thiết lập múi giờ hiện tại là múi giờ cùa Hàn Quốc
		//sử dụng phương thức setTimeZone()
		//TimeZone.getTimeZone("Asia/Seoul") sẽ trả về múi giờ của Hàn Quốc
		//Hàn Quốc nhanh hơn VietNam 2 tiếng đông hồ
		calendar.setTimeZone(TimeZone.getTimeZone("Asia/Soul"));
		
		System.out.println("Thời gian hiện tại của Hàn Quốc là" +
		 calendar.get(Calendar.HOUR_OF_DAY) + ":" + calendar.get(Calendar.MINUTE) 
		 + calendar.get(Calendar.SECOND));

	}

}
