package creational.builder;

import java.sql.Timestamp;

public class CarSchema {
    private Long id;
    private String name;
    private String color;
    private Timestamp manufactureDate;
    private Long dealerId;

    CarSchema(Long id, String name, String color, Timestamp manufactureDate, Long dealerId) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.manufactureDate = manufactureDate;
        this.dealerId = dealerId;
    }
}
