package Bai_01;

public class BienInstance {
	// 2. Biến instance (biến toàn cục) trong java
	// - Biến instance được khai báo trong một lớp(class), bên ngoài các phương thức, contructor và các block
	// - Biến instance được lưu trong bộ nhớ heap
	// - Biến instance được tạo khi một đối tượng được tạo bằng việc sử dụng từ khóa "new" và sẽ bị phá hủy khi đối tượng bị phá hủy
	// - Biến instance có thể được được sử dụng bởi các phương thức, contructor, block,...Nhưng nó phải được sử dụng thông qua một đối tượng cụ thể
	// - Bạn được phép sử dụng "access modifier" khi khai báo biến instance, mặc định là "default"
	// - Biến instance có giá trị mặc định phụ thuộc vào kiểu dữ liệu của nó. Ví dụ nếu là kiểu int, short, byte thì giá trị mặc định là 0, kiểu double thì 0.0d,...Vì vậy, sẽ không cần khởi tạo giá trị cho biến instance trước khi sử dụng
	// - Bên trong class mà bạn khai báo biến instance, bạn có thể gọi nó trực tiếp bằng tên khi sử dụng ở khắp nơi bên trong class đó
	
	
	//Biến instance "ten" kiểu String, có giá trị mặc định là null
	public String ten;
	
	//Biến instance "tuoi" kiểu Integer, có giá trị mặc định là 0
	private int tuoi;
	
	//Sử dụng biến ten trong một constructor
	public BienInstance(String ten) {
		this.ten = ten;
	}
	
	//Sử dụng bien tuoi trong phương thức setTuoi
	public void setTuoi (int tuoi) {
		this.tuoi = tuoi;
	}
	
	public void showBienInstance() {
		System.out.println("Ten:" + ten);
		System.out.println("Tuoi:" + tuoi);
	}

	public static void main(String[] args) {
		BienInstance bienInstance = new BienInstance("Nguyen Van A");
		bienInstance.setTuoi(21);
		bienInstance.showBienInstance();

	}

}
