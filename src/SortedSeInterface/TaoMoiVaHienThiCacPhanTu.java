package SortedSeInterface;

import java.util.SortedSet;
import java.util.TreeSet;

public class TaoMoiVaHienThiCacPhanTu {

	public static void main(String[] args) {
		// Khai báo SortedSet Interface tên sortedSetString
		//và sử dụng Class là TreeSet để triển khai
		//TreeSet là 1 class Collection
		//Các phần tử trong sortedSetString cũng có kiểu là String
		SortedSet<String> sortedSetString = new TreeSet<String>();
		
		//Thêm các phần tử vào trong sortedSetString
		sortedSetString.add("Monday");
		sortedSetString.add("Tuesday");
		sortedSetString.add("Webnesday");
		sortedSetString.add("Thursday");
		sortedSetString.add("Saturday");
		sortedSetString.add("Sunday");
		
		//Hiển thị sortedSetString ở dạng mảng
		//Các phần tử được sắp xếp tăng dần theo chữ cái đầu tiên
		System.out.println("Các phần tử có trong sortedSetString");
		System.out.println(sortedSetString);
		

	}

}
