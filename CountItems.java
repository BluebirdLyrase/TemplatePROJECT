import java.util.ArrayList;

public class CountItems {
    public static int getCount(ArrayList<Item> items){
        int count=0;
        for(Item item:items)
            count += item.getAmount();
        return count;
    }
}
