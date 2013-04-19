/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.labprog.tp1.ejer4;

/**
 *
 * @author Matias
 */
public class ListaInt {
    private Ordenar est =null;
    private int[] lista;
    public ListaInt(int[] list){
    lista=list;
    }
    public void setEst(Ordenar s){
     est=s;
    }
    public void sort(){
        if (est==null) {
            System.out.print("error" );
        }
        else {
            est.Ordenar(lista);
        }
    }
    public void printMe(){
        System.out.println();
        System.out.print("(");
        for(int x:lista){
            System.out.print(x);
            System.out.print(" ");
        }
        System.out.print(")");
        System.out.println();
    }
    
    public void ordenarLista()
    {
        this.est.Ordenar(this.lista);
    }
   
    

        
        public static void main(String[] args) {
            int [] test={34,6,3,3,5,6,4,434,5,7,8,535,67,8,8,4,63464,7,8,6,86,85,54,6346,346,4,546,985};
            ListaInt l =new ListaInt(test);
            l.setEst(new OrdenMerge());
            l.printMe();
            l.ordenarLista();
            l.printMe();
            
           
      
    }
}
