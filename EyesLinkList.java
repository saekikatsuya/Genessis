import java.util.LinkedList;

/**
 * Created by Yvjing on 2015/11/21.
 */
public class EyesLinkList {
    public static void main(String[]args){
        LinkedList<String> list = new LinkedList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.addFirst("X");
        list.addLast("Z");//增
        System.out.println(list);

        list.removeFirst();
        list.removeLast();//删除第一个、最后一个
        System.out.println(list);

        System.out.println(list.indexOf("A"));
        System.out.println(list.lastIndexOf("A"));//查找

        list.set(3, "hahaha");//将第三个改为hahaha
        System.out.println(list);
    }
}
