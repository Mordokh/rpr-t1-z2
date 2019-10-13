package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main
{
    static int sumaCifara(int n)
    {
        int suma=0;
        int x=n;
        while (x>0)
        {
            suma=suma+(x%10);
            x=x/10;
        }
        return suma;
    }

    public static void main(String[] args)
    {
        int x,n;
        Scanner ulaz=new Scanner(System.in);
        System.out.println("Unesite broj n: ");
        n=ulaz.nextInt();
        System.out.println("Izmedju 1 i "+ n +" su sljedeci brojevi djeljivi sa sumom svojih cifara: ");

        for (int i=2; i<n; i++)
        {
            x=sumaCifara(i);
            int d=i%x;
            if (d==0)
            {
                System.out.print(i + " ");
            }
        }
    }
}

