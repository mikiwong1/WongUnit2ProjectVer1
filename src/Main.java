import java.util. Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Welcome!\nEnter coordinate 1: ");
        String coord1 = scan.nextLine();
        System.out.print("Enter coordinate 2: ");
        String coord2 = scan.nextLine();

        int newx1 = Integer.parseInt(coord1.substring(1, coord1.indexOf(",")));
        int newy1 = Integer.parseInt(coord1.substring(coord1.indexOf(" ") + 1, coord1.length() - 1));

        int newx2 = Integer.parseInt(coord2.substring(1, coord2.indexOf(",")));
        int newy2 = Integer.parseInt(coord2.substring(coord2.indexOf(" ") + 1, coord2.length() - 1));

        LinearEquation calc = new LinearEquation(newx1, newy1, newx2, newy2);
        if (newx1 == newx2){
            System.out.println("These points on a vertical line: x = " + newx1);
        }
        System.out.println(calc.lineInfo());
        System.out.print("Enter a value for x:");
        double temp = scan.nextDouble();
        System.out.println();
        System.out.println("The point on the line is: " + calc.coordinateForX(temp));
    }
}
