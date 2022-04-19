package week1.day1;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int number = 12 ,flag =0;
for( int i = 2;i<number;i++)
{
if (number%i ==0)
	
{
	System.out.println("Number is not prime" +number);
	flag = 1;
	
	break;
}
}
 if (flag == 0)
{
	System.out.println("Number is  prime" +number);
}
	}

}
