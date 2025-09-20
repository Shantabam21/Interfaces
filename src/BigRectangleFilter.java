import java.awt.*;


public class BigRectangleFilter implements RectFilter {
    @Override
    public boolean accept(Object s) {
        Rectangle r = (Rectangle) s;
        return (r.getWidth() + r.getHeight()) * 2 > 10;
    }
}
