package core.pages;

public class PageFactory {


    public static AbstractPage getEnv() {
        String env = System.getenv("environment");
        return getPag(env);
    }

    private static AbstractPage getPag(String environment) {
        if (environment.equals("mail")) {
            return new MailObject();
        } else if (environment.equals("yandex")) {
            return new YandexObject();
        } else if (environment.equals("google")) {
            return new GoogleObject();
        } else {
            throw new IllegalArgumentException("Cannot launch object " + environment);
        }
    }
}
