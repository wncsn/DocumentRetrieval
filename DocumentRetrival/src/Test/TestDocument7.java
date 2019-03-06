
package Test;

import Model.Document;
import Model.InvertedIndex;
import Model.Posting;
import Model.Term;
import java.util.ArrayList;

public class TestDocument7 {

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
        ArrayList<Posting> result = index.Search("computer");
        // tampilkan isi document dan id-nya
        for (int i = 0; i < result.size(); i++) {
            System.out.println("idDoc=" + result.get(i).getDocument().getId());
            System.out.println(result.get(i).getDocument().getContent());
        }
//        ArrayList<Posting> result1 = index.search("machine learning");
//        // tampilkan isi document dan id-nya
//        for (int i = 0; i < result1.size(); i++) {
//            System.out.println("idDoc=" + result.get(i).getDocument().getId());
//            System.out.println(result1.get(i).getDocument().getContent());
//
//        }
    }
}
