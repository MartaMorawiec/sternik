package pl.sternik.mm.zadania.zad07;

public class zad07
{
    public static void main( String[] args )
    {
        int[] tablica = {1,45,23,67,3,15,23,33};

        int x = 5;

        System.out.println();
        System.out.println("Pierwsza liczba w tablicy podzielna przez x (pętla for):");
        for (int i = 0; i < tablica.length; i++)
        {
            if (tablica[i] % x == 0) {
                System.out.println("Liczba podziela przez " + x + " znajduje się na pozycji " + i);
                break;
            }
        }


        System.out.println("Pierwsza liczba w tablicy podzielna przez x (pętla while):");
        int i = 0;
        while(x < tablica.length && tablica[i] % x != 0)
        {
            System.out.println("Liczba podziela przez " + x + " znajduje się na pozycji " + i);
            break;
        }
    }
}
