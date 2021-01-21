package homework51.homework.models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
@CompoundIndexes({
        @CompoundIndex(def = "{'username': 1}"),
        @CompoundIndex(def = "{'email': 1}")
})
@Data
public class User {
    @Id
    private int id;

    private String email;
    private String password;
    // for authorization
    private String name; // users name in app
}
