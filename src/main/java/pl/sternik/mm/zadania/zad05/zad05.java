package pl.sternik.mm.zadania.zad05;

public class zad05
{
    public static void main( String[] args )
    {
        String[] tablica = {"Ala", "Ela", "Ola"};

        System.out.println("Pętla FOR:");
        for(int i = 0; i < tablica.length; i++)
        {
            System.out.print(tablica[i] + "\t");
        }

        System.out.println();
        System.out.println();

        System.out.println("Pętla FOREACH:");
        for (String s : tablica) {
            System.out.print(s + "\t");
        }

        System.out.println();
        System.out.println();

        System.out.println("Pętla WHILE");
        int i = 0;
        while (i < tablica.length)
        {
            System.out.print(tablica[i] + "\t");
            i++;
        }



    }
}
