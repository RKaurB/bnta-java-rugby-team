package pojos;

import java.util.Arrays;
import java.util.Objects;

public class Team {

    // Properties
    private Player[] players;
    private String name;
    private Manager manager;

    // Default constructor
    // Means that we can create a Team object even if we don't have all the information we need to pass
    // Can then use the setters to update the fields of an object
    public Team() {

    }

    // Constructor
    // Only need to pass in name and manager properties
    // This is because when we create a new team, we don't have any players yet, whereas the team name and manager are known
    // (i.e. Every team needs to start with an array of players, and will not have any players to begin with - so we don't pass players in)
    public Team(String name, Manager manager) {
        // Name will be different for each time
        this.name = name;
        // Manager will be different for each team
        this.manager = manager;
        // Each team will have 15 players in it, and it starts empty
        // We create in the constructor, and then use a service class to populate it
        this.players = new Player[15];
    }

    // Getters & Setters
    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    // toString method
    @Override
    public String toString() {
        return "Team{" +
                "players=" + Arrays.toString(players) +
                ", name='" + name + '\'' +
                ", manager=" + manager +
                '}';
    }

    // Equals & hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Team team = (Team) o;
        return Arrays.equals(players, team.players) && Objects.equals(name, team.name) && Objects.equals(manager, team.manager);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, manager);
        result = 31 * result + Arrays.hashCode(players);
        return result;
    }
}
