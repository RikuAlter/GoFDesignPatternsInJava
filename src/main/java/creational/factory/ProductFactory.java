package creational.factory;

public class ProductFactory {

    public GenericProduct createProduct(ProductType productType) {

        GenericProduct product;

        switch (productType){
            case MKTP -> product = new MktpProduct();
            case NONMKTP -> product = new NonMktpProduct();
            default -> product = null;
        }
        return product;
    }
}
