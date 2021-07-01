package MapInterface;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class SaoChepMap {

	public static void main(String[] args) {
		Map<String, String> mapCity = new TreeMap<>();
		mapCity.put("QNg", "Quảng Ngãi");
		mapCity.put("QN", "Quảng Nam");
		mapCity.put("BD", "Bình Định");
		mapCity.put("HCM", "TP Hồ Chí Minh");
		
		System.out.println("Danh sách các thành phố trong mapCity:");
		Set<Map.Entry<String,String>> setCity = mapCity.entrySet();
		System.out.println(setCity);
		
		//Tạo 1 Map rỗng
		Map<String, String> mapCityCopy = new TreeMap<>();
		
		//Phương thức size() sẽ trả về số lượng entry có trong Map
		System.out.println("Số lượng các entry có trong mapCityCopy"
				+ "trước khi sao chép=" + (mapCity.size()));
		System.out.println("Danh sách các thành phố trong mapCityCopy");
		Set<Map.Entry<String, String>> setCityCopy = mapCityCopy.entrySet();
		System.out.println(setCityCopy);
		

	}

}
