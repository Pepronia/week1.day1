package week1.day1;

public class CheckNegativeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int num = -40;
           if (num > 0)
           {
        	   System.out.println("Number is positive");
           }
           else if (num < 0)
           {
        	   System.out.println("Number is negative");
        	   num = num * -1;
        	   System.out.println("Converted positive number is" +num);
           }
	}

}
