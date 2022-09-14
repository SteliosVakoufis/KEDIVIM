package gr.aueb.elearn.chapter14.identifiableEntity;

/*
 * Skeletal Implementation
 */
public abstract class AbstractEntity implements IdentifiableEntity{
    private Long id;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
