package homework51.homework.models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Document(collection = "albums")
@Data
public class Album {
    @Id
    private int id;
    @Indexed // for search by albums name
    private String name;
    @Indexed // for search by albums year
    private int year;

    @DBRef // shows albums author
    private Author author;

    @DBRef // shows songs of album
    private List<Song> songs;
}
