package command;

import database.Database;
import entity.Post;

public class PostCommand implements Command {

    private final Database<String, Post> db;
    private final Post post;

    public PostCommand(Database<String, Post> db, Post post) {
        this.db = db;
        this.post = post;
    }

    @Override
    public void execute() {
        db.add(post.getId(), post);
    }

}
