class Th1 extends Thread
{

@Override
public void run(){
for(int i=0; i<10; i++){
System.out.println(" " +i);
}
}
}

public class Thread_Demo01{
public static void main(String[] args){
Th1 ob1=new Th1();
ob1.start();
}
}