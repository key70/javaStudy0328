import java.util.Scanner;

class Test01{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		
		System.out.println("�̸��Ӿ�?");
		name = sc.next();

		System.out.println("����̰�?");
		age = sc.nextInt();

		System.out.println("����� �̸��� " + name + "�̰� ���̴� " + age +"�� �̱���!");
	}
}
