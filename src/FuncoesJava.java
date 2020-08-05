
public class FuncoesJava {

	public static void main(String[] args) {

		String original = "ASDFG zxcvb asdkjh QWERTY zxoiuytr çlkjh asdfg  ";

		String s1 = original.toLowerCase();
		String s2 = original.toUpperCase();
		String s3 = original.trim();
		String s4 = original.substring(2);
		String s5 = original.substring(2, 9);
		String s6 = original.replace('a', 'x');
		int i = original.indexOf("za");
		int j = original.lastIndexOf("asd");

		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s1 + "-");
		System.out.println("");
		System.out.println("Original: -" + original + "-");
		System.out.println("toUpperCase: -" + s2 + "-");
		System.out.println("");
		System.out.println("Original: -" + original + "-");
		System.out.println("trim: -" + s3 + "-");
		System.out.println("");
		System.out.println("Original: -" + original + "-");
		System.out.println("subtring(2): -" + s4 + "-");
		System.out.println("");
		System.out.println("Original: -" + original + "-");
		System.out.println("subtring(2,9): -" + s5 + "-");
		System.out.println("");
		System.out.println("Original: -" + original + "-");
		System.out.println("replace('a','x'): -" + s6 + "-");
		System.out.println("");
		System.out.println("Original: -" + original + "-");
		System.out.println("indexOf('za'): -" + i + "-");
		System.out.println("");
		System.out.println("Original: -" + original + "-");
		System.out.println("lastIndexOf('asd'): -" + j + "-");

	}

}
