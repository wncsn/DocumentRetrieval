
package Test;

import Model.Document;

public class TestDocument {
    public static void main(String[] args) {
        Document doc1= new Document(1, "computer information retrieval.");
        // kelurannya kata computer information retrieval 
        // dipotong-potong menjadi 3 string
        // luarnnya:
        // computer
        // information
        // retrieval
        String result[] = doc1.getListofTerm();
        for (int i = 0; i < result.length; i++) {
            System.out.println("term "+i+" = "+result[i]);
        }
    }
}
