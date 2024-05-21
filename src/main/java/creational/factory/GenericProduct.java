package creational.factory;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@Setter
@ToString
public abstract class GenericProduct {

    private String productName;
    private Long productId;
    private String shippingGroup;
    private BigDecimal price;
    private BigDecimal taxRate;
    private boolean mpProduct;

    public abstract BigDecimal getTaxAMount();
    public abstract boolean sellableOnline();
}
