package structural.facade;


public class BitcoinCurrency extends CryptoCurrency{

    @Override
    public void buyCurrency(Long amount, User user) {
        System.out.println("Buying bitcoin worth "+amount+" for: "+user);
    }
}
