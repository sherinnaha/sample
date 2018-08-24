
public class DemoStringBuffer {
  public static void main(String []args) {
		// TODO Auto-generated method stub
		StringBuilder  builder =new StringBuilder("citi1");
		System.out.println("initial value:-"+builder);
		builder.append(",EON");
		System.out.println("NEW VALUE:-"+builder);
		System.out.println(builder.capacity());
	}
}
