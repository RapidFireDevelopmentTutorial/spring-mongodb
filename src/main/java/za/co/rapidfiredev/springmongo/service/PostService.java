package za.co.rapidfiredev.springmongo.service;

import za.co.rapidfiredev.springmongo.domain.Post;

import java.util.List;

public interface PostService {

    List<Post> getAllPosts();

    Post createPost(Post post);

    Post listPost(String id);
}
