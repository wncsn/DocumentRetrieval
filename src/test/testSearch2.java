/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;
import model.Document;
import model.InvertedIndex;
import model.SearchingResult;

/**
 *
 * @author admin
 */
public class testSearch2 {

    public static void main(String[] args) {
        
        Document doc1 = new Document(1, "Shipment of gold damaged in a fire");
        Document doc2 = new Document(2, "delivery of silver arrived in a silver truck");
        Document doc3 = new Document(3, "shipment of gold arrived in a truck");

        InvertedIndex index = new InvertedIndex();
        index.addNewDocument(doc1);
        index.addNewDocument(doc2);
        index.addNewDocument(doc3);
        index.makeDictionaryWithTermNumber();
        
        String query = "silver gold truck";
        System.out.println("query = " + query);
        ArrayList<SearchingResult> hasilCari1 = index.searchTFIDF(query);
        for (int i = 0; i < hasilCari1.size(); i++) {
            SearchingResult doc = hasilCari1.get(i);
            System.out.println("ID Dokumen = " + doc.getDocument().getId());
        }
        System.out.println("query = " + query);
        ArrayList<SearchingResult> hasilCari2 = index.searchCosineSimilarity(query);
        for (int i = 0; i < hasilCari2.size(); i++) {
            SearchingResult doc = hasilCari2.get(i);
            System.out.println("ID Dokumen = " + doc.getDocument().getId());
        }
    }
}