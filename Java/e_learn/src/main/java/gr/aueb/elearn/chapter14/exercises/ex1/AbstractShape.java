package gr.aueb.elearn.chapter14.exercises.ex1;

import lombok.Setter;

@Setter
public abstract class AbstractShape implements IShape {
    private long id;

    @Override
    public long getId() {
        return id;
    }

}
