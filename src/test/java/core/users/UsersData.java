package core.users;

import java.util.HashMap;

abstract public class UsersData {
    public static HashMap<String, String> data;

    public static String get(String key, String def) {
        return data.containsKey(key) ? data.get(key) : def;
    }

    public static String get(String key) {
        return get(key, "");
    }

}
