package structural.proxy;

public class WorldWideInternet implements Internet{
    @Override
    public void visitWebsite(String url) {
        System.out.println("Visiting : "+url);
    }
}
