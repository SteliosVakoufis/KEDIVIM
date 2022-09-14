package gr.aueb.elearn.chapter14;

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
public class Cat implements ISpeakable {
    private String name;
    private double age;

    @Override
    public void speak() {
        System.out.println("Woof!");
    }

}
