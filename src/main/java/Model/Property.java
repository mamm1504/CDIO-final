package Model;

import gui_fields.GUI_Street;

import java.awt.*;

public class Property extends Field {

    protected int rent;
    protected Player owner;
    protected Color color;

    /**
     * Constructor
     * @param field
     * @param rent
     * @param name
     * @param color
     */

    // Constructor
    public Property(GUI_Street field, int rent, String name, Color color) {
        field.setTitle(name);
        field.setBackGroundColor(color);
        field.setSubText("$" + rent);
        field.setDescription("My description");

        this.field = field;
        this.rent = rent;
        this.name = name;
        this.color = color;
    }

    // Methods
    public int getRent() {
        return rent;
    }
    public void setOwner(Player player) {
        this.owner = player;
    }
    public Player getOwner() {
        return owner;
    }
    public Color getColor() {
        return color;
    }
}