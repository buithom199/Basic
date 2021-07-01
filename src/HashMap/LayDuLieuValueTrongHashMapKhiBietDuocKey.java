package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LayDuLieuValueTrongHashMapKhiBietDuocKey {

	public static void main(String[] args) {
		HashMap<String, String> hashMapCity = new HashMap<>();
		hashMapCity.put("QNg","Quảng Ngãi");
		hashMapCity.put("QN", "Quảng Nam");
		
		//trong trường hợp này ta thấy
		//key của Quảng Nam và Quảng Ninh
		//đều là QN nên chương trình sẽ thêm
		//vào trong hashMapCity value đứng sau (tức là Quảng Ninh)
		hashMapCity.put("QN", "Quảng Ninh");
		hashMapCity.put("HCM", "TP Hồ Chí Minh");
		
		System.out.println("Danh sách các thành phố trong hashMapCity");
		Set<Map.Entry<String, String>> setCity = hashMapCity.entrySet();
		System.out.println(setCity);
		
		//lấy thành phố có mã là QNg
		//và hiển thị tên thành phố
		System.out.println("QNg:" + hashMapCity.get("QNg"));
		
		//lấy thành phố có mã là NT
		//vì trong hashMapCity không có thành phố nào có mã là NT
		//nên sẽ hiển thị giá trị null
		System.out.println("NT:" + hashMapCity.get("NT"));
		
		//để kiểm tra xem 1 value có trong HashMap hay không
		//chúng ta sẽ dùng phương thức containsValue()
		if(hashMapCity.containsValue("TP Hồ Chí Minh")) {
			System.out.println("Có TP Hồ Chí Minh trong hashMapCity");
		}

	}

}
