package ej7;

public class Ej7 {
	private static int[] array = new int[10];
	
	public static void ordenarDirecta() {
		int min= Integer.MAX_VALUE;
		int posicionMin;
		for (int i = 0; i < array.length; i++) {
			if(array[i]<min) {
				min=array[i];
				posicionMin=i;
			}
		}
	}
}
