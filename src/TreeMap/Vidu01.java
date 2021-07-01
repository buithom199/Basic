package TreeMap;

import java.util.TreeMap;

public class Vidu01 {

	public static void main(String[] args) {
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		
		//thêm các entry cho treeMap
		treeMap.put(10, "Ten");
		treeMap.put(25, "Twenty-five");
		treeMap.put(40, "Forty");
		treeMap.put(55, "Fifty-five");
		treeMap.put(70, "Seventy");
		
		//Tìm khóa lớn nhất nhỏ hơn bằng 10
		System.out.println("Khóa cần tìm = " + treeMap.floorKey(10));
		
		//Tìm khóa lớn nhất nhỏ hơn hoặc bằng 25
		System.out.println("Khóa cần tìm =" +treeMap.floorKey(30));
		
		//Tìm khóa lớn nhất nhỏ hơn bằng 0
				System.out.println("Khóa cần tìm = " + treeMap.floorKey(80));
				
				//Tìm khóa lớn nhất nhỏ hơn hoặc bằng 5
				//kết quả sẽ trả về nul
				System.out.println("Khóa cần tìm =" +treeMap.floorKey(5));
				
	}

}
