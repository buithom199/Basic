package TreeMap;

import java.util.Iterator;
import java.util.TreeMap;

public class LayToanBoValueCuaTreeMap01 {

	public static void main(String[] args) {
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		treeMap.put(1, "Element 1");
		treeMap.put(23, "Element 2");
		treeMap.put(70, "Element 3");
		treeMap.put(4, "Element 4");
		treeMap.put(2, "Element 5");
		
		//Sử dụng Iterator để lấy toàn bộ value của treeMap
		//thông qua phương thức value()
		//vì các value có kiểu là String
		//nên iterato cũng có kiểu là String
		Iterator<String> iterator = treeMap.values().iterator();
		
		//Các value của treeMap được sắp xếp theo chiều tăng dần của khóa
		System.out.println("Value có trong treeMap là");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}

	}

}
