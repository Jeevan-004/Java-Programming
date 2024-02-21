class NewThread1 implements Runnable{
Thread t1;
NewThread1(){
t1=new Thread(this,"BMS_Thread");
}
public void run(){
try{
for(;;){
System.out.println("BMS College of Engineering");
Thread.sleep(10000);}
}
catch(InterruptedException e)
{System.out.println("Interruption detected while executing child thread :");
}
}
}

class NewThread2 implements Runnable{
Thread t2;
NewThread2(){
t2=new Thread(this,"CSE_Thread");
}
public void run(){
try{
for(;;){
System.out.println("CSE");
Thread.sleep(2000);}
}
catch(InterruptedException e)
{System.out.println("Interruption detected while executing child thread :");
}
}
}


class ThreadDemo{
public static void main(String args[]){
NewThread1 a=new NewThread1();
NewThread2 b=new NewThread2();
a.t1.start();
b.t2.start();
}
}
