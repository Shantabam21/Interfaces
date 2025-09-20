import java.awt.*;
import java.util.ArrayList;

public class BigRectLister {
    public static void main(String[] args) {
        ArrayList<Object> rects = new ArrayList<>();
        BigRectangleFilter filter = new BigRectangleFilter();
        rects.add(new Rectangle(2, 2));
        rects.add(new Rectangle(3, 3));
        rects.add(new Rectangle(4, 4));
        rects.add(new Rectangle(5, 5));
        rects.add(new Rectangle(1, 1));
        rects.add(new Rectangle(10, 20));
        rects.add(new Rectangle(30, 20));
        rects.add(new Rectangle(35, 50));
        rects.add(new Rectangle(10, 40));
        rects.add(new Rectangle(20, 40));
        for (Object x : rects) {
            if (filter.accept(x)) {
                System.out.println(x + " has a perimeter bigger than 10");
            }
        }
    }
}
