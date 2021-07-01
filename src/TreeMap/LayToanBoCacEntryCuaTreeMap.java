package TreeMap;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class LayToanBoCacEntryCuaTreeMap {

	public static void main(String[] args) {
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		treeMap.put(1, "Element 1");
		treeMap.put(23, "Element 2");
		treeMap.put(70, "Element 3");
		treeMap.put(4, "Element 4");
		treeMap.put(2, "Element 5");
		
		//Sử dụng Iterator để lấy toàn bộ entry của treeMap
		//vì 1 entry bao gồm key và value
		//nên kiểu dữ liệu của Iterator sẽ bao gồm
		//kiểu dữ liệu của key và value
		Iterator<Map.Entry<Integer, String>> iterator = treeMap.entrySet().iterator();
		
		System.out.println("Các entry có trong treeMap là");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
