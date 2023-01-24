public class IntList {
    public int first;
    public IntList rest;

    public static void main(String[] args) {
        IntList l = new IntList();
        l.first = 5;
        l.rest = null;

        l.rest = new IntList();
        l.rest.first = 10;
        l.rest.rest = new IntList();

        l.rest.rest.first = 15;
    }
}
