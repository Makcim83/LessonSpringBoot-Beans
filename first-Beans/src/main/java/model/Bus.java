package model;

import org.springframework.beans.factory.annotation.Autowired;

public class Bus extends Transport{

    @Autowired
    private String model;

    public Bus(String model) {
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