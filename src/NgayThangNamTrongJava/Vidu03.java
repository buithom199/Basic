package NgayThangNamTrongJava;

import java.sql.Date;
import java.util.Calendar;

public class Vidu03 {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		java.util.Date date = calendar.getTime();
		System.out.println("Ngày hiện tại là" + date);
		
		//Hiển thị ngày cách ngày hiện tại 2 tuần
		//Sử dụng phương thức add()
		calendar.add(Calendar.DAY_OF_MONTH, 14);
		java.util.Date datAfter = calendar.getTime();
		System.out.println("Ngày cách ngày hiện tại 2 tuần là" + datAfter);

	}

}
