package Worker;

public class Director {
    public void force(Counter counter, int countMonthReport){
        System.out.println(counter.report(countMonthReport));
    }
}
