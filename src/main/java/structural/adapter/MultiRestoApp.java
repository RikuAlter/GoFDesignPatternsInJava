package structural.adapter;

public class MultiRestoApp implements IMultiRestoApp{

    @Override
    public void showMenu(String xmlData) {
        System.out.println(xmlData);
    }

    @Override
    public void showResturaunt(String xmlData) {
        System.out.println(xmlData);
    }
}
