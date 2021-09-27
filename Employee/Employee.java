/**
 * Write a description of class Employee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Employee
{
 public static void main(String[] args){
	String username = "admin";
    String password = "Admin";
    while(true){
        System.out.println("Enter a choice:");
        System.out.println("1_____Login");
        System.out.println("2_____Exit");
        Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
        int choice = sc.nextInt();
			switch(choice){
				case 1:
					System.out.println("Enter the username:");
					String user = sc2.nextLine();
                    
					if(user.equals(username)){     //if username scan begins
						System.out.println("Enter the password:");
						String pass = sc2.nextLine();
						if(pass.equals(password)){       //if password scan begins
							System.out.println("WELCOME!!! YOU SUCCESSFULLY ENTERED THE SYSTEM!!!");
							while(true){         //while begins
								System.out.println("Enter a choice:");
								System.out.println("1_____View Salary");
								System.out.println("2_____Logout");
								int choice2 = sc.nextInt();
									switch(choice2){      //switch begins
										case 1:
											int bs=1000, s=2000, bp=100, bf=200;
											System.out.println("BASIC SALARY = 1000$\nSALARY = 2000$\nBONUS FOR PART TIME = 10%\nBONUS FOR FULL TIME = 10%\nLEAVE BONUS = 8%");
											System.out.println("Enter the first name of the employee:");
											String name = sc2.nextLine();
											System.out.println("Enter the last name of the employee:");
											String sirname = sc2.nextLine();
                                            System.out.println("Enter 1 if he/she is part time and 2 if he/she is a full time employee:");
											int choice3 = sc.nextInt();
											switch(choice3){ //switch for salary begins
												case 1:
													System.out.println("FULL NAME : "+name+" "+sirname);
													System.out.println("BASIC SALARY : 1000$");
													System.out.println("BONUS = 10%");
													System.out.println("LEAVE BONUS = 8%");
													int ts = bs + bp + 80;
													System.out.println("Total Salary = "+ts);
													break;
													
												case 2:
													System.out.println("FULL NAME : "+name+" "+sirname);
													System.out.println("SALARY : 2000$");
													System.out.println("BONUS = 10%");
													System.out.println("LEAVE BONUS = 8%");
													ts = s + bf + 160;
													System.out.println("Total Salary = "+ts);
													break;
													
												default:
													System.out.println("INVALID CHIOICE");
											}
											break;
                                    
										case 2:
											break;
                                    
										default:
											System.out.println("INVALID CHIOICE");
											break;
									}    //switch ends
								break;
								}    //while ends
							}   //if password scan ends
							else{   //else password scan begins
								System.out.println("INCORRECT PASSWORD");
							}    //else password scan ends
						}    //if username scan ends
						else{
							System.out.println("INCORRECT USERNAME");
						}
                    
				case 2:
					System.exit(0);
                    
				default:
					System.out.println("INVALID CHOICE");
					break;
            }//main switch ends
        } 
    }
}
