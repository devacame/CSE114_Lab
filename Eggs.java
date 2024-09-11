// Hyunwoo(Henry) Ahn 116598178

import java.util.Scanner;

public class Eggs {
    public static void main(String args[]) {
        int eggs = -1, dozens, loose;
        double dozenPrice, loosePrice, totalPrice;
        Scanner input = new Scanner(System.in);
        while (eggs < 0) {
            System.out.print("Number of eggs in the order: ");
            eggs = input.nextInt();
        }
        input.close();
        dozens = eggs / 12;
        dozenPrice = dozens * 3.25;
        loose = eggs % 12;
        loosePrice = loose*0.45;
        totalPrice = dozenPrice + loosePrice;
        System.out.println(String.format("You ordered %d eggs. That's %d dozen(%d x 12 = %d eggs) at $3.25 per dozen (%d x $3.25 = $%.2f) and %d loose eggs at 45 cents (%d x 45c = $%.2f) for a total of $%.2f ($%.2f + $%.2f = $%.2f).", eggs, dozens, dozens, dozens*12, dozens, dozenPrice, loose, loose, loosePrice, totalPrice, dozenPrice, loosePrice, totalPrice));
    }
}
