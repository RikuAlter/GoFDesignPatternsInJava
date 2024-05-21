package creational.factory;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class NonMktpProduct extends GenericProduct{
    @Override
    public BigDecimal getTaxAMount() {
        return getPrice().multiply(getTaxRate()).divide(BigDecimal.valueOf(100.0), 2, RoundingMode.HALF_UP);
    }

    @Override
    public boolean sellableOnline() {
        return true;
    }
}
