package practice;

public class Platenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = (int) (Math.random() * 25) + 65;
		int b = (int) (Math.random() * 25) + 65;
		int c = (int) (Math.random() * 25) + 65;
		int d = (int) (Math.random() * 25) + 65;
		
		int e = (int) (Math.random() * 100);
		int f = (int) (Math.random() * 100);
		
		char g = (char) a;
		char h = (char) b;
		char i = (char) c;
		char j = (char) d;
		
		int k = e / 10;
		int l = e % 10;
		int m = f / 10;
		int n = f % 10;
		
		System.out.println(g + "" + h +"" + i +"" + j + "" + k + "" + l + "" + m + "" + n);
		
	}

}
