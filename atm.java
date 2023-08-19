import java.util.*;

/*
Laptop with Browser Icon
We have all come across ATMs in our cities and it is built on Java. This complex project consists offive different classes and is a console-based application. When the system starts the user is prompted with user id and user pin. On entering the details successfully, then ATM functionalities are unlocked. The project allows to perform following operations:

1.Transactions History
2.Withdraw
3.Deposit
4.Transfer
5.Quit
*/
public class atm {
    public int balance ;

    void transactions(int t){
        System.out.println("There are "+t+" transaction are done" );
    }
    void Withdraw(int amount){
        balance -= amount;
        System.out.println("After withdram your new Balance is " +balance);
    }
    void Deposit(int amount){
        balance += amount;
        System.out.println("After deposit your new Balance is " +balance);
    }
    void Transfer(int amount , long accno){
        System.out.println(amount+ " amount Deposited to "+accno+ " account number Successfully!!!" );
        System.out.println("Your account balance is "+(balance-amount));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        atm ATM = new atm();

        int amount ,tran =0;
        int balance=0;
        long accno;
        int c =0;
        int attempts = 3;

        System.out.println("\n************ Welcome to ATM ************* \n");

        while (attempts > 0) {
            System.out.println("Enter the user id :- ");
            String un = sc.nextLine();

            if (un.equals("darsh108")){
                System.out.println("Enter your Pin :- ");
                int pin = sc.nextInt();

                System.out.println("Successfully login ");
                System.out.println("Enter the account balance :- ");
                
                ATM.balance = sc.nextInt();
                c = 1;
                break;
            }else{
                System.out.println("Please enter valid username");
            }
            attempts --;
        }

        if (c == 1){
            int ch = 0;
            do{
                tran++;
                System.out.println("The operation as follows :-\n1.Transaction History \n2.Withdraw \n3.Deposit \n4.Transfer \n5.Quit ");
                ch= sc.nextInt();

                switch (ch) {
                    case 1:
                        ATM.transactions(tran);
                        break;

                    case 2:
                        System.out.println("Enter the amount you have to withdraw :- ");
                        amount = sc.nextInt();
                        ATM.Withdraw(amount);
                        break;

                    case 3:
                        System.out.println("Enter the amount you have to Deposit :- ");
                        amount = sc.nextInt();
                        ATM.Deposit(amount);
                        break;

                    case 4:
                        System.out.println("Enter the amount you have to Transfer :- ");
                        amount = sc.nextInt();
                        System.out.print("Enter the account number of receiver's bank:- ");
                        accno=sc.nextLong();
                        ATM.Transfer(amount , accno);
                        break;
                        
                    case 5:
                        System.out.println("Thank you");
                        break;
                
                    default:
                        System.out.println("Enter valid choice");
                }

            }while(ch !=5 );
        }
    }
}
