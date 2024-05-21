package creational.builder;

import java.sql.Timestamp;

public class CarBuilder extends Builder {

    private Long id;
    private String name;
    private String color;
    private Timestamp manufactureDate;
    private Long dealerId;

    @Override
    public CarBuilder id(Long id) {
        this.id = id;
        return this;
    }

    @Override
    public CarBuilder name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public CarBuilder color(String color) {
        this.color = color;
        return this;
    }

    @Override
    public CarBuilder manufactureDate(Timestamp manufactureDate) {
        this.manufactureDate = manufactureDate;
        return this;
    }

    @Override
    public CarBuilder dealerID(Long dealerId) {
        this.dealerId = dealerId;
        return this;
    }

    public Car build(){
        return new Car(id, name, color, manufactureDate, dealerId);
    }
}
