public class VirtualProxy implements DemoSubject {
    final int subjectDataA;
    final int subjectDataB;
    DemoSubject demoSubject;

    public VirtualProxy(int subjectDataA, int subjectDataB) {
        this.subjectDataA = subjectDataA;
        this.subjectDataB = subjectDataB;
    }

    @Override
    public void doSomethingExpensive() {
        if(demoSubject == null)
            demoSubject = new RealSubject(this.subjectDataA, this.subjectDataB);
        demoSubject.doSomethingExpensive();
    }
}
