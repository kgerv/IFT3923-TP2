import java.io.File;

public class Main {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\Killian\\Desktop\\jfreechart-master\\"+
                "src\\test\\java\\org\\jfree\\chart\\WaterfallChartTest.java");
        Age a = new Age(f);
        System.out.println(a.calculateAgeDifference());
    }
}
