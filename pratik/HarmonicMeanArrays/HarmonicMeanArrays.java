package pratik.HarmonicMeanArrays;

public class HarmonicMeanArrays {

  public static void main(String[] args) {
    double[] list = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    double mean = 0;
    for (int i = 0; i < list.length; i++) {
      mean += 1 / (list[i]);
    }
    double harmonicMean = list.length / mean;
    System.out.println(harmonicMean);
  }
}
