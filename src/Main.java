import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhấn phím 0 để start");
        int a = scanner.nextInt();
        if(a == 0){
            stopWatch.start();
        }
        System.out.println("Nhấn phím 1 để end");
        int b = scanner.nextInt();
        if(b == 1){
            stopWatch.stop();
            System.out.println("Thời gian trôi qua là : "+ (stopWatch.getElapsedTime()/1000) + " Giây" );
        }


    }
}
