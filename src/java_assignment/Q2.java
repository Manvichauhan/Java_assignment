package java_assignment;

public class Q2 {
	/**
	Java Program to remove extra spaces from a string
	**/

	public static void main(String args[]) {
		String str = " This   is    a   practice     question ";
		System.out.println(str.replaceAll("\\s+"," ").trim());
		//System.out.println(str);
	}
}
