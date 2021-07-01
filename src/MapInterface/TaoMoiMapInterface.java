package MapInterface;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import javax.activation.MailcapCommandMap;

public class TaoMoiMapInterface {

	public static void main(String[] args) {
		// Khai báo Map Interface tên hashMap
		//và sử dụng Class là HashMap để triển khai
		//HashMap là 1 Class Collection
		//Mỗi phần tử trong hashMap bao gồm 2 phần
		//Key (Integer) và value (String)
		Map<Integer, String> hashMap = new HashMap<>();
		
		//Thêm value vào trong hashMap với key tương ứng
		//Sử dụng phương thức put()
		//Đối số thứ nhất trong put là key có kiểu là Integer
		//Và đối số thứ hai là value có kiểu String
		hashMap.put(1,"One");
		hashMap.put(0,"Zero");
		hashMap.put(2, "Two");
		hashMap.put(4,"Four");
		hashMap.put(21,"Twenty first");
		hashMap.put(5, "Five");
		
		//Khai báo Map Interface tên linkedHashMap
		//Và sử dụng Class là linkedHashMap để triển khai
		//LinkedHashMap là 1 class Collection
		//Mỗi phần tử trong linkedHashMap bao gồm 2 phần
		//key(Integer) và value (String)
		Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
		
		//Thêm value vào trong linkedHashMap với key tương ứng
		linkedHashMap.put(1, "One");
		linkedHashMap.put(0, "Zero");
		linkedHashMap.put(2,"Two");
		linkedHashMap.put(4,"Four");
		linkedHashMap.put(5, "Five");
		linkedHashMap.put(21, "Twenty first");
		
		//Khai báo Map Interface tên treemap
		//Và sử dụng Class là TreeMap để triển khai
		//treeMap là 1 class collection
		//mỗi phần tử trong treeMap bao gồm 2 phần 
		//key(Integer) và value(String)
		
		Map<Integer, String> treeMap = new TreeMap<>();
		
		//Thêm value vào trong treeMap với key tương ứng
		treeMap.put(1, "One");
		treeMap.put(0, "Zero");
		treeMap.put(2,"Two");
		treeMap.put(4,"Four");
		treeMap.put(21, "Twenty first");
		treeMap.put(5, "Five");
		
		System.out.println("Các phần tử có trong hashMap");
		System.out.println(hashMap);
		System.out.println("Các phần tử có trong linkedHashMap");
		System.out.println(linkedHashMap);
		System.out.println("Các phần tử có trong treeMap");
		System.out.println(treeMap);
		
		

	}

}
