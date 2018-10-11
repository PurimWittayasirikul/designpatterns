import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Flock implements Quackable{

    ArrayList quackers = new ArrayList();

    public void add(Quackable quacker){
        quackers.add(quacker);
    }
    @Override
    public void quack() {
        Iterator iterator = quackers.iterator();
        Quackable firstQuacker = (Quackable)iterator.next();
        for (int i = 0; i < 3; i++) {
            System.out.println("quack of head");
            firstQuacker.quack();
        }
        while (iterator.hasNext()){
            Quackable quacker = (Quackable)iterator.next();
            quacker.quack();
        }
    }
}
