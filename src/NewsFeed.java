

import java.util.*;
public class NewsFeed {
    private static NewsFeed instance;
    final List<User> users;
    final Map<String, User> sessions;

    private NewsFeed() {
        users = new ArrayList<>();
        sessions = new HashMap<>();
    }

    public static synchronized NewsFeed getInstance() {
        if (instance == null) {
            instance = new NewsFeed();
        }
        return instance;
    }

    public void signup(String username, String password) {

    }

    public void login(String username, String password) {
        if (sessions.containsKey(username)) {
            throw new RuntimeException("User already logged in");
        }


         //Find the user with the provided username and password


        User user = null;
        for (User u : users) {
            if (u.getUsername().equals(username) && u.getPassword().equals(password)) {
                user = u;
                break;
            }
        }

        if (user == null) {
            throw new RuntimeException("Invalid username or password");
        }
    }

    public void post(User user, String content) {

    }

    public void follow(User follower, User followed) {
        follower.follow(followed);
    }

    public void reply(User user, int postId, String content) {

    }

    public void upvote(User user, int postId) {

    }

    public void downvote(User user, int postId) {

    }

    public void upvoteComment(User user, int commentId) {

    }

    public void downvoteComment(User user, int commentId) {

    }

    public List<Post> getNewsFeed(User user, String sortBy) {
        List<Post> newsFeed = new ArrayList<>();
        Set<User> followedUsers = user.getFollowedUsers();
        followedUsers.add(user);

        for (User followedUser : followedUsers) {
            for (Post post : followedUser.getPosts()) {
                newsFeed.add(post);
            }
        }

        Comparator<Post> comparator = getSortComparator(sortBy);
        newsFeed.sort(comparator.reversed());
        return newsFeed;
    }

    private Comparator<Post> getSortComparator(String sortBy) {
        switch (sortBy) {
            case "newest":
                return Comparator.comparingLong(Post::getTimestamp);
            case "oldest":
                return Comparator.comparingLong(Post::getTimestamp).reversed();
            case "most_liked":
                return Comparator.comparingInt(Post::getUpvotes).reversed();
            default:
                throw new IllegalArgumentException("Invalid sort type: " + sortBy);
        }
    }


}


