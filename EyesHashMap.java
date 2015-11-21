import java.util.HashMap;

/**
 * Created by Yvjing on 2015/11/21.
 */
public class EyesHashMap {
    public static void main(String[]args){
        HashMap<String , Integer> map=new HashMap<String , Integer>();
        map.put("A",1);
        map.put("B",2);
        map.put("C",3);//增
        System.out.println(map);

        map.remove("A");
        map.remove("C",3);
        System.out.println(map);//删

        if(map.containsKey("B")){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }//查

        map.put("B",5);
        System.out.println(map);//改
    }
}
