import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TestCase implements Serializable {
    private static final long serialVersionUID = 6438268415057497151L;



    public static void main(String[] args) {

        int a = 1;


        int i =1;
        for (i = 1; i < 100; i++) {
            System.out.println(i+1);
        }
        String str = "hello world";
        List llll = new ArrayList<String>();
        System.out.println(llll);

    }

}
