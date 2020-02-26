import java.util.Scanner;

public class searchArray {
	public static int findIndex(int arr[], int t) {
		
		 // if array is Null 
        if (arr == null) { 
            return -1; 
        } 
  
        // find length of array 
       
        int i = 0; 
  
        // traverse in the array 
        while (i < arr.length) { 
  
            // if the i-th element is t 
            // then return the index 
            if (arr[i] == t) { 
                return i; 
            } 
            else { 
                i = i + 1; 
            } 
        } 
        return -1; 
    } 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int inNum=input.nextInt();
		int index;
		int [] number = {1, 10, 31, 33, 37, 48, 60, 70, 80};
		
		System.out.println("Index position of "+inNum+" is: "
                + findIndex(number, inNum)); 
	}

}
