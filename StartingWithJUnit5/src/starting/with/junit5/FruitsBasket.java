package starting.with.junit5;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class FruitsBasket {

    private List<Fruit> basket = new ArrayList<>();

    public void add(Fruit fruit) {
    	basket.add(fruit);
    }

    public void remove(Fruit fruit) {
        if (!basket.contains(fruit)) {
            throw new NoSuchElementException();
        }
        basket.remove(fruit);
    }

    public int getSize() {
        return basket.size();
    }

    public void removeAll() {
    	basket.clear();
    }
    
    public boolean addALot(List<Fruit> lot) {
    	return basket.addAll(lot);
    }
    
    public String[] greet(String wish) {
    	return wish.split("[ !]");
    }
    
    
}
