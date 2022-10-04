package gr.aueb.elearn.chapter17.collections;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Product implements Comparable<Product>{
    private String description;
    private Double price;
    private Integer quantity;
    
    @Override
    public int compareTo(Product o) {
        return description.compareTo(o.description);
    }

    // @Override
    // public int compareTo(Product o) {
    //     return this.getQuantity() - o.getQuantity();
    // }
    
    // @Override
    // public int compareTo(Product o) {
    //     return this.getQuantity().compareTo(o.getQuantity());
    // }

}
