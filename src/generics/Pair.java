package generics;

public class Pair<T,U> {
    private T first;
    private U second;

    private Pair(){}
    private Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public U getSecond() {
        return second;
    }

    public void setSecond(U second) {
        this.second = second;
    }

    public static <E,F> Pair of(E first, F second){
        return new Pair(first,second);
    }

    public static <E,F> double getAverage(Pair<? extends Number , ? extends Number > pair ){
        return (pair.getFirst().doubleValue()+pair.getSecond().doubleValue())/2;
    }

}
