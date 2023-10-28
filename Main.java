
public class Main {
    public static void main(String[] args) {
   Pizza basepizza = new Pizza(true);
   basepizza.addExtracheese();
   basepizza.addExtratopping();
   basepizza.packing();
   basepizza.getbill();


       Delux_pizza dp = new Delux_pizza(true) ;
       dp.getbill();

    }
}