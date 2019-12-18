package core;

public interface PageObject {
    void enterLogin(String login);

    void enterPass(String pass);

    void clickNext();

    void checkInboxOpened();
}
