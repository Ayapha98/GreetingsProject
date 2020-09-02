package counter;

import java.util.HashMap;

public class Count implements Counter {

    HashMap<String,Integer> names = new HashMap<String,Integer>();

    public void countUser(String username) {
        if (!names.containsKey(username)) {
            names.put(username, 1);

        }
        else {
            names.put(username, names.get(username)+1);
        }
    }

    public int getUserCount(String username){
        if (names.containsKey(username)){
            return names.get(username);
        } else return 0;
    }

    public int getTotalUserCount(){
        return names.size();
    }

    public boolean clearUser(String username){
        names.remove(username);
        return true;
    }

    public boolean clearAllUsers(){
        names.clear();
        return true;
    }

    private boolean updateCount(String username) {
        names.put(username, names.get(username) + 1);
        return true;
    }
}
