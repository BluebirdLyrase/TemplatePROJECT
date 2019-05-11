import java.util.ArrayList;

public class ShapeCollection implements Iterator {
    private ArrayList<Item> items;
    private int index;
    ShapeCollection(){
        items = new ArrayList<Item>();
    }
    public void addItem(Item item){
        items.add(item);
    }

    @Override
    public String next() {
        Item item = items.get(index++);
        CalWeight shape = item.getShape();
        double volumn = shape.calVolumnTemplate();
        int amount = item.getAmount();
        return String.format("Type :%s Volumn :%f Amount: %d",shape,volumn,amount);
    }

    @Override
    public boolean hasnext() {
        if(index==items.size()){
            index=0;
            return false;
        }else
            return true;
    }
}
