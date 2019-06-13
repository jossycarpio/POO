/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ISTLOJAV
 */
public class copiadora {
    //declaro atributos
    private String marca;
    private double tamaño;
    private double precio;
    private double peso;
    //ddeclaro métodos
    public void imprimir(){
        System.out.println("hola soy una copiadora e imprimo documentos");
    }
    public void escanear(){
        System.out.println("hola soy una copiadora y escaneo documentos");
    }
    public void copiar(){
        System.out.println("hola soy una copiadora y copio documentos");   
    }
    public void imprimir(String info){
        System.out.println(info);
    }
    public static void main(String[] args) {
        copiadora primerobjeto= new copiadora();//he creado mi primer objeto
        primerobjeto.imprimir();
        primerobjeto.escanear();
        
        
    }
}
