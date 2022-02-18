package teams;

// teams.TeamService class
// Use to update the array of players we get
// Business logic

import players.Player;

public class TeamService {

    // Don't need any properties

    // Default constructor
    // (This would happen anyway, create something with no properties)
    public TeamService() {

    }

    // Methods...
    // We will now want to be able to add players to the team, county empty spaces on the team, replacing the manager, etc

    // Count empty spaces on team
    // Return int
    // Parameters: Takes team as a parameter
    public int countEmptySpacesOnTeam(Team team) {
        // Initialises a temporary variable to store count
        int count = 0;
        // Loop through players array and count nulls
        // (Get players array from team, enhanced for-loop)
        for (Player player : team.getPlayers()) {
            // If statement
            // Check if player is null
            if (player == null) {
                // If player is null, then add one to count
                // This will give us the number of empty spaces on the team
                count++;
            }
        }
        // Return count
        return count;

//        // Alternate for(i) loop
//        Player[] playersOnTheTeam = team.getPlayers();
//        for (int i = 0; i < team.getPlayers().length; i++) {
//            if ([playersOnTheTeam[i] == null]){
//                count++;
//            }
//        }
//        return count;
    }



}
