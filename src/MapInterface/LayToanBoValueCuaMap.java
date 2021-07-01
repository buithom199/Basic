package MapInterface;

import java.util.LinkedHashMap;
import java.util.Map;

public class LayToanBoValueCuaMap {

	public static void main(String[] args) {
		Map<String, String> mapLanguages = new LinkedHashMap<>();
		mapLanguages.put("CSLT", "Cơ sở lập trình");
		mapLanguages.put("C++", "C++");
		mapLanguages.put("C#", "C sharp");
		mapLanguages.put("PHP", "PHP");
		mapLanguages.put("Java", "Java");
		
		//Phương thức values() sẽ trả về
		//Một tập hợp gồm các values có trong Map
		for(String value: mapLanguages.values()) {
			System.out.println("Value =" + value);
		}

	}

}
