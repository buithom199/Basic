package HashMap;

import java.util.HashMap;

public class LayToanBoValueCuaHashMap {

	public static void main(String[] args) {
		HashMap<String, String> hashMap = new HashMap<>();
		hashMap.put("January", "Tháng 1");
		hashMap.put("February", "Tháng 2");
		hashMap.put("March", "Tháng 3");
		hashMap.put("April", "Tháng 4");
		hashMap.put("May", "Tháng 5");
		hashMap.put("June", "Tháng 6");
		hashMap.put("July", "Tháng 7");
		
		//phuong8 thức values() sẽ trả về
		//một tao65 hợp gồm các value có trong hashmap
		System.out.println("Các value có trong hashMap là");
		for(String value: hashMap.values()) {
			System.out.println("Value=" + value);
		}

	}

}
