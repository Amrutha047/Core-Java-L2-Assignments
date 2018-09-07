import java.io.*;
public class MyClass {

    static int fact(int num){
        if(num==1)return 1;
        return (num * fact(num-1));        
    }

    public static void main(String args[])throws IOException {

        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader ob = new BufferedReader(read);

        System.out.println("Enter a number");
        int n = Integer.parseInt(ob.readLine());

        System.out.println(fact(n));
    }
}
