package gr.aueb.elearn.chapter14.identifiableEntity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class User extends AbstractEntity{
    private String firstName;
    private String lastName;

    
}
