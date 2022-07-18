package Entity;

public class Campaing {
    private double discount;

    public Campaing(){

    }

    public Campaing(double discount) {
        this.discount = discount;
    }

    public double isDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
