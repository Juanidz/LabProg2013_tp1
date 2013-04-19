/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.labprog.tp1.ejer4;

/**
 *
 * @author Usuario
 */
public class OrdenQuick extends Ordenar{

    @Override
    public void Ordenar(int[] lista) {
     quicksort(0,lista.length-1,lista);
    }
    private void quicksort(int low,int high,int[] lista) {                         
		int i=low, j =high;
		int pivot = lista[low + (high-low)/2];
		while (i <= j) {
			while (lista[i] < pivot) {
				i++;
			}
			while (lista[j] > pivot) {
				j--;
			}

			if (i <= j) {
				exchange(i, j,lista);
				i++;
				j--;
			}
		}
		// Recursion
		if (low < j){
			quicksort(low, j,lista);}
		if (i < high){
			quicksort(i, high,lista);}
	}

	private void exchange(int i, int j,int[] lista) {
		int temp = lista[i];
		lista[i] = lista[j];
		lista[j] = temp;
        }
}