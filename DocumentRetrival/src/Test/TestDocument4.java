package Test;

import Model.Document;
import Model.InvertedIndex;
import Model.Posting;
import java.util.ArrayList;

public class TestDocument4 {

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
        // panggil function unsorted Posting List
        ArrayList<Posting> list = index.getUnsortedPostingList();
        // panggil list posting
        System.out.println("Ukuran list = " + list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getTerm() + "," + list.get(i).getDocument().getId());
        }
    }
}
