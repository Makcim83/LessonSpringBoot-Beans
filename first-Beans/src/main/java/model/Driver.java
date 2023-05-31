package model;

import org.springframework.beans.factory.annotation.Autowired;

public class Driver {

    private String name;
    @Autowired
    private Transport transport;

    public Driver(String name, Transport transport) {
        this.name = name;
        this.transport = transport;
    }

    public String getName() {
        return name;
    }

    public void startStatus() {
        System.out.println(name + " сел(а) в " + transport);
        transport.startStatus();
    }

    @Override
    public String toString() {
        return "Driver{" +
                "transport=" + transport +
                '}';
    }
}