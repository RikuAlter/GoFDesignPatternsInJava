package creational.builder;

import lombok.ToString;

import java.sql.Timestamp;

@ToString
public class Car {

    private Long id;
    private String name;
    private String color;
    private Timestamp manufactureDate;
    private Long dealerId;

    Car(Long id, String name, String color, Timestamp manufactureDate, Long dealerId) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.manufactureDate = manufactureDate;
        this.dealerId = dealerId;
    }

}
