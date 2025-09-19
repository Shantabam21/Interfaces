public class ShortWordFilter implements Filter
{
    @Override
    public boolean accept(Object s) {
        String w = (String) s;
        return w.length() < 5;
    }
}
