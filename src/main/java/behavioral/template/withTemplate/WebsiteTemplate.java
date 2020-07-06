package behavioral.template.withTemplate;

public abstract class WebsiteTemplate {
    public void showPage() {
        System.out.println("header");
        showContent();
        System.out.println("footer");
    }

    public abstract void showContent();
}
