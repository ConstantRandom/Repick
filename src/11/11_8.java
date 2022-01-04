public class 11_8 {

	public static void main(String[] args)  {
			Account customer= new Account("George",1122,1000.0);
			customer.setannualInterstRate(1.5);
			customer.withDraw(30);
			customer.withDraw(40);
			customer.withDraw(50);
			customer.deposit(5);
			customer.deposit(4);
			customer.deposit(2);
			System.out.println("�˻�������" + customer.name+"\n"+ "�˻�id��" + customer.getid());
			System.out.println("                  ʱ��              ����      ���     �˻����");
			while(!customer.transactions.isEmpty()) {
				Transaction temp = customer.transactions.remove(0);
				temp.pt();
			}
		}
	

}
