
import java.util.Scanner;

public class Game {
    private Stadium stadium;
    private Team homeTeam;
    private Team visitingTeam;
    private SoccerBall ball;
    private Referee majorReferee;
    private Referee[] linesmen;
    
    public static void main(String[] args){
        Game game = new Game();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            if (scanner.nextLine().equalsIgnoreCase("Start")) {
                System.out.println("Here we go! Please select home team first:\n" +
                    "Real Madrid, Barcelona, Manchester United, Chelsea, Juventus, AC Milan");
            }
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("Real Madrid") || input.equalsIgnoreCase("R") || input.equalsIgnoreCase("1")) {
                Team homeTeam = new Team("Madrid");
                homeTeam.setHeadCoach(new Coach("Mike", 40, 10));
                
                Coach[] assistantCoaches = new Coach[2];
                assistantCoaches[0] = new Coach("John", 39, 12);
                assistantCoaches[1] = new Coach("Mark", 45, 9);
                homeTeam.setAssistantCoaches(assistantCoaches);
                
                Player[] players = new Player[11];
                for(int i = 0; i < 11; ++i)
                	players[i] = new Player(null, 0, 0, 0, null);
                homeTeam.setPlayers(players);
                
                Player[] substitutes = new Player[3];
                for(Player substitute : substitutes)
                	substitute = new Player(null, 0, 0, 0, null);
                homeTeam.setSubstitutes(substitutes);
                
                
                game.majorReferee = new Referee(null, 0);
                game.linesmen = new Referee[2];
                game.linesmen[0] = new Referee(null, 0);
                game.linesmen[1] = new Referee(null, 0);
                game.homeTeam = homeTeam;
                System.out.println("You have selected Real Madrid as the home team.");
            }
            // More stuff here and there...
            System.out.println("Please select the visiting team then:\n" +
                    "Barcelona, Manchester United, Chelsea, Juventus, AC Milan");
            input = scanner.nextLine();
            if(input.equalsIgnoreCase("Barcelona")){
            	Team visitingTeam = new Team("Madrid");
            	visitingTeam.setHeadCoach(new Coach("Mike", 40, 10));
                
                Coach[] assistantCoaches = new Coach[2];
                assistantCoaches[0] = new Coach("John", 39, 12);
                assistantCoaches[1] = new Coach("Mark", 45, 9);
                visitingTeam.setAssistantCoaches(assistantCoaches);
                
                Player[] players = new Player[11];
                for(int i = 0; i < 11; ++i)
                	players[i] = new Player(null, 0, 0, 0, null);
                visitingTeam.setPlayers(players);
                
                Player[] substitutes = new Player[3];
                for(Player substitute : substitutes)
                	substitute = new Player(null, 0, 0, 0, null);
                visitingTeam.setSubstitutes(substitutes);
                
                game.majorReferee = new Referee(null, 0);
                game.linesmen = new Referee[2];
                game.linesmen[0] = new Referee(null, 0);
                game.linesmen[1] = new Referee(null, 0);
                
                game.visitingTeam = visitingTeam;
                System.out.println("You have selected Barcelona as the visiting team.");
            }
            System.out.println("Please select the stadium for the match: San Siro, Nou Camp, Bernabeu, Old Trafford");
            input = scanner.nextLine();
            if(input.equalsIgnoreCase("Bernabeu") || input.equalsIgnoreCase("B") || input.equalsIgnoreCase("3")) {
            	System.out.println("Good job! All settle down. Game started.");
            }
        }
    }
    
}
