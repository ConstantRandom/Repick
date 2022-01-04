import java.util.*;
public class 11_17 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an inter m: ");
    
    int num = input.nextInt();
     ArrayList list = prime(num);
     int sum=1;
     while(!list.isEmpty())
     { sum=sum*(int)(list.remove(0));
     }
     System.out.println("The smallest number n for m * n to be a perfect square is "+sum+"\n"+"m * n is "+ num*sum);
	}
	
	public static ArrayList prime(int n) {
		ArrayList x = new ArrayList();
		for(int i=2;;) {
			if(n%i==0) {
				
			if(x.contains(i))
				{Object j= i;
				x.remove(j);}
			else
				{x.add(i);}
			n/=i;
			}
			else {
				i++;
			}
			if(n==1) {break;}
		}
		return x;
	}

}
