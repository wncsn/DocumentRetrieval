
package Test;

public class TestRegex {

    public static void main(String[] args) {
        String test = "ini sebuah, kalimat..?";
        test = test.replaceAll("[,?.]", "");
        System.out.println(test);
    }
}
