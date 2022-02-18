package players;

import java.util.Objects;

public class Player {

    // Properties
    private String name;
    private String position;
    private int number;
    private int contractLength;

    // Default Constructor
    public Player() {

    }

    // Constructor
    public Player(String name, String position, int number, int contractLength) {
        this.name = name;
        this.position = position;
        this.number = number;
        this.contractLength = contractLength;
    }

    // Getters & Setters for each property
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getContractLength() {
        return contractLength;
    }

    public void setContractLength(int contractLength) {
        this.contractLength = contractLength;
    }

    // Overrides the toString method
    @Override
    public String toString() {
        return "pojos.Player{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", number=" + number +
                ", contractLength=" + contractLength +
                '}';
    }

    // Equals & Hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return number == player.number && contractLength == player.contractLength && Objects.equals(name, player.name) && Objects.equals(position, player.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position, number, contractLength);
    }
}
