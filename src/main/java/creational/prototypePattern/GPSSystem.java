package creational.prototypePattern;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
public class GPSSystem implements Prototype{
    private BigDecimal latitude;
    private BigDecimal longitude;

    public GPSSystem(GPSSystem gpsSystem){
        this.latitude = gpsSystem.latitude;
        this.longitude = gpsSystem.longitude;
    }

    @Override
    public GPSSystem clone(){
        return new GPSSystem(this);
    }
}
