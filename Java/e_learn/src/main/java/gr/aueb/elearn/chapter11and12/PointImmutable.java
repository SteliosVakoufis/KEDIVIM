package gr.aueb.elearn.chapter11and12;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public final class PointImmutable {
    private final int x;
    private final int y;

    public PointImmutable() {
        x = 0;
        y = 0;
    }

    public static void main(String[] args) {
        
    }
}
