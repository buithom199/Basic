package ListInterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class ViDuTongHop {

	public static void main(String[] args) {
		// Khai báo 1 list có class triển khai là ArrayList, kiểu dữ liệu String
		List<String> listString = new ArrayList<String>();
		
		//(giá trị các phần tử được nhập từ bàn phím)
		Scanner scanner = new Scanner(System.in);
		
		//Sau đó thêm vào phần tử các thứ trong tuần cho listString này
		listString.add("Monday");
		listString.add("Tuesday");
		listString.add("Wednesday");
		listString.add("Thursday");
		listString.add("Friday");
		listString.add("Sturday");
		listString.add("Sunday");
		
		//Hiển thị các phần tử sử dụng Iterator();
		ListIterator<String> listIterator = listString.listIterator();
		
		System.out.println("Hiển thị phần tử sử dụng Iterator:");
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
			
		}
		
		System.out.println("\nHiển thị các phần tử của List theo thứ tự từ dưới lên:");
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
			
		}
		
		//Thay đổi phần tử bất kỳ trong listString
		System.out.println("Nhập vào phần tử mới:");
		String element = scanner.nextLine();
		System.out.println("Nhập vào giá trị của phần tử cần thay đổi");
		int index = scanner.nextInt();
		listString.set(index, element);
		
		System.out.println("Các phần tử có trong listString sau khi thay đổi");
		for(String str: listString) {
			System.out.println(str);
		}
		
		//Xóa phần tử vừa thay đổi
		listString.remove(index);
		
		System.out.println("Các phần tử có trong listString sau khi xóa");
		for(String str: listString) {
			System.out.println(str);
		}

	}

}
