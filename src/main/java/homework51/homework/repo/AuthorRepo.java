package homework51.homework.repo;

import homework51.homework.models.Author;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AuthorRepo extends MongoRepository<Author,Integer> {
}
