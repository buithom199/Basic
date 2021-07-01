package HashMap;

import java.util.HashMap;

public class VongLapForEach {

	public static void main(String[] args) {
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		hashMap.put(0, 1);
		hashMap.put(1, 2);
		hashMap.put(2, 3);
		hashMap.put(3, 4);
		hashMap.put(4, 5);
		hashMap.put(5, 6);
		
		//Cách duyệt HashMap với forEach() trong java 8
		//đối số thứ nhất bên trong forEach là key
		//đối số thứ hai bên trong forEach là value
		System.out.println("Các entry có trong hashMap là:");
		hashMap.forEach((keyInt, valueInt) -> System.out.println(
				"Key =" + keyInt + ", value =" + valueInt));

	}

}
