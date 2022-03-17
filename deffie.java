// Deffie - Hellman key exchange.
import java.util.Scanner;
class deffie
{
    public static void main(String[] args)
    {
        System.out.println("Enter the stuf");
        Scanner sc = new Scanner(System.in);
        int g,p;
        g = sc.nextInt();
        p = sc.nextInt();
        System.out.println("Private keys");
        int private1 = sc.nextInt();
        int private2 = sc.nextInt();

        // generating the public keys
        int x = power(g,private1, p);
        int y = power(g,private2, p);

        System.out.println(x+" "+y);

        int ka,kb; // secret keys

        ka = power(y,private1,p);
        kb = power(x,private2,p);

        System.out.println(ka+" "+kb);

    }
    public static int power(int g, int a, int p)
    {
        double result = (Math.pow(g,a)%p);
        return (int)result;
    }
}
