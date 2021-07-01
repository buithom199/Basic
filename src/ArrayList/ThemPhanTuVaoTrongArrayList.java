package ArrayList;

import java.util.ArrayList;

public class ThemPhanTuVaoTrongArrayList {

	public static void main(String[] args) {
		ArrayList<String> arrayListMonth = new ArrayList<>(12);
		
		//thêm phần tử vào trong ArrayList
		//sử dụng phương thức add()
		arrayListMonth.add("January");
		arrayListMonth.add("Fabruary");
		arrayListMonth.add("March");
		arrayListMonth.add("May");
		arrayListMonth.add("June");
		arrayListMonth.add("July");
		arrayListMonth.add("August");
		arrayListMonth.add("September");
		arrayListMonth.add("October");
		arrayListMonth.add("Novenber");
		arrayListMonth.add("December");
		
		//thêm vào trong ArrayList
		//phần tử ở vị trí thứ 3 và có giá trị là Appril
		arrayListMonth.add(3,"April");
		
		System.out.println("Các phần tử có trong arrListMonth là:");
		for(String month: arrayListMonth) {
			System.out.println(month);
		}

	}

}
