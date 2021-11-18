package GitHub_Work.LargestNumber;
import java.util.Scanner;

public class largest {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Hello, this program will take two numbers and tell you which one is larger");
    System.out.print("Input the first number : ");
    int a = in.nextInt();  
	System.out.print("Input the second number: ");
	int b = in.nextInt(); 
	System.out.println("The larger number is: "+result(a, b));
    in.close();
    }
	public static int result(int x, int y)
     {  
	if(x == y)
		return 0;
	    if(x % 6 == y % 6)
		    return (x < y) ? x : y;
	    return (x > y) ? x : y;
    }
}
