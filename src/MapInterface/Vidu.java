package MapInterface;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Vidu {

	public static void main(String[] args) {
		Map<Integer, Character> mapString = new TreeMap<>();
		Scanner sacScanner = new Scanner(System.in);
		String str;
		
		//Lưu trữ các ký tự có trong chuỗi str
		Set<Character> setChar;
		
		System.out.println("Nhập vào chuỗi bất kỳ");
		str = sacScanner.next();
		
		//Chuyển đổi chuỗi str thành 1 mảng các ký tự
		char[] charStr = str.toCharArray();
		
		setChar = new TreeSet<Character>();
		for(char ch : charStr) {
			//thêm các ký tự có trong mảng charStr
			//vào trong setChar
			//lúc này chỉ ký tự nào giống
			//thì chỉ thêm vào 1 lần
			setChar.add(ch);
		}
		
		//Hiển thị các ký tự duy nhất trong chuỗi
		//và độ dài của chuỗi đó
		System.out.println("Độ dài của chuỗi và các ký tự có trong chuỗi là");
		for(Character ch: setChar) {
			mapString.put(str.length(), ch);
			System.out.print(mapString.keySet() + "=>" + mapString.values()+"\n");
		}

	}

}
