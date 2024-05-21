package creational.prototypePattern;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class PrototypeRegistry {

    private Map<String, Prototype> prototypeCache = new HashMap<>();

    public PrototypeRegistry(){

        GPSSystem gpsSystem = new GPSSystem();
        gpsSystem.setLatitude(BigDecimal.valueOf(123.232442));
        gpsSystem.setLongitude(BigDecimal.valueOf(23.23443));

        prototypeCache.put("BaseGPS", gpsSystem);

        Car car = new Car();
        car.setId(123L);
        car.setModel("G12");
        car.setBrand("Lambo");
        car.setPrice(BigDecimal.valueOf(100.0));
        car.setGpsSystem(gpsSystem);

        prototypeCache.put("BaseCar", car);

    }

    public Prototype getCachedItem(String key){
        return prototypeCache.get(key).clone(); //Dynamically find the proper clone method for the prototype
    }
}
