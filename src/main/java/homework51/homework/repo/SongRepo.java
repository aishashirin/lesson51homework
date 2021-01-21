package homework51.homework.repo;

import homework51.homework.models.Song;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SongRepo extends MongoRepository<Song,Integer> {
}
