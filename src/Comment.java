
public class Comment {
    private int id;
    private String content;
    private long timestamp;
    private User user;
    private Post post;
    private int upvotes;
    private int downvotes;
    private static int count = 0;

    public Comment(String content, User user, Post post) {
        this.id = ++count;
        this.content = content;
        this.timestamp = System.currentTimeMillis();
        this.user = user;
        this.post = post;
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

    public Post getPost() {
        return post;
    }

    public int getUpvotes() {
        return upvotes;
    }

    public int getDownvotes() {
        return downvotes;
    }

    public void upvote() {
        upvotes++;
    }

    public void downvote() {
        downvotes++;
    }
}
