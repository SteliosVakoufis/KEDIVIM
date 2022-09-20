package gr.aueb.elearn.chapter16.cloneable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Trainee implements Cloneable {
    private String name;
    private City city;

    public Trainee (Trainee trainee) {
        this.name = trainee.getName();
        this.city = new City(trainee.getCity());
    }

    @Override
    protected Trainee clone() throws CloneNotSupportedException {
        Trainee trainee =  (Trainee) super.clone();
        City city = new City(this.getCity().getDescription());
        trainee.setCity(city);
        return trainee;
    }
}
