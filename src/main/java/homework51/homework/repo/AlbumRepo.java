package homework51.homework.repo;

import homework51.homework.models.Album;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AlbumRepo extends MongoRepository<Album,Integer> {
}
