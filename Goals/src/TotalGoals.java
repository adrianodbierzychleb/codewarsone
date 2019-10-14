import java.util.Scanner;

public class TotalGoals {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Input number of league goals scored");
        int goalsLeague = input.nextInt();
        System.out.println("Input number of cup goals scored");
        int goalsCup = input.nextInt();
        System.out.println("Input number of champions league goals scored");
        int goalsChampions = input.nextInt();

        int total = totalGoals(goalsLeague, goalsCup, goalsChampions);

        System.out.println("Total number of goals scored is: " + total);
    }

    public static int totalGoals(int a, int b, int c)
    {
        int sum = 0;
        sum = a + b + c;

        return sum;
    }

}
