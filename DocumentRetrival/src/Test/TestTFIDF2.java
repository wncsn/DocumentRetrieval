package Test;

import java.util.ArrayList;
import java.util.List;
import Model.Document;
import Model.InvertedIndex;
import Model.Posting;
import Model.Term;

public class TestTFIDF2 {

    public static void main(String[] args) {

        Document doc2 = new Document("2,delivery of silver arrived in a silver truck");
        ArrayList<Posting> result = doc2.getListOfPosting();

        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i).getTerm() + "," + result.get(i).getNumberOfTerm());
        }

    }
}
