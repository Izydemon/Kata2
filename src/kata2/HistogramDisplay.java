package kata2;

public class HistogramDisplay {
    private final Histogram histogram;

    HistogramDisplay(Histogram histogram) {
        this.histogram = histogram;
    }

    void execute() {
        for (int value : histogram.getValues()) {
            System.out.println(value + " " + histogram.getCount(value));
        }
    }
    
}
