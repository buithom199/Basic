package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SuDungIterator {

	public static void main(String[] args) {
		Map<String, String> hasMap = new HashMap<>();
		hasMap.put("Apple", "Táo");
		hasMap.put("Banana", "Chuối");
		hasMap.put("Orange", "Cam");
		
		//Sử dụng Iterator để lấy toàn bộ entry của hashMap
		//vì 1 entry bao gồm key và value
		//nên kiểu dữ liệu của Iterator sẽ bao gồm
		//kiểu dữ liệu của cả key và value
		Iterator<Map.Entry<String, String>> iterator = hasMap.entrySet().iterator();
		
		System.out.println("Các entry có trong hashMap là:");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
