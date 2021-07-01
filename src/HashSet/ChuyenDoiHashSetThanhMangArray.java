package HashSet;

import java.util.HashSet;

public class ChuyenDoiHashSetThanhMangArray {

	public static void main(String[] args) {
		// Tạo 1 HashSet có tên là hashSetString
		HashSet<String> hashSetString = new HashSet<String>();
		
		hashSetString.add("Element 1");
		hashSetString.add("Element 2");
		hashSetString.add("Element 3");
		hashSetString.add("Element 4");
		
		System.out.println("Các phần tử của hasSetString là:" + hashSetString);
		
		//Tạo 1 mảng có tên là array và có cùng kiểu dữ liệu với hashSetString
		//số phần tử của hashSetString la số phần tử của array
		String[] array = new String[hashSetString.size()];
		
		//Chuyển hashSetString thành mảng sử dụng toArray()
		hashSetString.toArray(array);
		
		//Hiển thị các phần tử của array
		System.out.println("Các phần tử của array:");
		for(String temp: array) {
			System.out.println(temp);
		}

	}

}
