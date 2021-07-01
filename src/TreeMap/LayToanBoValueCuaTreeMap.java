package TreeMap;

import java.util.TreeMap;

public class LayToanBoValueCuaTreeMap {

	public static void main(String[] args) {
		TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
		treeMap.put(0, 6);
		treeMap.put(1, 5);
		treeMap.put(2, 4);
		treeMap.put(3, 3);
		treeMap.put(4, 2);
		treeMap.put(5, 1);
		
		//phương thức values() sẽ trả về
		//một tập hợp gồm các value có trong treeMap
		System.out.println("các value có trong treeMap là:");
		for(Integer value: treeMap.values()) {
			System.out.println("Value =" + value);
		}

	}

}
