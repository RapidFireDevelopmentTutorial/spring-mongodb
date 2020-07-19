package za.co.rapidfiredev.springmongo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.co.rapidfiredev.springmongo.domain.Post;
import za.co.rapidfiredev.springmongo.repository.PostRepository;
import za.co.rapidfiredev.springmongo.service.PostService;

import java.util.List;
import java.util.Optional;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepository postRepository;

    @Override
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    @Override
    public Post createPost(Post post) {
        return postRepository.save(post);
    }

    @Override
    public Post listPost(String id) {
        Post post = postRepository.findById(id).orElse(null);
        if (post == null) {
            return null;
        } else {
            post.setLikes(post.getLikes() + 1);
            postRepository.save(post);
        }
        return post;
    }
}
