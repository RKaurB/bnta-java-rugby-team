// Unit tests

package teams;

import managers.Manager;
import org.junit.jupiter.api.Test;
import players.Player;

import static org.assertj.core.api.Assertions.assertThat;

public class TeamServiceTest {

    // @Test flags up to JUnit that this is to be run as a test
    @Test
    // Test that it gives us 15 spaces when team array is empty
    public void canCountEmptySpacesOnTeamWhenEmpty() {
        // GIVEN
        // What goes in here is guided by what we're testing
        Manager manager = new Manager("test manager");
        Team team = new Team("test team", manager);
        TeamService underTest = new TeamService();
        // Given, When, Then for a Unit Test
        // (Do our set-up, do the thing we want to test, assert that the thing we want to happen actually happens)
        // WHEN
        // Invoke method and pass in team
        // The value of actual is what is returned by the method (how many empty spaces calculated on team)
        int actual = underTest.countEmptySpacesOnTeam(team);
        // THEN
        // Write assertion
        // The value of expected is what we are expecting, i.e. what the method should return (in this case, 15)
        int expected = 15;
        // Assert that the actual result (what we get) is equal to the expected result (what we expect to get)
        assertThat(actual).isEqualTo(expected);
    }

    // @Test flags up to JUnit that this is to be run as a test
    @Test
    // Test that it gives us 14 spaces when one player has been added
    public void canCountEmptySpacesOnTeamWithOnePlayer() {
        // GIVEN
        Manager manager = new Manager("test manager");
        Team team = new Team("test team", manager);
        // This time, we need a player
        Player player = new Player("test player", "winger", 11, 2);
        TeamService underTest = new TeamService();
        // Test if addPlayerToTeam throws an exception - wrap in a try/catch block (may not be best practice)
        try {
            underTest.addPlayerToTeam(team, player);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // WHEN
        // (The When should typically be one line, i.e. we're doing one thing at a time when we're unit testing
        int actual = underTest.countEmptySpacesOnTeam(team);
        // THEN
        int expected = 14;
        assertThat(actual).isEqualTo(expected);
    }

}
