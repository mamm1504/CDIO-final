import gui_fields.GUI_Car;
import gui_fields.GUI_Player;

import java.awt.Color;

public class Player {
    private int balance, placement;
    private String name;
    private GUI_Player player;

    public Player(String name, int balance, Color color) {
        this.balance = balance;
        this.player = new GUI_Player(name, balance, new GUI_Car(color,color, GUI_Car.Type.CAR, GUI_Car.Pattern.FILL));
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }
    public void setBalance(int amount) {balance = amount;}
    public GUI_Player getPlayer(){
        return this.player;
    }
    public int getPlacement() {
        return placement;
    }
    public void gotoPlacement(int placement) { this.placement = placement; }
    public void setPlacement(int sum) {
        placement += sum;
    }
    public String getName() {
        return name;
    }
    public Color getPlayerColor() {
        return player.getPrimaryColor();
    }
}
