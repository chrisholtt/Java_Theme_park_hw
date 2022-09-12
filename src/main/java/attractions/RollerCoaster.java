package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity, ITicketed {

    public RollerCoaster(String name, int rating, double price) {
        super(name, rating, price);
    }

    public boolean isAllowedTo(Visitor visitor){
        if (visitor.getHeight() > 145 && visitor.getAge() > 12) {
            return true;
        }
        return false;
    }

    public double priceFor(Visitor visitor){
        if (visitor.getHeight() > 200) {
            return getPrice() * 2;
        }
        return getPrice();
    }

    public double defaultPrice(){
        return 2.2;
    }

}
