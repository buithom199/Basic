package NgayThangNamTrongJava;

import java.sql.Date;
import java.util.Calendar;

public class Vidu01 {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		java.util.Date date = calendar.getTime();
		
		//Hiển thị thời gian hiện tại
		System.out.println("Thời gian hiện tại là" + date);
		
		//tìm và hiển thị ngày đầu tháng và ngày cuối tháng của tháng hiện tại
		//trong năm 2017
		int ngayDauThang = calendar.getActualMaximum(Calendar.DATE);
		System.out.println("Ngày đầu của tháng hiện tại trong năm 2017=" + ngayDauThang);
		int ngayCuoiThang = calendar.getMaximum(Calendar.DATE);
		System.out.println("Ngày cuối của tháng hiện tại trong năm 2017=" + ngayCuoiThang);

	}

}
