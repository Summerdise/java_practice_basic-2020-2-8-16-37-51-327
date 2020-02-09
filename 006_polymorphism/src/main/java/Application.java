public class Application {
    public static void main(String[] args) {
        IntellijIdea intellijIdea = new IntellijIdea();
        Chrome chrome = new Chrome();
        WeChat weChat = new WeChat();
        intellijIdea.reload();
        chrome.reload();
        weChat.reload();
    }
}
