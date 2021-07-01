package HashSet;

import java.util.HashSet;

public class HienThiCacPhanTuCoTrongHashSet {

	public static void main(String[] args) {
		// khai báo 1 HashSet có tên là hashSet
		//có kiểu là String
		HashSet<String> hashSet = new HashSet<>();
		
		//thêm các phần tử vào hashSet sử dụng phương thức add()
		hashSet.add("ONE");
		hashSet.add("TWO");
		hashSet.add("THREE");
		hashSet.add("FOUR");
		
		//Hiển thị các phần tử có trong hashSet
		//bằng các sử dụng vòng lặp for duyệt theo đối tượng
		//trong đó kiểu dự liệu của biến str
		//phải trung với kiểu dữ liệu của hashSet
		System.out.println("Các phần tử có trong hashSet là:");
		for(String str: hashSet) {
			System.out.print(str + "\t");
		}

	}

}
