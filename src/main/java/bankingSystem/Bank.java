package bankingSystem;
import java.util.Scanner;
public class Bank
{
    public static void main(String[] args)
    {
        int choice,noOfPeople=0;
        int count=0;
        int totalBalance=2000;
        Scanner sc = new Scanner(System.in);
        Stack stack=new Stack();
        Transaction transaction=new Transaction();
        System.out.println("Welcome to banking application");
        System.out.println("Enter no of people in queue:");
        noOfPeople=sc.nextInt();
        do
        {
            int amount = 0;
            System.out.println("Enter amount");
            amount = sc.nextInt();
            System.out.println("Enter 1 for deposite amount\nEnter 2 for withdraw amount");
            choice = sc.nextInt();
            switch (choice)
            {
                case 1:                                                     //case for deposite amount
                    totalBalance = transaction.depositeAmount(amount, totalBalance);
                    stack.push(totalBalance);
                    System.out.println("Total Balance:" + totalBalance);
                    stack.pop();
                    amount=0;
                    break;
                case 2:                                                    //case for withdraw amount
                    if(totalBalance<=amount)
                    {
                        System.out.println("Insufficient balance");
                    }
                    else
                    {
                        totalBalance = transaction.withdrawAmount(amount, totalBalance);
                        stack.push(totalBalance);
                        System.out.println("Total Balance:" + totalBalance);
                        stack.pop();
                        amount = 0;
                    }
                    break;
                default:
                    System.out.println("you entered Wrong choice");
            }
            count++;
        }while(count<noOfPeople);
    }
}
