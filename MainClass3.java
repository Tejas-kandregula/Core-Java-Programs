// Java Program for Encapsulation with the req conditions
class Book{
    private static double profit =10;
    private String title;
    private String author;
    private int price;
    private boolean validTitle(String title)
    {
        boolean q = false;
        if(twoWords(title) && alphaNum(title) && captial(title))
        {
            q= true;
        }
        return q;
    }
    private boolean validAuthor(String author)
    {
        boolean q = false;
        if(limitAuthor(author))
        {
            q = true;
        }
        return q;
    }
    private boolean validPrice(int price)
    {
        boolean q = false;
        if(price>=250 && price<=580)
        {
           q= true;
        }
        return q;
    }
    private boolean twoWords(String title)
    {
        boolean q = false;
        if(title.contains("_"))
        {
            String [] s1 = title.split("_");
            int a = s1.length;
            if(a==2)
            {
                q= true;
            }
            
        }
        return q;
       
    }
     private boolean alphaNum(String title)
    {
        boolean q = false;
        for(int i=0;i<=title.length()-1;i++)
        {
            char ch = title.charAt(i);
            if((Character.isDigit(ch))||((Character.isAlphabetic(ch) || ch =='_')))
            {
                q = true;
            }
          // System.out.println(q);
        }
         return q;
    }
      public boolean captial(String title)
     {
        String [] s1 = title.split("_");
        char a = s1[0].charAt(0);
        char b = s1[1].charAt(0);
        boolean q = false;
        if((a>='A'&& a<='Z')&& (b>='A' && b<='Z'))
        {
            q = true;
        }
        return q;
     }
    private boolean limitAuthor(String author)
    {
        boolean q = false;
        // String s ="chetan abhilash sai kiran uday sagar raj tej";
        String [] a = {"chetan","abhilash","sai","kiran","uday","sagar","tej","raj"};
        for(int i=0;i<=a.length-1;i++)
        {
            if (author.equals(a[i]))
            {
                q = true;
            }
        }
        return q;
    }
    public Book(String title, String author, int price)
    {
        if(validAuthor(author)&& validTitle(title) && validPrice(price))
        {
            this.title = title;
            this.author = author;
            this.price = price;
        }
        else{
            System.err.println("Invalid data");
        }
    }
    public double findcp()
    {
            double cp = price-(profit/100)*price;
            return cp;
    }
    public void viewDetails()
    {
        System.out.println("The book "+title+" was written by "+author+" had sold for "+price+" where the actual price of the book is "+findcp());
    }
}
public class MainClass3 {
    public static void main(String[] args) {
    Book b1 = new Book("ohmsanti", "chetan", 251);
    Book b2 = new Book("Clever_Fox", "tej", 300) ;
    Book b3 = new Book("Flat_Share", "sai", 400);
    b1.viewDetails();
    b2.viewDetails();
    b3.viewDetails();     

    }
    
}
