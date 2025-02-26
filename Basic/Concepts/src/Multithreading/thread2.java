public class sojao extends Thread {
    public void run(){
        String n = Thread.currentThread().getName();
        try{
            for(int i = 1; i<=3;i++)
            {
                System.out.println(n);
                Thread.sleep(3000);
            }
        }
        catch(InterruptedException e){
            // If the thread is interrupted while sleeping, it will catch the InterruptedException here.
            System.out.println("Thread " + n + " interrupted.");
        }
    }
}

class B {
    public static void main(String[] args) {
        sojao t1 = new sojao();
        sojao t2 = new sojao();
        sojao t3 = new sojao();

        // Set names for each thread
        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");

        // Start each thread
        t1.start();
        t2.start();
        t3.start();

        // Wait for each thread to finish before ending the program
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("All threads have finished.");
    }
}
