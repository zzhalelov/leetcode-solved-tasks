import java.util.Arrays;

public class Solution {
    public double[] convertTemperature(double celsius) {
        double kelvin = celsius + 273.15;
        double fahrenheit = (celsius * 1.80) + 32;
        double[] ans = {kelvin, fahrenheit};
        System.out.println(Arrays.toString(ans));
        return ans;
    }
}