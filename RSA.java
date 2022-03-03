import java.util.Scanner;
class RSA
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\nRSA Algorithm");
        System.out.print("Enter p : ");
        int p = sc.nextInt();

        System.out.print("Enter q : ");
        int q = sc.nextInt();

        System.out.print("Enter k : ");
        int k = sc.nextInt();

        System.out.print("Enter message(number) : ");
        int msg = sc.nextInt();        

        int n = p*q;
        int e = 2;

        int phin = (p-1) * (q-1);
        while(e<phin)
        {
            if(gcd(e,phin) == 1)
                break;
            else
                e++;
        }
        int private_key =  ((k*phin) +1)/e;
    }

    static int gcd(int a, int b)
    {
        int temp;
        while(true)
        {
            temp = a%h;
            if(temp == 0)
            {
                return b;
            }
            a = b;
            b = temp;
        }
    }
}
