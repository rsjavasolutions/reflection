package model;

import java.math.BigDecimal;

public class Car {
    private String brand;
    private String model;
    private BigDecimal price;

    private Car(String brand, String model, BigDecimal price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    private String showDetails() {
        return "model.Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
