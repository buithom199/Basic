package MangMotChieu;

public class GanGiaTriPhanTuChoMang {

	public static void main(String[] args) {
		// Khai báo mảng array1 và array2
		int[] array1 = {2,10,3,9,8};
		int array2[] = new int[5];
		
		//Gán giá trị của phần tử thứ 2 ttrong mảng array1
		//Cho phần tử thứ 3 trong mảng array2
		array2[3] = array1[2];
		
		System.out.println("Giá trị của phần tử thứ 3 trong mảng array2 = " + array2[3]);

	}

}
