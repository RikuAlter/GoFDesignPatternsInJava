package structural.facade;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class CryptoCurrencyProvider {

    public static CryptoCurrency getRequestedCryptoService(String type){
        return switch (type){
            case "BTC" -> new BitcoinCurrency();
            case "ETH" -> new EtheriumCurrency();
            default -> throw new IllegalStateException("Unexpected value: " + type);
        };
    }
}
