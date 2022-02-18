import managers.Manager;
import players.Player;
import teams.Team;
import teams.TeamService;

// Main class
public class Main {

    // Main method
    public static void main(String[] args) {

        // Create new instance of player object
        Player player = new Player("Finn Russell", "Fly Half", 10, 10);

        // Create new instance of manager object
        Manager manager1 = new Manager("Gregor Townsend");

        // Create new instance of team object
        Team scotland = new Team("Scotland", manager1);

        // Create another instance of manager object
        Manager manager2 = new Manager("Eddie Jones");

        // Create another instance of team object
        Team england = new Team("England", manager2);

        // Make new instance of Team Service
        TeamService teamService = new TeamService();
        // Test countyEmptySpacesOnTeam method
        // County number of empty spaces in Scotland team
        int spaces = teamService.countEmptySpacesOnTeam(scotland);
        System.out.println(spaces);

        // Print player properties
         System.out.println(player);
        // System.out.println(player.toString());

        // Print team properties
        System.out.println(scotland);
        // System.out.println(scotland.toString());
        System.out.println(england);
        // System.out.println(england.toString());

        // Print players array


    }
}
