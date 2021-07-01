package MapInterface;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class LayToanBoCacEntryCuaMap {

	public static void main(String[] args) {
		Map<String, String> mapLanguages = new TreeMap<>();
		mapLanguages.put("CSLT", "Cơ sở lập trình");
		mapLanguages.put("C++", "C++");
		mapLanguages.put("C#", "C Sharp");
		mapLanguages.put("PHP", "PHP");
		mapLanguages.put("Java", "Java");
		
		//Tạo 1 set có tên là setLanguages
		//chứa toàn bộ các entry (vừa key vừa value) của mapLanguagues
		
		Set<Map.Entry<String, String>> setLanguages = mapLanguages.entrySet();
		
		System.out.println("Các entry có trong setLanguages");
		System.out.println(setLanguages);

	}

}
