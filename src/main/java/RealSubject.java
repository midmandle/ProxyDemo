public class RealSubject implements DemoSubject {
    private final int dataA;
    private final int dataB;

    public RealSubject(int dataA, int dataB) {
        this.dataA = dataA;
        this.dataB = dataB;
    }

    @Override
    public void doSomethingExpensive() {
        System.out.println("DataA: " + dataA + " DataB: " + dataB);
    }
}
