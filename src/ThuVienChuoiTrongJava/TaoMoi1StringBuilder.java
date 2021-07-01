package ThuVienChuoiTrongJava;

public class TaoMoi1StringBuilder {

	public static void main(String[] args) {
		//Dạng 1: tạo 1 StringBuilder rỗng có khả năng lưu trữ 
		StringBuilder stringBuilder = new StringBuilder();
		
		//Dạng 2: tạo 1 StringBuilder rỗng có khả nang lưu trữ số ký tự =32
		StringBuilder stringBuilder2 =new StringBuilder(32);
		
		//Dạng 3: tạo 1 StrinBuilder từ 1 chuỗi str có sẵn
	//Khả năng lưu trữ của stringBuilder2 = 16 + chiều dài của chuỗi
		String string = "Hello World!";
		StringBuilder stringBuilder3 = new StringBuilder(stringBuilder);

	}

}
