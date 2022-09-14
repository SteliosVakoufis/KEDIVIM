package gr.aueb.elearn.chapter14;

import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor
public class Lion extends AbstractAnimal {

    public Lion(Long id, String name, Double age) {
        setId(id);
        setName(name);
        setAge(age);
    }

    @Override
    public void speak() {
        System.out.println("Hello meow, I am a LION!");
    }
}
