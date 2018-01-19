import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.assertThat;

/**
 * Created by Kata on 2018/1/18.
 */
public class test {

    @Test
    public void testHandleWrongInputForWrong(){
        int input=1111;
        boolean result=new HandleWrongInput().handleWrongInout(input);
        assertThat(result,is(false));
    }
    @Test
    public void testHandleWrongInputForTrue(){
        int input=1234;
        boolean result=new HandleWrongInput().handleWrongInout(input);
        assertThat(result,is(true));
    }


    @Test
    public  void testGuessForWrongInputForTrue(){
        Guess g=new Guess();
        g.setGivenNumber(1234);
        int inputNumber=1234;
        String result=g.guess(inputNumber);
        assertThat(result,is("4A0B"));
    }
    @Test
    public  void testGuessForWrongInputForWrong(){
        Guess g=new Guess();
        g.setGivenNumber(1234);
        int inputNumber=2341;
        String result=g.guess(inputNumber);
        assertThat(result,is("0A4B"));
    }


    @Test
    public void testCompareNumberForTure(){
        int givenNumber=1234;
        int inputNumber=1234;
        String result=new CompareNumber().compareNumber(givenNumber,inputNumber);
        assertThat(result,is("4A0B"));
    }
    @Test
    public void testCompareNumberForWrongPlace(){
        int givenNumber=1234;
        int inputNumber=4123;
        String result=new CompareNumber().compareNumber(givenNumber,inputNumber);
        assertThat(result,is("0A4B"));
    }

    @Test
    public void testCompareNumberForWrongNumber(){
        int givenNumber=1234;
        int inputNumber=5678;
        String result=new CompareNumber().compareNumber(givenNumber,inputNumber);
        assertThat(result,is("0A0B"));
    }



    @Test
    public void testAnswerGenerator(){
        int number1=new AnswerGenerator().answerGenarator();
        int number2=new AnswerGenerator().answerGenarator();
        //System.out.println(number1);
       // System.out.println(number2);
        assertThat(number1,not(number2));
    }


}
