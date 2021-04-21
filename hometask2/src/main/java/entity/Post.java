package entity;

import java.net.URL;
import java.util.List;

public class Post implements Likeable {

    private final String id;

    private final String text;
    private final List<URL> attachments;
    private int likes;

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public List<URL> getAttachments() {
        return attachments;
    }

    @Override
    public int getLikes() {
        return this.likes;
    }

    @Override
    public void like() {
        ++this.likes;
    }

    Post(String id, String text, List<URL> attachments) {
        this.id = id;
        this.text = text;
        this.attachments = attachments;
        this.likes = 0;
    }

}
