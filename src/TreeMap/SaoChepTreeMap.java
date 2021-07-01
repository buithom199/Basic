package TreeMap;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class SaoChepTreeMap {

	public static void main(String[] args) {
		TreeMap<String, String> treeMap = new TreeMap<String, String>();
		treeMap.put("Arctic Ocean", "Bắc Băng Dương");
		treeMap.put("Pacific Ocean", "Thái Bình Dương");
		treeMap.put("Atlantic Ocean", "Đại Tây Dương");
		treeMap.put("Indian Ocean", "Ấn Độ Dương");
		
		System.out.println("Các phần tử có tong treeMap");
		Iterator<Map.Entry<String, String>> iterator = treeMap.entrySet().iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		//Tạo 1 TreeMap rỗng
		TreeMap<String, String> treeMapCopy = new TreeMap<>();
		
		//Phương thức size() sẽ trả về số lượng entry có trong treeMapCopy
		System.out.println("Số lượng các entry có trong treeMapCopy"
				+ "trước khi sao chép = " + (treeMapCopy.size()));
		
		//sao chép các entry của treMap
		//vào trong treeMapCopy
		treeMapCopy.putAll(treeMap);
		
		System.out.println("Số lượng các entry có trong treeMapCopy" 
				+ "sau khi sao chép=" + (treeMapCopy.size()));
		System.out.println("Các phần tử có trong treeMapCopy:");
		iterator = treeMap.entrySet().iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		

	}

}
