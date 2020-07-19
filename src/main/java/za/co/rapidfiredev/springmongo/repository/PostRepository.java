package za.co.rapidfiredev.springmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import za.co.rapidfiredev.springmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
}
