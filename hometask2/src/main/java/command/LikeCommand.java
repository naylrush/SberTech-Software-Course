package command;

import entity.Likeable;

public class LikeCommand implements Command {

    private final Likeable likeable;

    public LikeCommand(Likeable likeable) {
        this.likeable = likeable;
    }

    @Override
    public void execute() {
        likeable.like();
    }

}
