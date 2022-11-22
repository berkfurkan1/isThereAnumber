package isThereAnumber;

public class isThereAnumber {
 public static void main(String[] args) {
	 
	 int [] numbers = new int[] {1,2,5,8,9,7,6};
	 
	 int numberOfWanted = 0;
	 boolean isThereNumber = false;
	 
	 for(int number:numbers) {
		 if (number==numberOfWanted) {
			 isThereNumber=true;
			 break;
		 }
	 }
 if(isThereNumber) {
	 System.out.println("There is a wanted number.");
	 
 }else {
	 System.out.println("There is not a wanted number.");
 }
}
 }
