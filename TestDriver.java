
/**
 * Write a description of class TestDriver here.
 *
 * @author R. Shiroya
 * @version (a version number or a date)
 */
public class TestDriver
{
   public static void main(String[] args)
   {
       CommissionEmployee ce1;
       ce1 = new CommissionEmployee("Rhytham", "Shiroya", "123456879", 3000, 0.10);
       System.out.print(ce1.toString());
    }
}
