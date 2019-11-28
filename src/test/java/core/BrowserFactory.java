package core;

public class BrowserFactory {
    public static Browser get() {
        String type = System.getenv("browser");
        return getBrowser(type);
    }

    public static Browser get(String type) {
        return getBrowser(type);
    }

    private static Browser getBrowser(String type) {
        if (type == null) {
            throw new IllegalArgumentException("Browser type is not set.");
        }

        if (type.equals("Firefox") || type.equals("firefox")) {
            return new FirefoxBrowser();
        } else if (type.equals("Chrome") || type.equals("chrome")) {
            return new ChromeBrowser();
        } else if (type.equals("MChrome") || type.equals("mchrome")) {
            return new MobileChromeBrowser();
        } else {
            throw new IllegalArgumentException("Cannot launch browser type " + type);
        }
    }
}
