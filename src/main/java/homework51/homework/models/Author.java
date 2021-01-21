package homework51.homework.models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "authors")
@Data
public class Author {
    @Id
    private int id;
    private String name;
}
