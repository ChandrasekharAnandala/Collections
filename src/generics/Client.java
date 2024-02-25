package generics;


public class Client {
    public static void main(String[] args) {
       // Pair<Integer,Integer> p = new Pair<>();
        //p.setFirst(123);
       // p.setSecond(456);
        Pair<Integer,Integer> p = Pair.of(20,40);
        System.out.println(p.getFirst());
        System.out.println(Pair.getAverage(p));
    }
}
