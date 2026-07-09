import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Expense[] expenses= new Expense[10];
        int count=0;
        int choice=0;
        while(choice != 5)
        {
            System.out.println("\n====Expense Tracker=====");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Delete Expense");
            System.out.println("4. Update Expense");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice=sc.nextInt();

            switch(choice)
            {
                case 1: 
                boolean idExists=false;
                System.out.print("enter expense id:");
                int id=sc.nextInt();
                sc.nextLine();
                for(int i=0;i<count;i++)
                {
                    if(expenses[i].getId()==id)
                    {
                        idExists=true;
                        break;

                    }
                }
                    if(idExists)
                    {
                        System.out.println("expense id already exists");
                        break;
                    }
                
                if(!idExists)
                {
                System.out.print("enter expense title:");
                String title=sc.nextLine();
                System.out.println("enter expense amount:");
                double amount=sc.nextDouble();
                sc.nextLine();
                System.out.print("enter expense category:");
                String category=sc.nextLine();
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
                    {
                        System.out.println("no expenses found");
                        break;
                    }
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
                    if(count==0)
                    {
                        System.out.println("no expenses found");
                        break;
                    } 
                        
                    else{ 
                        System.out.println("enter the expense id you want to update");
                        int updateId=sc.nextInt();
                        sc.nextLine();
                        boolean found=false;
                        for(int i=0;i<count;i++)
                        {
                            if(expenses[i].getId()==updateId)
                            {
                                found=true;
                                System.out.println("enter new title");
                                String newTitle=sc.nextLine();
                                expenses[i].setTitle(newTitle);
                                System.out.println("enter new amount");
                                double newAmount=sc.nextDouble();
                                sc.nextLine();
                                expenses[i].setAmount(newAmount);
                                System.out.println("enter new category");
                                String newCategory=sc.next();
                                expenses[i].setCategory(newCategory);
                                System.out.println("enter new date");
                                String newDate=sc.next();
                                expenses[i].setDate(newDate);
                                System.out.println("Expense updated successfully");
                                break;
                            }
                        }
                        if(!found)
                        {
                            System.out.println("the expense id is invalid");
                        }
                        break;

                    }
                case 5:
                System.out.println("Exit");
                break;
                default: 
                System.out.println("Invalid choice");
            }
            
        }
        sc.close();
    }
}
