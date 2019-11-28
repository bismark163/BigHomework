package core;

public class BrowserFactory {
    public static Browser get() {
        String type = System.getenv("browser");

        if (type == null) {
            throw new IllegalArgumentException("Browser type is not set.");
        }

        if (type.equals("Firefox") || type.equals("firefox")) {
            return new FirefoxBrowser();
        } else if (type.equals("Chrome") || type.equals("chrome")) {
            return new ChromeBrowser();
        } else {
            throw new IllegalArgumentException("Cannot launch browser type " + type);
        }
    }
}
