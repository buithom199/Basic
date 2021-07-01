package ListInterface;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class TuongTacVoi2List {

	public static void main(String[] args) {
		String colors[] = {"black", "yellow", "green","blue","violet","silver"};
		String colors1[] = {"gold","white","brown","blue","gray","silver"};
		
		//Khai báo 2 list có Class triển khai là LinkedList
		List<String> list = new LinkedList<>();
		List<String> list1 = new LinkedList<>();
		
		//Thêm các phần tử có trong 2 mảng
		//Vào trong list và list1
		for(int count =0; count < colors.length; count++) {
			list.add(colors[count]);
			list1.add(colors1[count]);
		}
		
		//Thêm các phần tử của list1 vào trong list
		//và list1 trở về null (không có phần tử nào)
		list.addAll(list1);
		list1 = null;
		
		//Hiển thị các phần tử có trong list
		System.out.println("Các phần tử có trong list:");
		for(int count =0; count <list.size(); count++) {
			System.out.print(list.get(count) + "\t");
		}
		
		//Chuyển các phần tử trong list thành chữ hoa
		ListIterator<String> listIterator = list.listIterator();
		while (listIterator.hasNext()) {
			String str = listIterator.next();
			listIterator.set(str.toUpperCase());;
			
		}
		System.out.println("Các phần tử có trong list sau khi chuyển đổi:");
		for(int count =0; count < list.size(); count++) {
			System.out.print(list.get(count) + "\t");
		}
		//Xóa phần tử trong phạm vi 4 đến 6 trong list
		//Sử dụng phương thức clear()
		list.subList(4, 7).clear();
		System.out.println("Các phần tử có trong list khi xóa:");
		for(int count = 0; count <list.size(); count++) {
			System.out.print(list.get(count) + "\t");
		}

		
		//đảo list sử dụng ListIterator
		//listIterator này sẽ trỏ tới phần tử cuối cùng trong list
		listIterator = list.listIterator(list.size());
		System.out.println("List sau khi đảo ngược");
		while(listIterator.hasPrevious()) {
			System.out.print(listIterator.previous() + "\t");
		}
	}

}
