package structural.facade;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Optional;

@Getter
@Setter
@AllArgsConstructor
public class CryptoFacade {

    private DatabaseService databaseService;
    private MailService mailService;

    public void buyCryptoForUser(String username, String currencyType, Long amount){
        Optional<User> user = getDatabaseService().getUsers().stream().filter(u -> u.getName().equalsIgnoreCase(username)).findAny();
        user.ifPresent(u -> buyCryptoForUser(u, currencyType, amount));
    }

    public void buyCryptoForUser(User user, String currencyType, Long amount){
        CryptoCurrency cc = CryptoCurrencyProvider.getRequestedCryptoService(currencyType);
        if(user.getBalance() > amount){
            cc.buyCurrency(amount, user);
            getMailService().sendMail(user);
        } else {
            System.out.println("Not enough balance!");
        }
    }
}
