package XuLySoNgauNhien;

import java.util.ArrayList;
import java.util.Random;

public class ChuongtrinhSinhRa20SoNguyen {

	public static void main(String[] args) {
		int n =20;
		int tong = 0;
		int[] array = new int[20];
		ArrayList<Integer> arrChanArrayList = new ArrayList<Integer>();
		ArrayList<Integer> arrLeArrayList = new ArrayList<Integer>();
		Random rdRandom = new Random();
		
		for(int i =0; i<array.length; i++) {
			array[i] = rdRandom.nextInt(101);
		}
		
		//tìm số chẵn lẻ
		for(int i=0; i<array.length; i++) {
			//nếu phần tử đó là số chẵn thì sẽ thêm vào arrChan
			//ngược lại thêm arrLe
			if(array[i]%2 ==0) {
				arrChanArrayList.add(array[i]);
			}else {
				arrLeArrayList.add(i);
			}
		}
		
		//hiển thị các số chẵn lẻ
		System.out.println("Các số chẵn là:");
		for(int i =0; i<arrChanArrayList.size(); i++) {
			System.out.println(arrChanArrayList.get(i) + "\t");
		}
		
		System.out.println("Các số lẻ là:");
		for(int i =0; i<arrLeArrayList.size(); i++) {
			System.out.println(arrLeArrayList.get(i) + "\t");
		}
		
		//tinh1 tồng các số đó
		for(int i =0; i<array.length; i++) {
			tong += array[i];
		}
		System.out.println("Tổng các số=" + tong);

	}

}
