package NgayThangNamTrongJava;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class Vidu07 {

	public static void main(String[] args) {
		LocalDate nowDate = LocalDate.now();
		System.out.println(nowDate.getDayOfWeek()+" "
				+nowDate.getDayOfMonth()+"/" + nowDate.getMonth()+"/" +
				nowDate.getYear());
		
		//Để tìm ngày của tuần trước và tuần sau cửa 1 ngày
		//Java cung cấp cho chúng ta một lớp có sẵn đó là TemporalAdjusters
		//trong lớp này có 2 phương thức đó là next() và previous()
		//trong bài tập này cúng ta sẽ tìm ngày thứ 5 của tuần trước và tuần sau
		//để sử dụng TemporalAjusters
		//chúng ta sẽ import gói thư viện java.time.tempoal.TemporalAjusters của java
		LocalDate previousDay = nowDate.with(TemporalAdjusters.previous(DayOfWeek.THURSDAY));
		LocalDate nextDay = nowDate.with(TemporalAdjusters.next(DayOfWeek.THURSDAY));
		
		System.out.println("Ngày thứ 5 tuần trước là" + previousDay);
		System.out.println("Ngày thứ 5 tuần sau là" + nextDay);
		

	}

}
