/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

public class Alumno {
    private int codigo;
    private String nombre;
    private String Pasta;
    private String Editorial;
    private int año;

    
    public Alumno(int codigo, String nombre, String Pasta, String direccion, int tipo){
        this.codigo=codigo;
        this.nombre=nombre;
        this.Pasta=Pasta;
        this.Editorial=direccion;     
        this.año=tipo;   
    }
    
    public Alumno(){
        this.nombre="Alumno de ejemplo";
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPasta() {
        return Pasta;
    }

    public void setPasta(String pasta) {
        this.Pasta = pasta;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }
        public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
}
