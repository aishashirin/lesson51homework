package homework51.homework.models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "albums")
@Data
public class Album {
    @Id
    private int id;
    private String name;

    @DBRef
    private Author author;

    @DBRef
    private List<Song> songs;
}
