package model;

public class Truck extends Transport {

    private String model;

    public Truck(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    @Override
    public void startStatus() {
        System.out.println(model + " заведена");
    }

    @Override
    public String toString() {
        return "Transport{" +
                "model='" + model + '\'' +
                '}';
    }
}
