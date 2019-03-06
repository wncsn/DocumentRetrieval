package Test;

import java.util.ArrayList;
import java.util.List;
import Model.Document;
import Model.InvertedIndex;
import Model.Posting;
import Model.Term;

public class TestDocument8 {

    public static void main(String[] args) {
        Document doc1 = new Document(1, "computer information retrieval.");
        Document doc2 = new Document(2, "computer organization and architecture");
        Document doc3 = new Document(3, "machine learning architecture");

        // buat object invertedIndex
        InvertedIndex index = new InvertedIndex();
        // tmbahkan document ke index

        index.addNewDocument(doc1);

        index.addNewDocument(doc2);

        index.addNewDocument(doc3);
        // panggil fungsi search

        index.MakeDictionary();
        ArrayList<Posting> result = index.SearchOneWord("computer");
        // panggil fungsi search
        ArrayList<Posting> result1 = index.SearchOneWord("architecture");
        // pangging fungsi instersect
        ArrayList<Posting> join = index.Intersection(result1 , result);
        // tampilkan isi document dan id-nya
        for (int i = 0;
                i < join.size(); i++) {
            System.out.println("id_doc = " + join.get(i).getDocument().getId());
            System.out.println(join.get(i).getDocument().getContent());
        }

    }
}
