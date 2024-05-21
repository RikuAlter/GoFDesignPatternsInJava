package structural.facade;

import lombok.Getter;

@Getter
public abstract class CryptoCurrency {

    public abstract void buyCurrency(Long amount, User user);
}
