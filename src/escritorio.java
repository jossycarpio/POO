/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ISTLOJAV
 */
public class escritorio {
    //declaro atributos
    private String color;
    private double peso;
    private double tamaño;
    private String diseño;
    //declaro metodos
    public void guardar(){
        System.out.println("hola soy un escritorio y guardo cosas");
    }
    public void asentar(){
        System.out.println("hola soy un escritorio y puedes asentar cosas");
        
    }
     public void imprimir(String info){
        System.out.println(info);
     }
        public static void main(String[] args) {
        escritorio primerobjeto= new escritorio();
        primerobjeto.asentar();
        primerobjeto.guardar();
    }
}
