import java.util.Scanner;

public class Heat
{

    public static void main(String[]args)
    {
        double heat;

        System.out.print("Lutfen hava sicakligini giriniz:");

        Scanner keyboard = new Scanner(System.in);
        heat = keyboard.nextDouble();

        if (heat < 5)
            System.out.println("Kayak yapmak icin guzel bir hava.");
        else if (heat <= 15)
            System.out.println("Sinemaya gitmek icin guzel bir hava.");
        else if (heat <= 25)
            System.out.println("Piknik yapmak icin guzel bir hava.");
        else if (heat > 25)
            System.out.println("Yuzmek icin guzel bir hava.");






    }
}
