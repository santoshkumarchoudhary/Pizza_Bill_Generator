public class Pizza {
    private int price;
   private Boolean veg;
   private int Extracheese = 100;

   private int Extratopping = 150;
   private int packing = 20;
   private int basepizzaprice;

   private Boolean ExtraCheeseAdded = false;
    private Boolean ExtraToppingAdded = false;
    private Boolean BagpackingAdded = false;

    public Pizza(Boolean veg) {
        this.veg = veg;
        if(this.veg){
            this.price = 300;
        }else{
            this.price = 400;
        }
        basepizzaprice = this.price;
    }
    public void addExtracheese(){
        ExtraCheeseAdded = true;
        this.price+=Extracheese;
    }
    public void addExtratopping(){
        ExtraToppingAdded = true;
this.price+=Extratopping;
    }
    public void packing(){
        BagpackingAdded = true;
this.price+=packing;
    }
    public void getbill(){
        String bill = "";
   System.out.println("pizza: "+ basepizzaprice);
   if(ExtraCheeseAdded){
       bill+= "Extra cheese added: "+ Extracheese +"\n";
   }
        if(ExtraToppingAdded){
            bill+= "Extra topping added: "+ Extratopping +"\n";
        }
        if(BagpackingAdded){
            bill+= "bag take away: "+ packing +"\n";
        }
        bill+= "Bill: "+this.price +"\n";
        System.out.println(bill);
    }
}
