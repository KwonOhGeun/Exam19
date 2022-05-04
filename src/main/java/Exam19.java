import java.util.ArrayList;

public class Exam19 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Black");
        colors.add("White");
        colors.add(0, "Green");
        colors.add(1, "Red");

        //set() method
        colors.set(0, "Blue");
        colors.set(1, "Grey");

        System.out.println(colors);
    }
}
