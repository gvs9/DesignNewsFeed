import java.util.*;
public class User {
    private int id;
    private String username;
    private String password;
    private List<Post> posts;
    private Set<User> followedUsers;

    public User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
        posts = new ArrayList<>();
        followedUsers = new HashSet<>();
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void addPost(Post post) {

    }

    public List<Post> getPosts() {
        return posts;
    }

    public void follow(User user) {

    }

    public void unfollow(User user) {

    }

    public Set<User> getFollowedUsers() {
        return followedUsers;
    }
}
