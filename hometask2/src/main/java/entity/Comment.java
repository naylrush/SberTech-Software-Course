package entity;

public class Comment implements Likeable {

    private final String id;

    private final String text;
    private int likes;

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    @Override
    public int getLikes() {
        return this.likes;
    }

    @Override
    public void like() {
        ++this.likes;
    }

    Comment(String id, String text) {
        this.id = id;
        this.text = text;
        this.likes = 0;
    }

}
