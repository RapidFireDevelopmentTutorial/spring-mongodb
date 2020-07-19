package za.co.rapidfiredev.springmongo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.co.rapidfiredev.springmongo.domain.Post;
import za.co.rapidfiredev.springmongo.service.PostService;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("/posts")
    public List<Post> getAllPosts() {
        return postService.getAllPosts();
    }

    @PostMapping("/post")
    public Post createPost(@RequestBody Post post) {
        return postService.createPost(post);
    }

    @GetMapping("/post/{id}/like")
    public Post likePost(@PathVariable String id) {
        return postService.listPost(id);
    }

}
