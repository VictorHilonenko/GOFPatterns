package behavioral.template.woTemplate;

public class Main {
    public static void main(String[] args) {
        WelcomePage welcomePage = new WelcomePage();
        NewsPage newsPage = new NewsPage();

        welcomePage.showPage();

        System.out.println("\n===============================\n");

        newsPage.showPage();
    }
}
