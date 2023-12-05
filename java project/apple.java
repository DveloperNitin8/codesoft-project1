import java.util.Random;

public class apple {
    public static void main(String[] args) {
        Random dice=new Random();
        int number;
        for(int i=1;i<=10;i++){
            number=dice.nextInt(6);
        }
    }
}
