public class Delux_pizza extends Pizza{
    public Delux_pizza(Boolean veg) {
        super(veg);
        super.addExtracheese();
        super.addExtratopping();
    }

    @Override
    public void addExtracheese() {
    }

    @Override
    public void addExtratopping() {
    }
}
