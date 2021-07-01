package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TuongTac2List {

	public static void main(String[] args) {
		String str ; //Phần tử của ArrayList 1
		int number; //Phần tử của ArrayList 2
		Scanner scanner = new Scanner(System.in);
		
		//Tạo 2 arrayList mới
		ArrayList<String > arrayListA = new ArrayList<>();
		ArrayList<Integer> arrayListB = new ArrayList<>();
		
		//Nhập vào 5 phần tử cho 2 ArrayList này
		System.out.println("Nhập phần tử là các chuỗi cho ArrayList1:");
		for(int i=0;i<5;i++) {
			System.out.println("NHập phần tử" + i + ":");
			str = scanner.nextLine();
			arrayListA.add(str);
		}
		
		System.out.println("Nhập phần tử là các số nguyên cho ArrayList 2");
		for(int i=0; i<5;i++) {
			number = Integer.parseInt(scanner.nextLine());//hạn chế hiện tượng trôi lệnh
			arrayListB.add(number);
		}
		
		//Hiển thị các phần tử của 2 ArrayList sử dụng Iterator
		Iterator<String> iteratorA = arrayListA.iterator();
		System.out.println("Các phần tử của arrListA là");
		while(iteratorA.hasNext()) {
			System.out.print(iteratorA.next() + "\t");
		}
		
		Iterator<Integer> iteratorB = arrayListB.iterator();
		System.out.println("Các phần tử của arrListB là:");
		while(iteratorB.hasNext()) {
			System.out.print(iteratorB.next() + "\t");
		}
		
		//Tìm kiếm vị trí xuất hiện đầu tiên và cuối cùng
		//của 1 phần tử bất kỳ trong arrListA
		//trong trường hợp trong Arrayist chỉ có 1 phần tử có giá trị cần tìm
		//thì vị trí xuất hiện đầu tiên và cuối cùng của phần tử đó trùng nhau
		System.out.println("Nhập phần tử cần tìm:");
		String strSearch = scanner.nextLine();
		if(arrayListA.contains(strSearch)) {
			int firstPosition = arrayListA.indexOf(strSearch);
			int lastPosition = arrayListA.lastIndexOf(strSearch);
			System.out.println("Vị trí xuất hiện đầu tiên và cuối cùng của" + strSearch
					+ "là" + firstPosition + "và" + lastPosition);
			
		}else {
			System.out.println("Không tìm thấy phần tử" + strSearch);
		}
		
		//Tạo 1 List có các phần tử được tách từ vị trí số 3 trong ArrayList 2
		//sử dụng phương thức subList()
		//trong đó 3 là vị trí bắt đầu lấy và kết thúc tại arrListB.size() - 1;
		List<Integer> subList = arrayListB.subList(3, arrayListB.size());
		System.out.println("Các phần tử có trong subList là" + subList);
		
		//Đảo ngược các phần tử trong 2 ArraList này
		//sử dụng phương thức Collections.reverse()
		Collections.reverse(arrayListA);
		System.out.println("Các phần tử trong arrListA sau khi đảo ngược:" + arrayListA);
		Collections.reverse(arrayListB);
		System.out.println("Các phần tử trong arrListB sau khi đảo ngược" + arrayListB);
		
		//Xáo trộn các phần tử trong ArrayList 1
		//sử dụng phương thức Collections.shuffle()
		//kết quả của mỗi lần sẽ khác nhau
		Collections.shuffle(arrayListA);
		System.out.println("Các phần tử trong arrListA sau khi xáo trộn:" + arrayListA);
		
		//Chuyển ArrayList 2 thành mảng và hiển thị các phần tử của mảng
		//sử dụng phương thức toArray()
		Object[] array = arrayListB.toArray();
		System.out.println("Các phần tử của mảng array là:");
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i] + "\t");
		}

	}

}
