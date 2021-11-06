public class Foo {

    int flag = 1;
    synchronized  void first(){
        while (flag!=1){
            try{
                wait();
            }catch (InterruptedException e){
                System.out.println("Interrupted Exception caught");
            }
        }
        System.out.println("Entering Thread A");
        try{
            for (int i=3;i>0;i--){
                System.out.println("first is running");
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("Thread A interrupted");
        }
        System.out.println("Exiting Thread A");
        flag = 2;
        notify();

    }
    synchronized void second(){
        while (flag!=2){
            try{
                wait();
            }catch (InterruptedException e){
                System.out.println("Interrupted Exception caught");
            }
        }
        System.out.println("Entering Thread B");
        try{
            for (int i=3;i>0;i--){
                System.out.println("second is running");
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("Thread B interrupted");
        }

        flag = 3;
        System.out.println("Exiting Thread B");


        notify();
    }
    synchronized void third(){
        while (flag!=3){
            try{
                wait();
            }catch (InterruptedException e){
                System.out.println("Interrupted Exception caught");
            }
        }
        System.out.println("Entering Thread C");
        try{
            for (int i=3;i>0;i--){
                System.out.println("third is running");
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("Thread C interrupted");
        }
        flag =1 ;
        System.out.println("Exiting Thread C");
        notify();
    }
}
