package Entity;

public class Game {
    private int id;
    private String name;
    private double price;
    private double memory;

    public Game(int id, String name, double price, double memory) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.memory = memory;
    }

    public Game(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getMemory() {
        return memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }
}


