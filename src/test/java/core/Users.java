package core;

import java.util.HashMap;

public class Users {
    private static Users instance;

    private String login;
    private String pass;
    private String url;

    public String getLogin() {
        return this.login;
    }

    public String getPass() {
        return this.pass;
    }

    public String getUrl() {
        return url;
    }

    private Users(HashMap<String, String> data) {
        this.login = data.get("login");
        this.pass = data.get("pass");
        this.url = data.get("url");
    }

    private static String getEnvironment() {
        String environment = System.getenv("environment");
        if (environment == null) {
            throw new IllegalArgumentException("Cannot detect platform. Current value is null.");
        }

        return environment;
    }


    public static Users getInstance() {
        if (instance == null) {
            instance = new Users(getData());
        }
        return instance;
    }

    private static Boolean isMail() {
        return getEnvironment().equals("mail");
    }

    private static Boolean isYandex() {
        return getEnvironment().equals("yandex");
    }

    private static Boolean isGoogle() {
        return getEnvironment().equals("google");
    }

    private static HashMap<String, String> getData() {
        if (isMail()) {
            return MailUser.data;
        } else if (isYandex()) {
            return YandexUser.data;
        } else if (isGoogle()) {
            return GoogleUser.data;
        } else {
            throw new IllegalArgumentException("Cannot understand environment. You set " + getEnvironment());
        }
    }
}
