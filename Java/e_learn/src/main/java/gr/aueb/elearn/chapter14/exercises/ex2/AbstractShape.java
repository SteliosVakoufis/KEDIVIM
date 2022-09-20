package gr.aueb.elearn.chapter14.exercises.ex2;

import lombok.Setter;

@Setter
public abstract class AbstractShape implements IShape{
    private long id;

    @Override
    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
}
