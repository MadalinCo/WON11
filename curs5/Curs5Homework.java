import java.util.Random;

public class Curs5Homework{
	public static void main(String[] args){
		sumofDonations();
		System.out.println(sumofDonations());
		
	}
	public static int sumOfInt(){
		int a[] = {10,20,30};
		int sum = 0;
		for(int i=0;i<=a.length-1;i++){
			sum=sum+a[i];
		}
		return sum;
	 }
	 public static int oddNumbers(){
	 	int a[]={10,15,18,19,70,87,111,3};
	 	for(int value:a){
	 		if(value%2!=0){
	 			System.out.println(value);
	 			continue;
	 		}
	 	}
	 	return 0;
	 }
	 public static int numbersHigherThanX(){
	 	int a[]= {1,3,4,6,7,9,12};
	 	int x = 5;
	 	for (int value:a){
	 		if(value>x){
	 			System.out.println(value);
	 			continue;
	 		}
	 	}
	 	return 0;
	 }

	 public static String sumofDonations(){
	 	 Random r = new Random();
	 	int nededDonations = 1000;
	 	int collectedSum = 0;
	 	int result = new Array(1000)
		result = result.fill(0).map(()=>  Math.random());
	 	
	 	}

	 	
	 } 
}



