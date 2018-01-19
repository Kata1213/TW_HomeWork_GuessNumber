import java.util.HashMap;
import java.util.Map;

/**
 * Created by Kata on 2018/1/18.
 写一个CompareNumber类，只有一个函数，
 该函数接受两个参数，一个是答案，一个是用户输 入的四位数。

 系统会将两个数字进行对比，并给形出xAxB的提示， 比如”2A1B”。
 如果数字猜对而且位置也对，就是一个A。 如果数字猜对但位置不对，就是一个B。 例如：

 系统给出”1234”，用户输入”1234” 返回”4A0B” 系统给出”1234”，用户输入”4321” 返回”0A4B”
 返回值是xAxB的字符串 这里我们假定答案和用户输入都是合法的四位数。
 不用考 虑数字合法性问题。 请对这个类写测试（思考要写几个测试）
 */
public class CompareNumber {

    public String compareNumber(int GivenNumber,int inputNumber){
        //我的想法是把每个数字及其位置放到一个map中，让用户输入的数字去匹配key，如果不匹配key就说明这个数字就不对，不用再考虑位置了
        //如果数字对了，那就B先++，然后就匹配key的value，看是不是正确的位置，A++

        Map givenMap=new HashMap<Character,Integer>();
        String s_givenNumber=String.valueOf(GivenNumber);
        int len=s_givenNumber.length(); //可扩展性
        for(int i=0;i<len;i++){
            givenMap.put(s_givenNumber.charAt(i),i);
        }

        int A=0;
        int B=0;

        String s_inputNumber=String.valueOf(inputNumber);
        for(int j=0;j<len;j++){
            char c=s_inputNumber.charAt(j);
            if(givenMap.containsKey(c)){
                int index= (int) givenMap.get(c);
                if(j==index){
                    A++;
                    //System.out.println(A);
                }else{
                    B++;
                }

            }
        }

        String result=""+A+"A"+B+"B";
        return result;


    }
}
