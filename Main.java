public class Main {
    public static void main(String[] args) {
        Expense[] expenses = new Expense[10];
        expenses[0]=new Expense(1,"Food", 150.0, "Groceries", "2026-06-01");
        expenses[1]=new Expense(2,"Transport", 300.0, "Travel", "2026-06-02");
        
        for(int i=0;i<expenses.length;i++)
        {
            if(expenses[i]!=null)
            {
           expenses[i].display();
            }
        }
    }
    
}