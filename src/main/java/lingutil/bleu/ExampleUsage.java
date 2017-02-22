package lingutil.bleu;

import java.lang.reflect.Array;

public class ExampleUsage {
    public static void main(String[] args) {
        BleuMeasurer bm = new BleuMeasurer();
        String[] sen1 = new String[]{"they", "killed", "some", "of", "us"};
        String[] sen2 = new String[]{"they", "killed", "us"};
        bm.addSentence(sen1, sen2);
        System.out.println("bm.bleu(): " + bm.bleu());
    }
}
