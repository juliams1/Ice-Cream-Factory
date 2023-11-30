/**
 * Ice-Cream-Factory
 */
public class IceCreamFactory {
public void main(String[] args) {
    System.out.println("Produção de sorvetes iniciada!");

    IceCreamMaker iceCreamMaker = new IceCreamMaker();

    iceCreamMaker.makeIceCream();

    System.out.println("Produção de sorvetes finalizada!");
}
    
}