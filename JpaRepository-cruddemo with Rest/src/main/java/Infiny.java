import java.nio.file.Paths;
import java.util.Scanner;

public class Infiny {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(Paths.get("/var/input.txt"));
            String content = scanner.useDelimiter("\n").next();
            System.out.println(content);
            scanner.close();
        }catch (Exception e){
            e.printStackTrace();
        }



        for(int i=0;i<50000;i++){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}
