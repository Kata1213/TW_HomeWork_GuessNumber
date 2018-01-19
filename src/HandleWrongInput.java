import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Kata on 2018/1/19.
 */
public class HandleWrongInput {
    public boolean handleWrongInout(int input){
        if(input<1000||input>9999){
            return false;
        }

        Set set=new HashSet<Integer>();
        int i=input%10;
        set.add(i);
        input=input/10;
        while(input>0){
            i=input%10;
            if(set.contains(i)){
                return false;
            }else{
                set.add(i);
                input=input/10;
            }

        }


/*
        Iterator it=set.iterator();
        while(it.hasNext()){
         System.out.println(it.next());
        }
*/
        return  true;
    }
}
