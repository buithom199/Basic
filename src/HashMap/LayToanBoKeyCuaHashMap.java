package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class LayToanBoKeyCuaHashMap {

	public static void main(String[] args) {
		Map<String, String> hasMap = new HashMap<>();
		hasMap.put("Apple", "Táo");
		hasMap.put("Banana", "Chuối");
		hasMap.put("Orange", "Cam");
		
		//sử dụng Iterator để lấy toàn bộ key của hashMap
		//thông qua phương thức keySet()
		//vì các key có kiểu là String
		//nên iterator cũng có kiểu là String
		Iterator<String> iterator = hasMap.keySet().iterator();
		
		System.out.println("Key có trong hashMap là:");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
	}

}
