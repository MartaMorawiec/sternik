package pl.sternik.mm.zadania.zad06;

public class zad06
{
    public static void main( String[] args )
    {
        int[][] tablica = {{3,8,16},
                {1,22,28,24},
                {3},
                {41,42}};

        int min = tablica[0][0];
        int max = tablica[0][0];

        for(int w = 0; w < tablica.length; w++) {
            for (int k = 0; k < tablica[w].length; k++) {
                System.out.print(tablica[w][k] + "\t");
                if (tablica[w][k] > max) { max = tablica[w][k]; }
                if (tablica[w][k] < min) { min = tablica[w][k]; }
            }
            System.out.println();
        }

        System.out.println("Największa wartość = " + max);
        System.out.println("Najmniejsza wartość = " + min);
    }
}
