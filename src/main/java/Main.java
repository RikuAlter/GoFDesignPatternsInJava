import behavioral.commandPattern.*;
import behavioral.iterator.DepthFirstIterator;
import behavioral.iterator.Vertex;
import behavioral.observer.*;
import behavioral.state.OffState;
import behavioral.state.Phone;
import behavioral.strategy.CreditCard;
import behavioral.strategy.CreditCardPaymentStrategy;
import behavioral.strategy.PaymentService;
import behavioral.visitor.Bank;
import behavioral.visitor.InsuranceVisitor;
import creational.abstractFactory.GovenmentInsuranceProvider;
import creational.abstractFactory.InsuranceProvider;
import creational.abstractFactory.PrivateInsuranceProvider;
import creational.builder.Car;
import creational.builder.CarBuilder;
import behavioral.chainofresponsibility.AuthenticationService;
import behavioral.chainofresponsibility.User;
import creational.factory.GenericProduct;
import creational.factory.ProductFactory;
import creational.factory.ProductType;
import creational.factoryMethod.BeefBurgerCooker;
import creational.factoryMethod.Cooker;
import creational.factoryMethod.VeggieCooker;
import behavioral.mediator.LoginButton;
import behavioral.mediator.LoginMediator;
import behavioral.memento.Editor;
import creational.prototypePattern.PrototypeRegistry;
import creational.singleton.SingletonLogger;
import behavioral.templateMethod.DiabloLoader;
import behavioral.templateMethod.WitcherLoader;
import structural.adapter.MultiRestoApp;
import structural.adapter.XmlJsonAdapter;
import structural.bridge.AmericanMenu;
import structural.bridge.ChickenPizza;
import structural.bridge.Pizza;
import structural.composite.Book;
import structural.composite.Box;
import structural.composite.Videogame;
import structural.decorator.EmailNotifier;
import structural.decorator.FacebookNotifierDecorator;
import structural.decorator.INotifier;
import structural.decorator.WhatsappNotifierDecorator;
import structural.facade.CryptoCurrencyProvider;
import structural.facade.CryptoFacade;
import structural.facade.DatabaseService;
import structural.facade.MailService;
import structural.flyweight.BookProvider;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        //Factory Pattern
        ProductFactory factory = new ProductFactory();
        GenericProduct mktpProduct = factory.createProduct(ProductType.MKTP);
        mktpProduct.setMpProduct(true);
        mktpProduct.setShippingGroup("MKTP_HD");

        GenericProduct nonmktpProduct = factory.createProduct(ProductType.NONMKTP);
        nonmktpProduct.setPrice(BigDecimal.valueOf(100));
        nonmktpProduct.setTaxRate(BigDecimal.valueOf(5));

        System.out.println("MKTP product: "+mktpProduct+ " tax: "+mktpProduct.getTaxAMount()+" sellable: "+mktpProduct.sellableOnline());
        System.out.println("Non mktp product: "+nonmktpProduct+ " tax: "+nonmktpProduct.getTaxAMount()+" sellable: "+nonmktpProduct.sellableOnline());


        /*
        Creational Design Patterns
        */

        //Factory Method Pattern
        Cooker beefBurgerCooker = new BeefBurgerCooker();
        beefBurgerCooker.cookBurger();

        Cooker veggieBurgerCooker = new VeggieCooker();
        veggieBurgerCooker.cookBurger();

        //Abstract Factory pattern
        InsuranceProvider provider = new GovenmentInsuranceProvider();
        provider.dispatchHomeInsurance();

        InsuranceProvider provider1 = new PrivateInsuranceProvider();
        provider1.dispatchCarInsurance();

        //Singleton Pattern
        SingletonLogger logger = SingletonLogger.getInstance("vlogger");

        //Builder Pattern
        CarBuilder builder = new CarBuilder();
        Car car = builder.id(1234L)
                .name("Lambo")
                .color("Red")
                .dealerID(566L)
                .build();

        System.out.println(car);

        //Prototype Pattern
        PrototypeRegistry registry = new PrototypeRegistry();
        creational.prototypePattern.Car car1 = (creational.prototypePattern.Car)registry.getCachedItem("BaseCar");
        creational.prototypePattern.Car car2 = car1.clone();
        System.out.println(car2);

        /*
        Behaviorial Design Patterns
         */

        //Chain of responsibility pattern
        User u = new User("rahul", "1234", "admin");
        User r = new User("riku", "234", "admin");
        AuthenticationService authService = new AuthenticationService();
        authService.logIn(u);
        authService.logIn(r);

        //Command pattern
        LivingRoom lv = new LivingRoom();

        Window win = new Window();
        lv.setWindow(win);

        FloorLamp fl = new FloorLamp();
        fl.setLight(new Light());

        lv.setFloorLamp(fl);
        lv.setWindow(win);
        lv.setLight(new Light());
        lv.setCommand(new SwitchLightsCommand(lv.getLight()));
        lv.executeCommand();

        fl.setCommand(new SwitchLightsCommand(fl.getLight()));
        fl.executeCommand();

        lv.setCommand(new SwitchWindowStateCommand(lv.getWindow()));
        lv.executeCommand();

        //Template method pattern
        DiabloLoader dl = new DiabloLoader();
        dl.load();
        WitcherLoader wl = new WitcherLoader();
        wl.load();

        //Mediator pattern
        LoginButton loginButton = new LoginButton();
        LoginMediator lm = new LoginMediator();
        lm.setLoginButton(loginButton);
        loginButton.setMediator(lm);
        lm.simulateLogin();

        //Memento pattern
        Editor editor = new Editor();
        editor.save("Hello");
        editor.save("Hello world");
        editor.save("Hello cruel world");
        editor.restore();
        System.out.println(editor.getTextArea().getText());

        //Oberserver pattern
        NotificationService notifier = new NotificationService();
        notifier.subscribe(EventTypes.NEW_ITEM, new EmailEventListener("abc@email.com"));
        notifier.subscribe(EventTypes.SALE, new EmailEventListener("abc@email.com"));
        notifier.subscribe(EventTypes.SALE, new MobileEventListener("1012929"));
        Store store = new Store(notifier);
        store.newItemPromotion();
        store.salePromotion();

        //State pattern
        Phone phone = new Phone();
        phone.setState(new OffState(phone));
        System.out.println(phone.getState().onPower());
        System.out.println(phone.getState().onHome());
        System.out.println(phone.getState().onHome());

        //Strategy pattern
        CreditCard cc = new CreditCard("12344444123123", "07/27", "443");
        CreditCardPaymentStrategy cs = new CreditCardPaymentStrategy();
        PaymentService ps = new PaymentService(cs);
        ps.processPayment(123L, cc);

        //Iterator pattern
        Vertex<Integer> v0 = new Vertex<>(0);
        Vertex<Integer> v1 = new Vertex<>(1);
        Vertex<Integer> v2 = new Vertex<>(2);
        Vertex<Integer> v3 = new Vertex<>(3);
        Vertex<Integer> v4 = new Vertex<>(4);
        Vertex<Integer> v5 = new Vertex<>(5);
        Vertex<Integer> v6 = new Vertex<>(6);

        v0.setNeighbours(List.of(v1, v5, v6));
        v1.setNeighbours(List.of(v5, v4, v3));
        v4.setNeighbours(List.of(v2, v6));
        v6.setNeighbours(List.of(v0));

        DepthFirstIterator di = new DepthFirstIterator<>(v0);

        System.out.println("Depth first iterator:");
        while(di.hasNext()){
            Vertex<Integer> next = di.next();
            if(next != null)
                System.out.println(next.getValue());
        }

        //Visitor pattern
        Bank bank = new Bank("SBI", "RHA", "1234", 5);
        bank.claimInsurance(new InsuranceVisitor());

        /*
        Structural Design Patterns
         */

        //Adapter pattern
        String menuDataxml = """
                <note>
                    <to>John</to>
                    <from>Jane</from>
                    <heading>Reminder</heading>
                    <body>Don't forget our meeting at 10 AM tomorrow!</body>
                </note>
                """;

        MultiRestoApp multiRestoApp = new MultiRestoApp();
        multiRestoApp.showMenu(menuDataxml);

        XmlJsonAdapter xmlJsonAdapte = new XmlJsonAdapter();
        xmlJsonAdapte.showMenu(menuDataxml);

        //Bridge pattern
        AmericanMenu am = new AmericanMenu(new ChickenPizza());
        am.cook();

        //Composite pattern
        Box box = new Box(List.of(new Box(List.of(new Videogame("A", 23), new Videogame("B", 27))),
                new Box(List.of(new Book("AA", 50), new Book("BB", 55))),
                new Book("CC", 100)));

        System.out.println(box.calculatePrice());

        //Decorator pattern
        Map<String, String> userDetailsRahul = new HashMap<>();
        userDetailsRahul.put("email", "rahul@rahul.com");
        userDetailsRahul.put("facebook", "rahulFacebook");
        userDetailsRahul.put("whatsapp", "7767");

        Map<String, String> userDetailsRiku = new HashMap<>();
        userDetailsRiku.put("email", "riku@riku.com");
        userDetailsRiku.put("facebook", "rikuFacebook");
        userDetailsRiku.put("whatsapp", "7767");

        Map<String, Map<String, String>> userDetails = new HashMap<>();
        userDetails.put("rahul", userDetailsRahul);
        userDetails.put("riku", userDetailsRiku);

        INotifier notifierCombo = new WhatsappNotifierDecorator(new FacebookNotifierDecorator(new EmailNotifier(userDetails), userDetails), userDetails);
        notifierCombo.sendNotification("rahul", "test");

        //Facade pattern
        structural.facade.User rahulUser = new structural.facade.User(1110L, "Rahul", 1000000L, "abc@xyz.com");
        DatabaseService db = new DatabaseService(List.of(rahulUser));
        CryptoFacade facade = new CryptoFacade(db, new MailService());
        facade.buyCryptoForUser("Rahul", "BTC", 1000L);

        //Flyweight pattern
        structural.flyweight.Book storyBook = BookProvider.createBook("TTS", "12345", 33, "XYZ",
                "Dummy", "DummyPrinter", "DummyEditor");
        System.out.print("Book Created: "+storyBook);

        //Proxy pattern
        
    }
}