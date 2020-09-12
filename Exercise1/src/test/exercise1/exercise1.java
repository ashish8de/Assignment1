package test.exercise1;

public class exercise1 {

	public static void main(String[] args) {
		
		int remainder = 0;
		
		//Loop from 100 to 1 in descending order
		for(int lastNum = 100; lastNum > 0; lastNum--) {
			remainder = lastNum%(5*3);
			
			//Check if number is divisible by both 5 and 3
			if(remainder==0) {
				System.out.println("Testing");
			} else {
				if (remainder%5 == 0) {
					//Check if number is only divisible by 5
					System.out.println("Agile");
				} else if (remainder%3 == 0){
					//Check if number is only divisible by 3
					System.out.println("Software");
				} else {
					//number not divisible by 5 or 3
					System.out.println(lastNum);
				}
			}
		}

	}

}
