package structural.proxy;

import java.util.HashSet;
import java.util.Set;

public class ProxyInternet implements Internet{

    Set<String> blockedWebsites = new HashSet<>();
    Internet internet;

    public ProxyInternet(){
        internet = new WorldWideInternet();
    }

    public void blockWebsite(String url){
        blockedWebsites.add(url);
    }

    @Override
    public void visitWebsite(String url) {
        if(blockedWebsites.contains(url))
            System.out.println("Access is blocked on this network!");
        else
            internet.visitWebsite(url);
    }
}
