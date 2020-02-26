import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Arraysort {
	public static void main(String args[]) {
		int [] num =new int[] { 70, 31, 80, 37, 10, 1, 48, 60,33,80};
		int sum = 0;
		int size = num.length;
		for (int i = 0; i < num.length; i++) {
		     System.out.print(num[i]+",");
		}
		System.out.println();
		Arrays.sort(num);
		for(int i = 0; i < num.length; i++){
		     System.out.print(num[i]+",");
		     sum += num[i];
		}
		
		int avg =  (sum/size);
		
		System.out.println();
		System.out.println("max:"+num[size-1]+";min:"+num[0]+";avg="+avg);
		
		for(int i = 0; i < (num.length/2) ; i++){//change index value
		
		   
			int temp = num[i];
		    num[i] = num[num.length - i - 1];
		    num[num.length - i - 1] = temp;
		    
		}
		
		
		HashMap<Integer, Integer> repe= new HashMap<Integer, Integer>();
		for (int i = 0; i < num.length; ++i) {
		      int item = num[i];

		      if (repe.containsKey(item))
		          repe.put(item, repe.get(item) + 1);
		      else
		          repe.put(item, 1);
		  }
		  StringBuilder sb = new StringBuilder();

		  int overAllCount = 0;

		  for (Map.Entry<Integer, Integer> e : repe.entrySet()) {
		      if (e.getValue() > 1) {
		          overAllCount += 1;

		          sb.append("\n");
		          sb.append(e.getKey());
		          sb.append(": ");
		          sb.append(e.getValue());
		          sb.append(" times");
		      }
		  }

		  if (overAllCount > 0) {
		      sb.insert(0, " repeated numbers:");
		      sb.insert(0, overAllCount);
		      sb.insert(0, "There are ");
		  }

		  System.out.print(sb.toString());
		
		System.out.println();
		
	}
}
