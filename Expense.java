public class Expense {
    private int id;
    private String title;
    private double amount;
    private String category;
    private String date;
    public Expense(int id, String title, double amount, String category, String date)
    {
        this.id= id;
        this.title=title;
        this.amount=amount;
        this.category=category;
        this.date=date;
    }
    public Expense()
    {  
        this.id=0;
        this.title="";
        this.amount=0.0;
        this.category="";
        this.date="";

    }
    public Expense(int id, String title, double amount, String category)
    {
        this.id=id;
        this.title=title;
        this.amount=amount;
        this.category=category;
        this.date="";
    }
    void display()
        {
            System.out.println("Expense id:"+id);
            System.out.println("Expense title:"+title);
            System.out.println("Expense amount:"+amount);
            System.out.println("Expense category:"+category);
            System.out.println("Expense date:"+ date);
        }
        public void setId(int id)
        {   
            if(id<=0)
            {
                System.out.println("invalid id");
            }
            else{
            this.id=id;
            }
        }
        public int getId()
        {
            return id;
        }
        public void setTitle(String title)
        {
            if(title==null || title.isEmpty())
            {
                System.out.println("invalid title");
            } else { 
                 this.title=title; }
        } public String getTitle() {
            return title;
        }
        public void setAmount(double amount)
        {
            if(Amount<=0)
            {
                System.out.println("invalid amount");
            } else {
                this.amount=Amount;
            }
            }  public double getAmount() {
                return amount;
            }
            public void setCategory(String category)
            {
                if(category==null || category.isEmpty())
                {
                    System.out.println("invalid category");
                } else {
                    this.category=category;
                }
            }
            public String getCategory()
            {
                return category;
            }
            public void setDate(String setDate)
            {
                if(setDate==null || setDate.isEmpty()){
                    System.out.println("invalid date");

                } else {
                    this.date=setDate;
                }
            }
                public String getDate()
                {
                    return date;
                }
            }

    

