import java.util.*;
public class 11_16 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
  Scanner input = new Scanner(System.in);
  
  ArrayList<String> box = new ArrayList<>();
  int num1  = (int)(Math.random()*10);
  int num2  = (int)(Math.random()*10);
System.out.print("What is " + num1 + " + "  + num2 + " ? ");
int num = input.nextInt();
while(true) {
	
String s = (String)(num+"1");
if (box.contains(s)) {
	System.out.print("You already entered " + num+"\n");
	System.out.print("Wrong answer . Try again . What is " + num1 + " + "  + num2 + " ? ");

	num = input.nextInt();
}
else {
	box.add((String)(s));
	if(num == num1+num2) {
		System.out.print("You got it!\n");

		break;
	}
	else {
		System.out.print("Wrong answer . Try again . What is " + num1 + " + "  + num2 + " ? ");
		num = input.nextInt();
	}
}


}
	}
	
}
 