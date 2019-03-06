package Test;

import Model.Document;
import Model.InvertedIndex;
import Model.Posting;
import Model.Term;
import java.util.ArrayList;
import java.util.List;

public class TestDocument6 {

    public static void main(String[] args) {
        // seting dokumen
        Document doc1 = new Document(1, "computer information retrieval.");
        Document doc2 = new Document(2, "computer organization and architecture");
        Document doc3 = new Document(3, "machine learning architecture");

        // buat object invertedIndex
        InvertedIndex index = new InvertedIndex();
        // tmbahkan document ke index
        index.addNewDocument(doc1);
        index.addNewDocument(doc2);
        index.addNewDocument(doc3);
        // panggil function sorted Posting List
        ArrayList<Posting> list = index.getSortedPostingList();
        // panggil list posting
        index.MakeDictionary();
        // panggil term yang ada dan jumlah posting
        for (int i = 0; i < index.getDictionary().size(); i++) {
            Term tempTerm = index.getDictionary().get(i);
            System.out.println(tempTerm.getTerm() + ","
                    + tempTerm.getNumberOfDocument());
            for (int j = 0; j < tempTerm.getNumberOfDocument(); j++) {
                Posting tempPosting = tempTerm.getPostingList().get(j);
                Document tempDoc = tempPosting.getDocument();
                System.out.println("idDoc = " + tempDoc.getId());
            }
        }
    }
}
