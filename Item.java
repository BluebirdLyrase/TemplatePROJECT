public class Item {
    private int amount;
    private CalWeight shape;
    public Item(CalWeight shape,int amount){
        this.shape=shape;
        this.amount=amount;
    }

    public int getAmount() {
        return amount;
    }

    public CalWeight getShape() {
        return shape;
    }
}
