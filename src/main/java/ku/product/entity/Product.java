package ku.product.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity

public class Product {
    @Id
    @GeneratedValue
    private int id;

    private String name;
    private double price;
    private String type;
}
