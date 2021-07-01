package MapInterface;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class LayDuLieuValueTrongMapKhiBietDuocKey {

	public static void main(String[] args) {
		Map<String, String> mapCity = new TreeMap<>();
		mapCity.put("QNg", "Quảng Ngãi");
		mapCity.put("QN", "Quảng Nam");
		
		//trong trường hợp này ta thấy
		//key của Quảng Nam và Quảng Ninh
		//Đều là QN nên chương trình sẽ thêm
		//vào trong Map value đứng sau (tức là Quảng Ninh)
		mapCity.put("QN", "Quảng Ninh");
		mapCity.put("HCM", "Hồ Chí Minh");
		
		System.out.println("Danh sách các thành phố trong mapCity");
		Set<Map.Entry<String, String>> setCity = mapCity.entrySet();
		System.out.println(setCity);
		
		//lấy thành phố có mã là HCM
		//và hiển thị tên thành phố
		System.out.println("HCM: " + mapCity.get("HCM"));
		
		//lấy thành phố có mã là HN
		//vì trong mapCity không có thành phố nào có mã là HN
		//nên sẽ hiển thị giá trị null
		System.out.println("HN" + mapCity.get("HN"));
		
		//Để kiểm tra xem 1 value có trong Map hay không
		//Chúng ta sẽ dùng phương thức containsValue()
		if(mapCity.containsValue("Thành phố Hồ Chí Minh")) {
			System.out.println("Có thành phố HCM trong mapCity");
		}

	}

}
