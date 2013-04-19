/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.labprog.tp1.ejer4;

/**
 *
 * @author Usuario
 */
public class OrdenMerge extends Ordenar {

    @Override
    public void Ordenar(int[] lista) { 
        mergesort(0,lista.length-1, new int[lista.length],lista);
    }
    private void mergesort(int low, int high,int[] helper,int[] lista) {		
		if (low < high) {			
			int middle = (low + high) / 2;			
			mergesort(low, middle,helper,lista);			
			mergesort(middle + 1, high,helper,lista);			
			merge(low, middle, high,helper,lista);
		}
	}

	private void merge(int low, int middle, int high,int [] helper,int[] lista) {
		for (int i = low; i <= high; i++) {
			helper[i] = lista[i];
		}
		int i = low;
		int j = middle + 1;
		int k = low;		
		while (i <= middle && j <= high) {
			if (helper[i] <= helper[j]) {
				lista[k] = helper[i];
				i++;
			} else {
				lista[k] = helper[j];
				j++;
			}
			k++;
		}		
		while (i <= middle) {
			lista[k] = helper[i];
			k++;
			i++;
		}
        }
    
    
}
