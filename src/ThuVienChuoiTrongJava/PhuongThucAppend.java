package ThuVienChuoiTrongJava;

public class PhuongThucAppend {

	public static void main(String[] args) {
		StringBuilder stringBuilder = new StringBuilder();
		
		for(int i =0; i<10; i++) {
			stringBuilder.append("Hello lần" + i);
			stringBuilder.append("\t");
		}
		System.out.println(stringBuilder);

	}

}
