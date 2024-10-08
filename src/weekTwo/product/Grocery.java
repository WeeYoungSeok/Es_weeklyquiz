package weekTwo.product;

import java.math.BigDecimal;

public class Grocery extends Product {

    public Grocery (String name, BigDecimal price, Double weight) {
        super(name, price, weight);
    }

    @Override
    public int getDiscountAmount() {
        return 2000;
    }
}
