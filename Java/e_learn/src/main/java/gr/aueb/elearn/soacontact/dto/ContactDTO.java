package gr.aueb.elearn.soacontact.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ContactDTO {
    private long id;
    private String firstName;
    private String lastName;

}
