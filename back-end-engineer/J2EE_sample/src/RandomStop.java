
public class RandomStop {
	public static void main(String[] args) {
		while(true) {
			int num = (int)(Math.random()*10);
			System.out.println(num);
			if(num==5) {
				System.out.println("hit it");
				break;
			}
		}
	}
}
