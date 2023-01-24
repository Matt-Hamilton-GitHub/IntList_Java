public class IntList {
    public int first;
    public IntList rest;

    public IntList(int f, IntList r){
        first = f;
        rest = r;
    }

    public int size(){
        if(rest == null){
            return 1;
        }else{
            return 1 + this.rest.size();
        }
    }

    public int iterativeSize(){
        IntList p = this;
        int depth = 0;

        while (p != null){
            p = p.rest;
            depth++;
        }
        return depth;
    }
    public static void main(String[] args) {
        IntList l = new IntList(15, null);
        l = new IntList(10, l);
        l = new IntList(5, l);
        System.out.println(l.size());
        System.out.println(l.iterativeSize());

    }
}
