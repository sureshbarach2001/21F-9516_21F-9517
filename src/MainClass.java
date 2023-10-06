
public class MainClass {

	public static void main(String[] args) {
		Calculator obj =new Calculator();
		int sum,sub;
		sum=obj.add();
		sub=obj.subtract();
		System.out.println("Sum is -> "+sum+"\n"+"Subtract is -> "+sub);		
	}

}
