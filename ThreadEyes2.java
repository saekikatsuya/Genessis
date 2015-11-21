/**
 * Created by Yvjing on 2015/11/21.
 */
public class ThreadEyes2 {
    public static void main(String[]args){
        MyThread mt=new MyThread();
        new Thread(mt).start();
        new Thread(mt).start();
        new Thread(mt).start();//可以资源共享
    }
}
class MyThread implements Runnable{
    private int eyes=5;
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            if(this.eyes>0){
                System.out.println("蠢得哭瞎了"+this.eyes--+"双眼");
            }
        }
    }
}
