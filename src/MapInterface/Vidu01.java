package MapInterface;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Vidu01 {

	public static void main(String[] args) {
	 int number;
	 Scanner scanner = new Scanner(System.in);
	 //Đối số 1 trong Map là number nhập vào
	 //Đối số 2 là số lần xuất hiện của number đó
	 Map<Integer, Integer> mapInteger = new HashMap<>();
	 while((number = scanner.nextInt()) !=0) {
		 
		 //nếu số nhập vào chưa có trong mapInteger
		 //thì sẽ thêm vào trong mapInteger
		 //số đó có số lần xuất hiện là 1
		 //nếu đã có thì sẽ tăng số lần xuất hiện
		 
		 if(!mapInteger.containsKey(number)) {
			 mapInteger.put(number, 1);
		 }else {
			mapInteger.put(number, mapInteger.get(number) + 1);
		}
	 }
	 
	 //trả về maxTimes là số lần xuất hiện nhiều nhất
	 //trong mapInteger
	 int maxTimes = Collections.max(mapInteger.values());
	 
	 //highestMapInteger sẽ lưu trữ
	 //số có số lần xuất hiện nhieu2 nhất
	 Map<Integer, Integer> highestMapTimes = new HashMap<>();
	 
	 //duyệt qua từng phần tử của mapInteger
	 mapInteger.forEach((key, value) ->{
		 //nếu value nào trong mapInteger lớn hơn hoặc bằng maxNumber
		 //thì thêm key và value của số đó vào trong highestMapInteger
		 if(value >= maxTimes) {
			 highestMapTimes.put(key, value);
		 }
	 });
	 
	 System.out.println("Số có số lần xuất hiện nhiều nhất là");
	 highestMapTimes.forEach((so,soLan) ->
	 System.out.println(so + "xuất hiện" +soLan + "lần"));
	 

	}

}
