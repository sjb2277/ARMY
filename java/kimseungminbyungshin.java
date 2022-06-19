import java.util.*;

class human{
    String a;
    public human(String a){
        this.a=a;
    }

    public void hello(){
        System.out.println(a);
    }
}

public class kimseungminbyungshin{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        human ksm = new human(x);
        ksm.hello();
    }
}