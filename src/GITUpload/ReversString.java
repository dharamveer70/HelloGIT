package GITUpload;

public class ReversString {
	public static void main(String[] args) {
		String name = "DharamveerSinghRathore";
		String empty = "";

		for (int i = name.length() - 1; i >= 0; i--) {
			empty = empty + name.charAt(i);
		}

		System.out.println(empty);
	}

}
