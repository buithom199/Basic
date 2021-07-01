package ListInterface;

import java.util.ArrayList;
import java.util.List;

public class AddTrongListInterface {

	public static void main(String[] args) {
		List<Float> listFloat= new ArrayList<Float>(1000);
		
		listFloat.add(1.0f);
		listFloat.add(10f);
		listFloat.add(0.02f);
		listFloat.add(10.41f);
		listFloat.add(20.17f);
		
		//thêm phần tử có giá trị 0.5f;
		//vào vị trí 3 trong danh sách listFloat
		listFloat.add(3, 0.5f);
		
		System.out.println("Các phần tử có trong liatFloat là:");
		for(float numberFloat: listFloat) {
		System.out.println(numberFloat);
		}

	}

}
