public class ThreadC implements  Runnable{
    Foo foo;
    Thread t;

    ThreadC(Foo foo){
        this.foo = foo;
        t = new Thread(this, "ThreadC");
        t.start();
    }

    public  void run(){
        foo.third();
    }
}
