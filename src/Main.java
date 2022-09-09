import java.util.*;
class GuessTheNumber
{
    public static void main(String[] args)
    {
        System.out.println(">>>>>>> Welcome to the guessing the number game :) <<<<<<<");
        System.out.println("Enter a number between 1 to 10");
        Scanner sc = new Scanner(System.in);
        double d = Math.random()*10;
        int rand = (int)Math.floor(d)+1;
        System.out.println(rand);
        boolean flag = false;
        for(int i=1; i<=3; i++)
        {
            System.out.println("Please enter a number :)");
            int user = sc.nextInt();
            if(user==rand)
            {
                System.out.println("Congrats you win :)!!");
                flag = true;
                break;
            }
            if(user>rand)
            {
                System.out.println("Too low. Get to my standard noob!");
            }
            else
            {
                System.out.println("Too high. Get your ass back down!");
            }
        }
        if(flag==false)
            System.out.println("Oof!Sorry you lost! Better luck next time. Come back again to get rekt ;)   !!!!");
    }
}