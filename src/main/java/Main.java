// IMPORTS
import managers.Manager;
import players.Player;
import teams.Team;
import teams.TeamService;

// MAIN CLASS
public class Main {

    // MAIN METHOD
    public static void main(String[] args) {

        // CREATE NEW INSTANCE OF PLAYER OBJECT
        Player player = new Player("Finn Russell", "Fly Half", 10, 10);

        // CREATE NEW INSTANCE OF MANAGER OBJECT
        Manager manager1 = new Manager("Gregor Townsend");

        // CREATE NEW INSTANCE OF TEAM OBJECT
        Team scotland = new Team("Scotland", manager1);

        // CREATE ANOTHER INSTANCE OF MANAGER OBJECT
        Manager manager2 = new Manager("Eddie Jones");

        // CREATE ANOTHER INSTANCE OF TEAM OBJECT
        Team england = new Team("England", manager2);

        // PRINT PLAYER PROPERTIES
        System.out.println(player);
        // System.out.println(player.toString());

        // PRINT TEAM PROPERTIES
        System.out.println("Scotland: " + scotland);
        // System.out.println(scotland.toString());
        System.out.println("England: " + england);
        // System.out.println(england.toString());

        // MAKE NEW INSTANCE OF TEAM SERVICE
        TeamService teamService = new TeamService();
        // Test countyEmptySpacesOnTeam method
        // County number of empty spaces in Scotland team
        int spaces = teamService.countEmptySpacesOnTeam(scotland);
        System.out.println("Empty spaces on team (Scotland): " + spaces);

        // PRINT NUMBER OF EMPTY SPACES ON SCOTLAND TEAM BEFORE ADDING A PLAYER
        int spacesBefore = teamService.countEmptySpacesOnTeam(scotland);
        System.out.println("Empty spaces on Scotland team before adding player: " + spacesBefore);
        // ADD PLAYER TO SCOTLAND TEAM (USING THE ADDPLAYERTOTEAM METHOD IN TEAM SERVICE)
        teamService.addPlayerToTeam(scotland, player);
        // PRINT NUMBER OF EMPTY SPACES ON SCOTLAND TEAM AFTER ADDING A PLAYER
        int spacesAfter = teamService.countEmptySpacesOnTeam(scotland);
        System.out.println("Empty spaces on Scotland team after adding player: " + spacesAfter);

    }
}
