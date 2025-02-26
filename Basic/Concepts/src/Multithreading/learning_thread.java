// Source code is decompiled from a .class file using FernFlower decompiler.
class learning_thread {
    B() {
    }
 
    public static void main(String[] var0) {
       sojao var1 = new sojao();
       sojao var2 = new sojao();
       sojao var3 = new sojao();
       var1.setName("Thread 1");
       var2.setName("Thread 2");
       var3.setName("Thread 3");
       var1.start();
       var2.start();
       var3.start();
 
       try {
          var1.join();
          var2.join();
          var3.join();
       } catch (InterruptedException var5) {
          System.out.println("Main thread interrupted.");
       }
 
       System.out.println("All threads have finished.");
    }
 }
 