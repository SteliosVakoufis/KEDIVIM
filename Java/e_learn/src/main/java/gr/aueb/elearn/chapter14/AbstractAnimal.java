package gr.aueb.elearn.chapter14;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public abstract class AbstractAnimal {
    private Long id;
    private String name;
    private Double age;
 
    // public API
    public abstract void speak();

    public void eat() {
        System.out.println("Animal is eating!");
    }

    @Override
    public abstract String toString();
}
