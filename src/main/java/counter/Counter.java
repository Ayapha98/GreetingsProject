package counter;

public interface Counter {
    void countUser(String username);
    int getUserCount(String username);
    int getTotalUserCount();
    void clearUser(String username);
    void clearAllUsers();
}
