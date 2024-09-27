import java.util.Scanner;

public class Game {
    public String name;
    public int maxNumPlayers;
    public Game(String name, int maxNumPlayers) {
        this.name = name;
        this.maxNumPlayers = maxNumPlayers;
    }
    public String toString(){
        return "Maximum no of players for" + name + " is " + maxNumPlayers;
    }
}
class GameWithTimeLimit extends Game {
    private int timeLimit;
    public GameWithTimeLimit(String name, int maxNumPlayers, int timeLimit) {
        super(name, maxNumPlayers);
        this.timeLimit = timeLimit;
    }
    @Override
    public String toString(){
        return super.toString() + "\n TimeLimit for "+ name +"is " + timeLimit +"minutes.";
    }
}
class Program4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Game: ");
        String gameName = sc.nextLine();
        System.out.println("Enter max number of players: ");
        int maxNumPlayers = sc.nextInt();
        Game game = new Game(gameName, maxNumPlayers);
        System.out.println("Enter a Game that has time limit: ");
        gameName = sc.next();
        System.out.println("Enter max number of players: ");
        maxNumPlayers = sc.nextInt();
        System.out.println("Enter the time limit in minutes: ");
        int timeLimit = sc.nextInt();
        GameWithTimeLimit gmt = new GameWithTimeLimit(gameName, maxNumPlayers, timeLimit);
        System.out.println(game);
        System.out.println(gmt);
    }
}
