package counter;

public interface Counter {
    void countUser(String username);
    int getUserCount(String username);
    int getTotalUserCount();
    boolean clearUser(String username);
    boolean clearAllUsers();
}
