package NgayThangNamTrongJava;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Vidu06 {

	public static void main(String[] args) {
		// LocalDateTime: kiểu dữ liệu gồm đầy đủ tháng năm, giờ phút giây
		//nhưng không có mô tả time-zone
		//nên dùng kiểu dữ liệu này trong các trường hợp khi thao tác với date
		//mà không muốn bị ảnh hưởng bởi time-zone giữa các vùng, quôc gia khác nhau
		//Để sử dụng LocalateTime
		//chúng ta sẽ import gói thư viện java.time.LocalDatetime của java
		LocalDateTime startDate = LocalDateTime.of(2021,  11, 1, 4, 20, 39);
		LocalDateTime endDate = LocalDateTime.of(20221,  11, 1, 10, 1, 8);
		
		//Tính sự chênh lệch về giờ, phút, giây
		//giữa 2 ngày startate và endDate
		//sử dụng phương thức between() của Duration
		//Duration được dùng để tính sự chênh lệch về gây giữa 2 ngày
		//bằng hàm getSeconds()
		long differentInSeconds = Duration.between(startDate, endDate).getSeconds();
		
		//chuyển giây về giờ sử dụng hàm toHours()
		long differentInHours = Duration.between(startDate, endDate).toHours();
		
		//chuyển giây về giờ sử dụng hàm toMinutes()
				long differentInMinutes = Duration.between(startDate, endDate).toMinutes();
				
				System.out.println("Sự chênh lệch giữa startDat và endData là" +
				differentInSeconds + "giây tương ứng với" + differentInMinutes +
				"phút và tương ứng với" + differentInHours + "giờ");
				
	}

}
