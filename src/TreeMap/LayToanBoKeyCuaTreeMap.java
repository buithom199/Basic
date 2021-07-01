package TreeMap;

import java.util.TreeMap;

public class LayToanBoKeyCuaTreeMap {

	public static void main(String[] args) {
		TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
		treeMap.put(0, 6);
		treeMap.put(1, 5);
		treeMap.put(2, 4);
		treeMap.put(3, 3);
		treeMap.put(4, 2);
		treeMap.put(5, 1);
		
		//phương thức keySet()
		//sẽ trả về 1 Set chứa key có trong treeMap
		System.out.println("Key của các entry trong treeMap");
		for(int key: treeMap.keySet()) {
			System.out.println("Key=" + key);
		}

	}

}
