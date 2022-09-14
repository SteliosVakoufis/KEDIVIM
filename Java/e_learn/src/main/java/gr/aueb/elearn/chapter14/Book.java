package gr.aueb.elearn.chapter14;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Book implements Item {
    private long id;
    private String isbn;
    private String author;
    private String title;
}
