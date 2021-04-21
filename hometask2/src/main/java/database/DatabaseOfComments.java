package database;

import entity.Comment;
import entity.Post;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DatabaseOfComments implements Database<Post, Comment> {

    private final Map<Post, List<Comment>> comments = new HashMap<>();

    @Override
    public void add(Post post, Comment comment) {
        comments.putIfAbsent(post, new ArrayList<>());
        comments.get(post).add(comment);
    }

    @Override
    public List<Comment> select(Post post) {
        return comments.get(post);
    }

}
