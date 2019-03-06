
package Test;

import Model.Document;

public class TestDocument1 {
    public static void main(String[] args) {
        Document doc1 = new Document(1, "computer information retrieval.");
        Document doc2 = new Document(2, "computer organization and architecture");
        String result[] = doc1.getListofTerm();
        for (int i = 0; i < result.length; i++) {
            System.out.println("term "+i+" = "+result[i]);
        }
        String result1[] = doc2.getListofTerm();
        for (int i = 0; i < result1.length; i++) {
            System.out.println("term "+i+" = "+result1[i]);
        }
        
    }
}
