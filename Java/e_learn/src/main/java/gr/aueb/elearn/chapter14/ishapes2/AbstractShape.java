package gr.aueb.elearn.chapter14.ishapes2;

import lombok.Setter;

@Setter
public abstract class AbstractShape implements IShape {
    private long id;

    @Override
    public long getId() {
        return id;
    }

}
