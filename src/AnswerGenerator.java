import java.util.Random;

/**
 * Created by Kata on 2018/1/18.
 AnswerGenerator类，只有一个函数，返回一个四位，每位都不重复随机数。
 请对这个 类写测试。

 */
//使用一个 int 作为位域，实际上只用到了 int 32 位中的低 10 位。每生成一个数字 N 就将低第 N 位置为 1，若检查到当前位域为“1”时，则重新随机。

public class AnswerGenerator {
    public int answerGenarator(){
        int n=4;//产生一个n位数，目前n=4
        int bitField=0;
        Random ran=new Random();
        char[] chars=new char[n];
        for(int i=0;i<n;i++){
            while(true){
                int k=ran.nextInt(10);
                if((bitField&(1<<k))==0){
                    bitField|=1<<k;
                    chars[i]=(char)(k+'0');
                    break;
                }
            }
        }
        String s=new String(chars);
        int result=Integer.valueOf(s);
       // System.out.println("AnserGen="+result);
        return result;
    }

}
