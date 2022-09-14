package gr.aueb.elearn.chapter14;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CompactDisk implements Item{
    private long id;
    private String title;
}
