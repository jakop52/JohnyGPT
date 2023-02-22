import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JohnyGPT {


    public static void main(String[] args) {
        boolean exit = false;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(" Hej! Zadaj mi jakieś pytanie");

        while(!exit){
            try {
                String readln = bufferedReader.readLine();
                if(readln.equals("exit")){
                    exit = true;
                }
                else{
                    System.out.println(Completion.MakeCompletion(readln));
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
