package Chapter_4.Labs.BandBooster;

import java.util.Scanner;

public class TrackBands {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the names of two bands: ");
        String name1 = input.next();
        String name2 = input.next();

        BandBooster band1 = new BandBooster(name1);
        BandBooster band2 = new BandBooster(name2);

        System.out.print("Enter the number of boxes sold by " + band1.getName() + " this week: ");
        int boxesSold1 = input.nextInt();
        band1.updateSales(boxesSold1);

        System.out.print("Enter the number of boxes sold by " + band2.getName() + " this week: ");
        int boxesSold2 = input.nextInt();
        band2.updateSales(boxesSold2);

        System.out.println(band1);
        System.out.println(band2);
    }
}
