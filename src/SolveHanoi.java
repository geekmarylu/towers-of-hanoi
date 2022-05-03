import java.util.Scanner;

public class SolveHanoi {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("This Towers of Hanoi Puzzle uses three poles/pegs");
        System.out.println("You will need to input three character names for the poles:");

        String pole1 = input.next();
        String pole2 = input.next();
        String pole3 = input.next();

        System.out.println("Please enter the number of disk(s) you would like?");
        int noOfDisks = input.nextInt();

        System.out.println("--------------------------------------------------------------------");

        System.out.println("The solution for the Towers of Hanoi with " + noOfDisks + " disks \nand the three poles is: " + pole1 + " " + pole2 + " " + pole3 + " ");
        moveDisks(pole1,pole2,pole3,noOfDisks);
    }

    public static void moveDisks(String pole1, String pole2, String pole3, int numberOfDisks) {
        if (numberOfDisks == 1) {
            System.out.println("Disk 1 from " + pole1 + " to " + pole3);
        } else {
            moveDisks(pole1, pole3, pole2, numberOfDisks - 1);
            System.out.println("Disk " + numberOfDisks + " from " + pole1 + " to " + pole3);
            moveDisks(pole2, pole1, pole3, numberOfDisks - 1);
        }
    }


}
