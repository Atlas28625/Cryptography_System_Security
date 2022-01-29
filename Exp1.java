import java.io.*;
class Exp1{
    public static void main(String[] args) throws IOException
    {
        CeaserCipher cc = new CeaserCipher();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int choice = 0;
        int key;
        String input;
        do
        {
            System.out.println("1.Encryption\n2.Decryption\n3.Exit");
            choice = Integer.parseInt(br.readLine());
            if(choice == 3)
            {
                System.out.println("Thank You");
                break;
            }
            System.out.print("Enter key : ");
            key = Integer.parseInt(br.readLine());
            if(choice == 1)
            {
                System.out.println("Enter text: ");
                input = br.readLine();
                System.out.println("Codeword : "+ cc.encrypt(input, key));
            }
            else
            {
                System.out.println("Enter Codeword: ");
                input = br.readLine();
                System.out.println("Text : "+ cc.decrypt(input, key));
            }
        }while(choice!=0);
    }
}

class CeaserCipher
{
    public String encrypt(String text, int key)
    {
        int ch;
        char[] code = text.toCharArray();
        for (int i = 0; i<code.length; i++)
        {
            //System.out.println("Text: " + code[i]);
            ch = (int)(code[i]);
            //System.out.println("numeric value : " + ch);
            if(ch!=' ')
            {
                if(ch >= 'A' && ch <='Z')
                {
                    //System.out.println("Capital Letter");
                    if((ch + key) > 'Z')
                        code[i] = (char)('A' - 1 + (ch+key)-'Z');
                    else
                        code[i] = (char)(ch + key);
                }
                else if(ch >= 'a' && ch <='z')
                {
                    //System.out.println("Lower Letter");
                    if((ch + key) > 'z')
                        code[i] = (char)('a' - 1 + (ch+key)-'z');
                    else   
                        code[i] = (char)(ch + key);
                }
                //System.out.println("Encrypted : " + code[i]);
            }
        }
        return new String(code);
    } 

    public String decrypt(String text, int key)
    {
        int ch;
        char[] code = text.toCharArray();
        for (int i = 0; i<code.length; i++)
        {
            //System.out.println("Text: " + code[i]);
            ch = (int)(code[i]);
            //System.out.println("numeric value : " + ch);
            if(ch!=' ')
            {
                if(ch >= 'A' && ch <='Z')
                {
                    //System.out.println("Capital Letter");
                    if((ch - key) < 'A')
                        code[i] = (char)('Z' - 'A' + (ch-key)+1);
                    else
                        code[i] = (char)(ch - key);
                }
                else if(ch >= 'a' && ch <='z')
                {
                    //System.out.println("Lower Letter");
                    if((ch - key) < 'a')
                        code[i] = (char)('Z' - 'A' + (ch-key)+1);
                    else   
                        code[i] = (char)(ch - key);
                }
                //System.out.println("Decrypted : " + code[i]);
            }
        }
        return new String(code);
    } 
}
/*
Handwritten
Aim
Theory
Solve a sum
Code
Screenshot
Roll number_name_expname */