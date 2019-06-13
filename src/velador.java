/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ISTLOJAV
 */
public class velador {
    private String color;
    private double tamaño;
    private String diseño;
    private String peso;
    //metodos
    public void guardar(){
        System.out.println("hola soy un velador y puedes guardar cosas");
        
    }
    public void asentar(){
        System.out.println("hola soy velador y puedes asentar cosas");
    }
    public void imprimir(String info){
        System.out.println(info);
  
        velador objetoprimero=new velador();
        objetoprimero.asentar();
        objetoprimero.guardar();
      
            
    }
}
