import java.util.Scanner;

class Test01{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		
		System.out.println("이름머야?");
		name = sc.next();

		System.out.println("몇살이고?");
		age = sc.nextInt();

		System.out.println("당신의 이름은 " + name + "이고 나이는 " + age +"살 이군요!");
	}
}
