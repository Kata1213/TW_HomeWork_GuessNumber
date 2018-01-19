/**
 * Created by Kata on 2018/1/18.
 写一个Guess类，还是只有一个函数，但是只有一个参数。
 把前两问做的类集成起来，写一个集 成的单元测试，写一个集成测试。

 */
public class Guess {
    private int givenNumber=new AnswerGenerator().answerGenarator();

    public String guess(int inputNumber){
       String result=new CompareNumber().compareNumber(givenNumber,inputNumber);
        return result;
    }

   public void setGivenNumber(int givenNumber) {
        this.givenNumber = givenNumber;
    }
    public int getGivenNumber() {
        return givenNumber;
    }
}
