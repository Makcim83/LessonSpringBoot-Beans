package model;

import org.springframework.beans.factory.annotation.Autowired;

public class Car extends Transport{

    private String model;

    public Car(String model) {
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