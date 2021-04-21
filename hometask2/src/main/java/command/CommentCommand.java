package command;

import database.Database;
import entity.Comment;
import entity.Post;

public class CommentCommand implements Command {

    private final Database<Post, Comment> db;
    private final Post post;
    private final Comment comment;

    public CommentCommand(Database<Post, Comment> db, Post post, Comment comment) {
        this.db = db;
        this.post = post;
        this.comment = comment;
    }

    @Override
    public void execute() {
        db.add(post, comment);
    }

}
