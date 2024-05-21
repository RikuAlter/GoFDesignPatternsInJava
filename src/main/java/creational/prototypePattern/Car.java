package creational.prototypePattern;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Car implements Prototype{

    private Long id;
    private String model;
    private String brand;
    private BigDecimal price;
    private GPSSystem gpsSystem;

    public Car(Car car){
        this.id = car.id;
        this.model = car.model;
        this.brand = car.brand;
        this.price = car.price;
        this.gpsSystem = car.gpsSystem.clone();
    }

    @Override
    public Car clone() {
        return new Car(this);
    }
}
