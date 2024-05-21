package creational.factory;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class MktpProduct extends GenericProduct {

    @Override
    public BigDecimal getTaxAMount() {
        return new BigDecimal("0.0");
    }

    @Override
    public boolean sellableOnline() {
        return isMpProduct() && getShippingGroup().contains("HD");
    }
}
