/**
 * Program for Encapsulation
 */
class Rectangle
{
    private static String color = "red";
    private int length;
    private int width;
    //  VALIDATION METHOD
    private boolean validLen(int length)
    {
        if(length>=5 && length<=20)
        {
            return true;
        }
        else
        {
        return false;
        }
    }
    private boolean validWid(int width)
    {
        if(width>=3 && width<=12)
        {
            return true;
        }
        else{
            return false;
        }
    }
    // CONSTRUCTOR
    public Rectangle(int length,int width)
    {
        if(validLen(length)&& validWid(width))
        {
            this.length = length;
            this.width = width;
        }
        else
        {
            System.err.println("Invalid Dimension");
        }
    }
    // OTHER METHODS
    public void findArea()
    {
        int area = length*width;
        System.out.println("Area is "+area);
    }
    public void viewRectInfor()
    {
        System.out.println("length is "+length);
        System.out.println("width is "+width);
        System.out.println("color is "+color);
    }

}
// MAIN METHOD
public class MainClass1 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(-5, 2);
        Rectangle r2 = new Rectangle(6, 4);
        r1.findArea();
        r2.findArea();
        r1.viewRectInfor();
        r2.viewRectInfor();
    }    
}