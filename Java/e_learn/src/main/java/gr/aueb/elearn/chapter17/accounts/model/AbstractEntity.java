package gr.aueb.elearn.chapter17.accounts.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class AbstractEntity implements IdentifiableEntity{
    private long id;
}
