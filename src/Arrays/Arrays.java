package Arrays;
import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
	int[] array= new int[5];
	Scanner input = new Scanner(System.in);	
	
	
	int n =array.length;
	int sum=0;
	int product=1;
	int max =0;
	int min=99;
	
	for(int i=0;i<n;i++) {	
		System.out.println("Enter a whole number less than 99: ");
		array[i]=input.nextInt();
		sum+=array[i];
		product*=array[i];
		
		while(array[i]>max) {
			max=array[i];
		}
		while (array[i]<min) {
			min=array[i];
		}
	}
	
	System.out.print("The array is: \n");
	for(int arrayElement :array) {
		System.out.print(arrayElement + " ");
		}
	System.out.print("\n"+"The sum of the elements are "+sum);
	System.out.print("\n"+"The product of the elements are "+product);
	System.out.print("\n"+"The value of the largest element is "+max);
	System.out.print("\n"+"The value of the smallest element is "+min);
	}
	
	
	}
		
 
		
		

	


