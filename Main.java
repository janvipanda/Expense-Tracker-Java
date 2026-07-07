import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Expense[] expenses= new Expense[10];
        int count=0;
        int choice=0;
        while(choice != 3)
        {
            System.out.println("\n====Expense Tracker=====");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            choice=sc.nextInt();

            switch(choice)
            {
                case 1: 
                System.out.print("enter expense id:");
                int id=sc.nextInt();
                System.out.print("enter expense title:");
                String title=sc.next();
                System.out.println("enter expense amount:");
                double amount=sc.nextDouble();
                System.out.print("enter expense category:");
                String category=sc.next();
                System.out.print("enter expense date:");
                String date=sc.next();

                expenses[count]=new Expense(id,title,amount,category,date);
                count++;
                System.out.println("Expense added successfully");
                break;
                case 2: 
                if(count==0)
                {
                    System.out.println("no expenses found");
                } else {
                    for(int i=0;i<count;i++)
                    {
                        expenses[i].display();
                        System.out.println();
                    }
                }
                break;
                case 3:
                System.out.println("Exit");
                break;
                default: 
                System.out.println("Invalid choice");
            }
            
        }
        sc.close();
    }
}