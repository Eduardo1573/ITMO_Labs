import java.util.Arrays;
import java.util.Random;
                         
public class First_Laba {
	public static void main(String[] args) {
		printer(calc());
	}
	
	public static double[][] calc() {
		double[] z = new double[7];
		for (var i=0; i<7; i++) {
			z[i] = i*2+4;
		}
		Random r = new Random();
		double[] x = new double[19];
		for (var i=0; i<19; i++) {
			x[i] = r.nextInt(28)-14;
		}
		double[][] z1 = new double[7][19];
		for (var i=0; i<7; i++) {
			for (var j=0; j<19; j++) {
				double absX = Math.abs(x[j]);
				if (z[i] == 4) {
					z1[i][j] = Math.asin(1 / Math.pow( Math.E, 2 * Math.sqrt(absX) ));
				} else if (z[i] == 8 || z[i] == 12 || z[i] == 16) {
					z1[i][j] = Math.pow(4*(absX + 1), x[j]);
				} else {
					z1[i][j] = Math.pow(Math.PI * Math.log(Math.pow(absX + 1, Math.pow(Math.log(absX)/Math.PI, 2))), 2);
				}
			}
		}
		return z1;
	}
	
	public static void printer(double My_array[][]) {
		for (var i=0; i<My_array.length; i++) {
			for (var j=0; j<19; j++) {
				System.out.format("%.2f\t", My_array[i][j]);
			}
			System.out.print("\n");
		}
	}
}








