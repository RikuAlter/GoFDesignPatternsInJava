package creational.builder;

import java.sql.Timestamp;

public class CarSchemaBuilder extends Builder {

    private Long id;
    private String name;
    private String color;
    private Timestamp manufactureDate;
    private Long dealerId;

    @Override
    public CarSchemaBuilder id(Long id) {
        this.id = id;
        return this;
    }

    @Override
    public CarSchemaBuilder name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public CarSchemaBuilder color(String color) {
        this.color = color;
        return this;
    }

    @Override
    public CarSchemaBuilder manufactureDate(Timestamp manufactureDate) {
        this.manufactureDate = manufactureDate;
        return this;
    }

    @Override
    public CarSchemaBuilder dealerID(Long dealerId) {
        this.dealerId = dealerId;
        return this;
    }

    public CarSchema build(){
        return new CarSchema(id, name, color, manufactureDate, dealerId);
    }
}
