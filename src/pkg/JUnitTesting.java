package pkg;
//import java.util.Scanner;

public class JUnitTesting {
	
	public int addInt(int a, int b) {
		return a + b;
	}
	
	public String addString(String a, String b) {
		return a+b;
	}
//	public static void main(String[] args) { 
//		Scanner sc = new Scanner(System.in);
//		String ch = "yes";
//		while (ch.equalsIgnoreCase("yes") || ch.equalsIgnoreCase("y")) {
//			System.out.print("1. Add Numbers\n2.Add Strings\nEnter Your Choice:");
//			int x = sc.nextInt();
//			switch (x) {
//			case 1:
//				try {
//					System.out.print("Enter number A: ");
//					int a = sc.nextInt();
//					System.out.print("Enter number B: ");
//					int b = sc.nextInt();
//					int c = addInt(a,b);
//					System.out.println("Sum is "+c);
//					break;
//				} catch (Exception e) {
//					System.out.println("Error: Enter Integers");
//					break;
//				}
//			case 2:
//				System.out.print("Enter string A: ");
//				String sa = sc.nextLine();
//				System.out.print("Enter string B: ");
//				String sb = sc.nextLine();
//				String ss = addString(sa,sb);
//				System.out.println("Concatenated string is "+ss);
//				break;
//			default:
//				System.out.println("Error: Invalid Choice");
//			}
//			ch = sc.nextLine();
//		}
//		sc.close();
//	}

}
