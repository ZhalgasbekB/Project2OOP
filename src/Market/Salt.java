package Market;

import Market.Product;

import java.time.LocalDate;

public class Salt extends Product {
    public  Salt (String name , double  storageLifeDays , LocalDate deliveredAt ,  String place){
        super(name, storageLifeDays , deliveredAt  , place);
    }

    @Override
    public boolean isFresh() {
         return true;
    }

    @Override
    public String toString() {
        return   super.toString();
    }
}
