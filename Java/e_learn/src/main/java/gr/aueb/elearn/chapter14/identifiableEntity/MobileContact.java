package gr.aueb.elearn.chapter14.identifiableEntity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class MobileContact extends AbstractEntity {
    private User user;
    private String phoneNumber;
}
