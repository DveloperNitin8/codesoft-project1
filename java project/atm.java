import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        int balance=100000,withdraw,deposite;
        Scanner sc =new Scanner(System.in);
        while (true) {
            System.out.println("Automated Teller Machine");
            System.out.println("Choose 1 for withdraw");
            System.out.println("Choose 2 for deposite");
            System.out.println("Choose 3 for check balance");
            System.out.println("Choose 4 for exit");
            System.out.print("Choose the operation you want to perform:");

            int choice=sc.nextInt();
            switch (choice) {
                case 1:
                System.out.print("Enter money to be withdraw:");
                withdraw=sc.nextInt();
                if (balance>=withdraw) {
                    balance-=withdraw;
                    System.out.println("Please collect your money");
                    
                }
                else{
                    System.out.println("Insufficient balance");
                }
                System.out.println("");
                    
                    break;
                    case 2:
                    System.out.print("Enter money to be deposited:");
                    deposite=sc.nextInt();
                    balance+=deposite;
                    System.out.print("the current balance is "+balance);
                    System.out.println("Your money hase been succesfully deposited" );
                    System.out.println("");

                    break;

                    case 3:
                    System.out.print("Balance:"+balance);
                    System.out.println("");
                    break;

                    case 4:
                    System.exit(0);
                    
            }
        }
    }
}
