package Test;

import Model.Document;
import Model.InvertedIndex;
import Model.Posting;
import java.util.ArrayList;

public class TestIDF1 {

    public static void main(String[] args) {
        Document doc1 = new Document(1, "Shipment of gold damaged in a fire");
        Document doc2 = new Document(2, "delivery of silver arrived in a silver truck");
        Document doc3 = new Document(3, "shipment of gold arrived in a truck");

        // buat object invertedIndex
        InvertedIndex index = new InvertedIndex();
        // tmbahkan document ke index
        index.addNewDocument(doc1);
        index.addNewDocument(doc2);
        index.addNewDocument(doc3);

        // panggil fungsi search
        index.MakeDictionary();
        ArrayList<Posting> result = index.Search("damaged");
        // tampilkan isi document dan id-nya
        for (int i = 0; i < result.size(); i++) {
            System.out.println("id_doc = " + result.get(i).getDocument().getId());
            System.out.println(result.get(i).getDocument().getContent());
        }

    }

}
