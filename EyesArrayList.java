import java.util.ArrayList;

/**
 * Created by Yvjing on 2015/11/21.
 */
public class EyesArrayList {
    public static void main(){
        ArrayList<Integer> list=new ArrayList<Integer>();
        for( int i=0;i<10;i++){
            list.add(i);//添加10个数字到当前列表
        }
        System.out.println(list);

        list.remove(2);//删除值为2的
        System.out.println(list);

        if(list.contains(4)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }//查找4是否在数列中

        list.set(7,5);//将第七个改为5
        System.out.println(list);
    }
}