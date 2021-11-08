
public class VarAppl {

	public static void main(String[] args) {
		int a = 42;
		System.out.println(a);
		a = 100500;
		System.out.println(a);
		int b = a;
		System.out.println(b);
		double pi = 3.1415926;
		System.out.println(pi);
		double gr = 6.67e43;
		System.out.println(gr);
		float x = a;
		System.out.println(x);
		b = (int) 2.5;
		System.out.println(b);
		b = (int) x;
		System.out.println(b);
		long z = 10_000_000_000l;
		System.out.println(z);
		float y = 9.8f;
		System.out.println(y);
		y = (float) pi;
		System.out.println(y);
		boolean check = true;
		System.out.println(check);
	}

}
