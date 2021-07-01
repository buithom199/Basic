package ListInterface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TaoMoiListInterface {

	public static void main(String[] args) {
		//Khai báo List Iinterface tên listString có kiểu là String
		//Và sử dụng Class là ArrayList để triển khai
		//ArrayList là 1 class Collection
		//Các phần tử trong listString cũng có kiểu là String
		List<String>listString = new ArrayList<String>();
		
		//khai báo List Interface tên listInteger có kiểu Integer
		//và sử dụng Class là LinkedList để triển khai
		//LinkedList là 1 class Collection
		//Các phần tử trong listInteger cũng có kiểu là Integer
		List<Integer> listInteger = new LinkedList<Integer>();

	}

}
