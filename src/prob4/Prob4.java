package prob4;

public class Prob4 {

	public static void main(String[] args) {
		char[] c1 = reverse("HelloWorld");
		
		printCharArray(c1);

		char[] c2 = reverse("JavaProgramming");
		printCharArray(c2);
	}

	public static char[] reverse(String str) {

		char[] result = str.toCharArray();
		System.out.println(result.length);

		for (int i = 0; i < result.length/2; i++) {
			char c;
			c=result[i];
			result[i]=result[result.length-i-1];
			result[result.length-i-1]=c;
		}

		return result;
		/* 코드를 완성합니다 */
	}

	public static void printCharArray(char[] array) {
		/* 코드를 완성합니다 */
		for(int i=0;i<array.length;i++)
		{
		System.out.print(array[i]);
		}
		System.out.println();
	}
}
