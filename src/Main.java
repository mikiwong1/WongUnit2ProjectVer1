import java.util. Scanner;
public class Main {
    public static void main(String[] args){
        System.out.print("Welcome!\nEnter coordinate 1: ");
        Scanner scan = new Scanner(System.in);


        String coord1 = scan.nextLine();
        int newx1 = Integer.parseInt(coord1.substring(1, coord1.indexOf(",")));
        int newy1 = Integer.parseInt(coord1.substring(coord1.indexOf(",") + 2, coord1.length() - 1));

        System.out.println("Enter coordinate 2: ");
        String coord2 = scan.nextLine();
        int newx2 = Integer.parseInt(coord1.substring(1, coord1.indexOf(",")));
        int newy2 = Integer.parseInt(coord1.substring(coord1.indexOf(",") + 2, coord1.length() - 1));

        LinearEquation equation = new LinearEquation(newx1, newy1, newx2, newy2);


    }
}
