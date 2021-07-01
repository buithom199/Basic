package MapInterface;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LayToanBoKeyCuaMap {

	public static void main(String[] args) {
		Map<String, String> mapLanguages = new LinkedHashMap<>();
		mapLanguages.put("CSLT", "Cơ sở lập trình");
		mapLanguages.put("C++", "C++");
		mapLanguages.put("C#", "C sharp");
		mapLanguages.put("PHP", "PHP");
		mapLanguages.put("Java", "Java");
		
		//Phương thức keySet()
		//Sẽ trả về 1 set chứa key trong Map
		for(String key: mapLanguages.keySet()) {
			System.out.println("Key=" +key);
		}
	}

}
