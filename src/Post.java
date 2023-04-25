
import java.util.ArrayList;
        import java.util.List;

public class Post {
    private int id;
    private String content;
    private long timestamp;
    private User user;
    private List<Comment> comments;
    private int upvotes;
    private int downvotes;
    private static int count = 0;

    public Post(String content, User user) {
        this.id = ++count;
        this.content = content;
        this.timestamp = System.currentTimeMillis();
        this.user = user;
        this.comments = new ArrayList<>();
        this.upvotes = 0;
        this.downvotes = 0;
    }

    public int getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public User getUser() {
        return user;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public int getUpvotes() {
        return upvotes;
    }

    public int getDownvotes() {
        return downvotes;
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }

    public void upvote() {
        upvotes++;
    }

    public void downvote() {
        downvotes++;
    }
}
