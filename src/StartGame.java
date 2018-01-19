import java.util.Scanner;

/**
 * Created by Kata on 2018/1/18.
 *
 * 完成整个游戏。整个游戏是以命令行方式进行的。每回游戏有六次机会。
 每输入一次数字就会减 少一次机会并打印xAxB。
 当游戏开始时，打印“Welcome!”空一行打印 “Please input your number(6): “
 每次输入完并敲击回车，就会在下面打印出xAxB，
 然后空一行打印出新的”Please input your number(x):“
 当输入的数字包含重复数字并回车时，在下面打印”Cannot input duplicate numbers!”
 当6次都没有猜中的时候，打印”Game Over”并退出
 当猜中的时候，不要打印4A0B,而是打印”Congratulations!”并退出
 * /
 */
public class StartGame {
    public static void main(String []args){
        new StartGame().startGame();
    }
    public void startGame(){
        Guess guessNumber=new Guess();
        HandleWrongInput handle=new HandleWrongInput();
        int GameNumber=6;
        Scanner sc=new Scanner(System.in);
        //System.out.println(guessNumber.getGivenNumber());
        System.out.println("Welcome!");
        for(int i=GameNumber;i>0;i--) {
            System.out.println("Please input your number(" + i + "):");
            int input = sc.nextInt();
            //先处理非法输入
            boolean flag = handle.handleWrongInout(input);
            if (!flag) {
                System.out.println("Cannot input duplicate numbers!");
                continue;
            }

                String result = guessNumber.guess(input);

                if (result.equals("4A0B")) {
                    System.out.println("Congratulations!");
                    return;
                } else if (i == 1) {
                    System.out.println("Game Over");
                } else {
                    System.out.println(result);
                }
            }
        }

}
