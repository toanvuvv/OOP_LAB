package OrtherProjects.Lab03.garbage;
import java.util.Random;

public class ConcatenationInLoops {
    public static void main(String[] args) {
        Random r = new Random(123);
        long start = System.currentTimeMillis();
        String st = "";
        for (int i = 0; i < 65536; i++) {
            st += r.nextInt(2);
        }
        System.out.println(System.currentTimeMillis() - start + " ms");
        r = new Random(123);
        start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 65536; i++) {
            sb.append(r.nextInt(2));
        }
        sb.toString();
        System.out.println(System.currentTimeMillis() - start + " ms");
    }
}