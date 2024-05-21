package behavioral.observer;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Store {
    private NotificationService notificationService;

    public Store(NotificationService notificationService){
        this.notificationService = notificationService;
    }

    public void newItemPromotion() {
        getNotificationService().notify(EventTypes.NEW_ITEM);
    }

    public void salePromotion(){
        getNotificationService().notify(EventTypes.SALE);
    }
}
