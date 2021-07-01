package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class LayToanBoValueCuaHashMap01 {

	public static void main(String[] args) {
		Map<String, String> hasMap = new HashMap<>();
		hasMap.put("Apple", "Táo");
		hasMap.put("Banana", "Chuối");
		hasMap.put("Orange", "Cam");
		
		//sử dụng Iterator để lấy toàn bộ value của hashMap
		//thông qua phương thức value()
		//vì các value có kiểu là String
		//nên iterator cũng có kiểu là String
		Iterator<String> iterator = hasMap.values().iterator();
		
		System.out.println("Value có trong hashMap là:");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}

	}

}
