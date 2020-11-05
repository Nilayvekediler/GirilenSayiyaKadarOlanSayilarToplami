import java.util.Scanner;


public class SayiToplami
{
    public static void main(String [] args)
    {
        int i = 0;
        int n;
        int toplam = 0;

        System.out.println("n sayısını giriniz: ");
        Scanner klavye = new Scanner(System.in);
        n = klavye.nextInt();
        while (i <= n)
        {
            toplam += i;
            i++;
        }
        System.out.print("ilk" + n +" sayinin toplami= "+ toplam);
    }
}
