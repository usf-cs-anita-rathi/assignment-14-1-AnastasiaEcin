import java.util.Scanner;

public class ShakeHands 
{    
   public static int ShakeHands(int people)
    {
       if(people>2) 
        {
         return ShakeHands(people - 1) + (people - 1);
        }
       else if(people == 2)
       {
        return 1;         
       }
    return 0;
    } 
    
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Number of people in the room?"); 
        int s = input.nextInt();
        System.out.println(ShakeHands(s)+" shakes");
    }
}