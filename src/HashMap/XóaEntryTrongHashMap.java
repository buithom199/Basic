package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class XóaEntryTrongHashMap {

	public static void main(String[] args) {
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		hashMap.put(1,9);
		hashMap.put(4,10);
		hashMap.put(2,7);
		hashMap.put(8,20);
		
		System.out.println("Các phần tử có trong hashMap:");
		Set<Map.Entry<Integer, Integer>> setMap = hashMap.entrySet();
		System.out.println(setMap);
		
		//Xóa entry có khóa bằng 2 ra khỏi hashMap
		//Sử dụng phương thức remove()
		hashMap.remove(2);
		
		System.out.println("Các phần tử có trong hashMap sau khi xóa");
		System.out.println(hashMap);

	}

}
