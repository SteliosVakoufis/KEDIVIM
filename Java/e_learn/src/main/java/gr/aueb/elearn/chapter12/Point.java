package gr.aueb.elearn.chapter12;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Point {
    private double x;

    public void move(double x) {
        this.x += x;
    }

    protected void reset() {
        this.x = 0;
    }

    public void move(int i, int j) {
    }

}
