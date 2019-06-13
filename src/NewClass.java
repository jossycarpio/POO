/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ISTLOJAV
 */
public class NewClass {
    //declaro los atributos
    private int año;
    private String modelo;
    private String capacidadprocesador;
    private boolean portatil;
    //declaro métodos
    public void guardarInformacion(){
        System.out.println("Hola soy la computadora y guardo información");
    }
    public void leerInformacion(){
        System.out.println("hola soy la computadora y leo informacion");
        
    }
    public void imprimirInformacion(String info){
        System.out.println(info);
    }
                public static void main(String[] args) {
        NewClass primerObjeto= new NewClass(); //he creado mi primer objeto
        primerObjeto.leerInformacion(); //llama un metodo
        primerObjeto.imprimirInformacion("HOLA");
       primerObjeto.imprimirInformacion("chao");
    }
            }
          

