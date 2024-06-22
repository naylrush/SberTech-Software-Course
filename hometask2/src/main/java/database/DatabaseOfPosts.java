package database;

import entity.Post;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DatabaseOfPosts implements Database<String, Post> {

    private final Map<String, Post> posts = new HashMap<>();

    @Override
    public void add(String id, Post post) {
        posts.put(id, post);
    }

    @Override
    public List<Post> select(String id) {
        return Collections.singletonList(posts.get(id));
    }

}
