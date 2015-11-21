/**
 * Created by Yvjing on 2015/11/21.
 */
public class ThreadEyes {
    public static void main(String[]args){
        MyThread mt1=new MyThread();
        MyThread mt2=new MyThread();
        mt1.start();
        mt2.start();
    }
}
class MyThread extends Thread{
    private int eyes=5;
    public void run(){
        for(int i=0;i<5;i++){
            if(this.eyes>0){
                System.out.println("蠢得哭瞎了"+this.eyes--+"双眼");//Thread不能资源共享，一共就5双眼睛能哭瞎，它却能哭瞎10次= =+
            }
        }
    }
}