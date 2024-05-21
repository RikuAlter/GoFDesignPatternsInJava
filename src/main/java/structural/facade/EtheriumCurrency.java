package structural.facade;

public class EtheriumCurrency extends CryptoCurrency{

    @Override
    public void buyCurrency(Long amount, User user) {
        System.out.println("Buying etherium worth "+amount+" for: "+user);
    }
}
