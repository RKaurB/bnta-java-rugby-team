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
//        // (The for(i) loop gives us much finer control re how the loop works. However, the for each (enhanced) loop is preferred/easier here, as above!)
//        // PlayersOnTheTeam variable stores what we get back from team.getPlayers() - returns a Player array
//        Player[] playersOnTheTeam = team.getPlayers();
//        // How many spots are in the array?
//        // For each individual index (i) in this array...
//        for (int i = 0; i < team.getPlayers().length; i++) {
//            if ([playersOnTheTeam[i] == null]){
//                // if null, increment the count
//                count++;
//            }
//        }
//        return count;

    }

    // Method takes a team and a player, and returns void
    // Check if space on team, and if yes then add the player
    // (Add Exception, in event that team is full and no more space to add a player)
    public void addPlayerToTeam(Team team, Player player) throws Exception {
        // Store result of the countEmptySpacesOnTeam method into a variable (i.e., calculated number of empty spaces on the team)
        int spaces = countEmptySpacesOnTeam(team);
        // If at least one space on team, then add player
        if (spaces > 0) {
            // Get player array from the team and store in players variable - getPlayers() gives us the full array, including nulls
            Player[] players = team.getPlayers();
            // Add player to first available empty space
            // Loop through players array (need for(i) loop here)
            for (int i = 0; i < players.length; i++) {
                // If we find an empty space (null) in the array
                if (players[i] == null) {
                    // Add the player into that empty space
                    players[i] = player;
                    // Then break out of the loop
                    break;
                }
            }
        }
        else {
            // throw new Exception();
            throw new IllegalStateException("Team is full.");
        }
    }


}
