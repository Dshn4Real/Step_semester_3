import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter player 1 choice (rock/paper/scissors): ");
        String p1 = sc.nextLine().toLowerCase();

        System.out.print("Enter player 2 choice (rock/paper/scissors): ");
        String p2 = sc.nextLine().toLowerCase();

        if (p1.equals(p2)) {
            System.out.println("It's a draw!");
        } else if ((p1.equals("rock") && p2.equals("scissors")) ||
                   (p1.equals("paper") && p2.equals("rock")) ||
                   (p1.equals("scissors") && p2.equals("paper"))) {
            System.out.println("Player 1 wins!");
        } else {
            System.out.println("Player 2 wins!");
        }

        sc.close();
    }
}