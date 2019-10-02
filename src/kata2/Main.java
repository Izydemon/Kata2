
package kata2;

public class Main {

    public static void main(String[] args) {
        Histogram histogram = new Histogram(5,8,4,6,8,4,2,1,5,3,6,9,7,1,1,1,1);
        HistogramDisplay display = new HistogramDisplay(histogram);
        display.execute();
    }
    
}
