import java.util.Scanner;
public class PlayerSelection {

    public static void main(String[] args){
        Scanner MS = new Scanner(System.in);
        System.out.print("A : Add a player\n" +
                "V : View all players\n");
        String input = MS.next();
        switch (input){
            case "A":{
                System.out.print("Enter Player name : ");
                String Name = MS.nextLine();
                System.out.print("Enter Player age");
                int Age = MS.nextInt();
                System.out.print("Enter Player Type");
                String Type = MS.next();
                System.out.print("Enter Player Statistics");
                int Statistics = MS.nextInt();
                Player player1 = new Player(Name,Age,Type,Statistics);
            } case "v":{
            }
        }
    }
}
