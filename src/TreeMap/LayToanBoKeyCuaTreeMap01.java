package TreeMap;

import java.util.Iterator;
import java.util.TreeMap;

public class LayToanBoKeyCuaTreeMap01 {

	public static void main(String[] args) {
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		treeMap.put(1, "Element 1");
		treeMap.put(23, "Element 2");
		treeMap.put(70, "Element 3");
		treeMap.put(4, "Element 4");
		treeMap.put(2, "Element 5");
		
		//Sử dụng Iterator để lấy toàn bộ key của treemap
		//thông qua phương thức keySet()
		//vì các key cũng có kiểu là Integer
		Iterator<Integer> iterator = treeMap.descendingKeySet().iterator();
		
		System.out.println("Key có trong treeMap là:");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		

	}

}
