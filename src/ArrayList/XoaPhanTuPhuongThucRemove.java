package ArrayList;

import java.util.ArrayList;

public class XoaPhanTuPhuongThucRemove {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("ANDROID");
		arrayList.add("Java");
		arrayList.add("PHP");
		
		//tạo bản sao của arrListString
		//sử dụng phương thức clone()
		ArrayList<String> arrayListCopy = (ArrayList<String>) arrayList.clone();
		
		System.out.println("Các phần tử của arrListString ban đầu:");
		System.out.println(arrayList);
		
		//Xóa phần tử có chỉ số =2 trong arrListString
		//Sử dụng phương thức remove()
		//trong đó giá trị vào là chỉ số của phần tử cần xóa
		arrayList.remove(2);
		
		System.out.println("Các phần tử của arrListCopy sau khi xóa phần tử số 2:");
		System.out.println(arrayList);
		
		 System.out.println("Các phần tử của arrListStringCopy ban đầu: ");
		    System.out.println(arrayListCopy);
		
		//Xóa phần tử "JAVA" ra khỏi arrList
		//sử dụng phương thức remove()
		//trong đó giá rị truyền vào là giá trị của phần tử cần xóa
		arrayListCopy.remove(1);
		
		System.out.println("Các phần tử của arrListCopy sau khi xóa phần tử Java:");
		System.out.println(arrayListCopy);
		

	}

}
