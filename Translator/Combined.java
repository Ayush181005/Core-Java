import java.util.Scanner;
public class Combined{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		System.out.println("WELCOME TO TOP-SECRET LANGUAGE TRANSLATOR");
		System.out.println("Enter the user name:");
		String username = sc.nextLine();
		if(username.equals("Sanskriti") || username.equals("Dhairya")){
			System.out.println("Enter the password:");
			String password = sc.nextLine();
			if(password.equals("AyUsHlOvEdHaIrYa") || password.equals("JaImItLoVeSaNsKrItI")){
				System.out.println("From which language to which language would you like to translate:");
				System.out.println("1_____Normal to Secret");
				System.out.println("2_____Secret to Normal");
				System.out.println("3_____Exit");
				int choice = sc2.nextInt();
				switch(choice){
					case 1:
						System.out.println("Enter a phrase:");
						String str = sc.nextLine();
						str = str.replace('a',' ');
						str = str.replace('b','!');
						str = str.replace('c','-');
						str = str.replace('d','(');
						str = str.replace('e','3');
						str = str.replace('f',':');
						str = str.replace('g',')');
						str = str.replace('h','&');
						str = str.replace('i','8');
						str = str.replace('j','#');
						str = str.replace('k','*');
						str = str.replace('l','"');
						str = str.replace('m',';');
						str = str.replace('n','?');
						str = str.replace('o','9');
						str = str.replace('p','0');
						str = str.replace('q','1');
						str = str.replace('r','4');
						str = str.replace('s','_');
						str = str.replace('t','5');
						str = str.replace('u','7');
						str = str.replace('v','~');
						str = str.replace('w','2');
						str = str.replace('x','6');
						str = str.replace('y','@');
						str = str.replace('z','`');
						System.out.println("The translated line is: \n"+str);
						break;
						
					case 2:
						System.out.println("Enter a phrase:");
						str = sc.nextLine();
						str = str.replace(' ','a');
						str = str.replace('!','b');
						str = str.replace('-','c');
						str = str.replace('(','d');
						str = str.replace('3','e');
						str = str.replace(':','f');
						str = str.replace(')','g');
						str = str.replace('&','h');
						str = str.replace('8','i');
						str = str.replace('#','j');
						str = str.replace('*','k');
						str = str.replace('"','l');
						str = str.replace(';','m');
						str = str.replace('?','n');
						str = str.replace('9','o');
						str = str.replace('0','p');
						str = str.replace('1','q');
						str = str.replace('4','r');
						str = str.replace('_','s');
						str = str.replace('5','t');
						str = str.replace('7','u');
						str = str.replace('~','v');
						str = str.replace('2','w');
						str = str.replace('6','x');
						str = str.replace('@','y');
						str = str.replace('`','z');
						System.out.println("The translated line is: \n"+str);
						break;
						
					case 3:
						System.exit(0);
				}
			}
			else{
				System.out.println("INCORRECT PASSWORD!!!");
			}
		}
		else{
			System.out.println("INCORRECT USERNAME!!!");
		}
	}
}