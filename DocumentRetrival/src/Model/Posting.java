package Model;

public class Posting implements Comparable<Posting> {

    private String term;
    private Document document;
    private int NumberOfTerm;
    private double weight;

    public Posting() {

    }

    public int getNumberOfTerm() {
        return NumberOfTerm;
    }

    public void setNumberOfTerm(int NumberOfTerm) {
        this.NumberOfTerm = NumberOfTerm;
    }

    public Posting(Document document) {
        this.document = document;
    }

    public Posting(String term, Document document) {
        this.term = term;
        this.document = document;
        NumberOfTerm = 1;
        setWeight(0);
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(Posting posting) {
        return term.compareToIgnoreCase(posting.getTerm());
    }

}
