import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Expense[] expenses= new Expense[10];
        int count=0;
        int choice=0;
        while(choice != 4)
        {
            System.out.println("\n====Expense Tracker=====");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Delete Expense");
            System.out.println("4.Exit");

            System.out.print("Enter your choice: ");
            choice=sc.nextInt();

            switch(choice)
            {
                case 1: 
                boolean idExists=false;
                System.out.print("enter expense id:");
                int id=sc.nextInt();
                for(int i=0;i<count;i++)
                {
                    if(expenses[i].getId()==id)
                    {
                        idExists=true;
                        break;

                    }
                    if(idExists)
                    {
                        System.out.println("expense id already exists");
                        break;
                    }
                }
                if(!idExists)
                {
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
                }
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
                    if(count==0)
                        System.out.println("no expenses found");
                    else {
                        System.out.println("enter the expense id to delete:");
                        int deleteId=sc.nextInt();
                         boolean found=false;
                        for(int i=0;i<count;i++)
                        {
                            if(expenses[i].getId()==deleteId)
                                
                            {
                                 found = true;
                                for(int j=i;j<count-1;j++)
                                {
                                    expenses[j]=expenses[j+1];
                                    
                                }
                                expenses[count-1]=null;
                                count--;
                                System.out.println("Expense deleted successfully");
                                break;
                            }
                                

                        }
                        if(!found)
                        {
                            System.out.println("expense not found");
                           
                        }
                        break;
                    }
                case 4:
                System.out.println("Exit");
                break;
                default: 
                System.out.println("Invalid choice");
            }
            
        }
        sc.close();
    }
}