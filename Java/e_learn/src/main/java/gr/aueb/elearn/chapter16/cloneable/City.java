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
public class City implements Cloneable {
    private String description;

    public City(City city) {
        this.description = new String(city.getDescription());
    }

    @Override
    protected City clone() throws CloneNotSupportedException {
        return (City) super.clone();
    }

}
