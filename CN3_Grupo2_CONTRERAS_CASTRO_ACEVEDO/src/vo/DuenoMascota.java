/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vo;

/**
 *
 * @author abrah
 */
public class DuenoMascota {
    private String nombre;
    private String apellido;
    private int edad;
    private char sexo;
    private String nombreMascota;
    private char sexoMascota;
    private int idDuenoMascota;

    /**
     * @param nombre
     * @param apellido
     * @param edad
     * @param sexo
     * @param nombreMascota
     * @param sexoMascota
     */
    
    public DuenoMascota(String nombre, String apellido, int edad, char sexo, String nombreMascota, char sexoMascota) {
        //acp constructor para crear registros, no se necesita llave idDuenoMascota porque es autoincremental
        
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
        this.nombreMascota = nombreMascota;
        this.sexoMascota = sexoMascota;
    }
    
    public DuenoMascota(){
        //constructor vacio para cuando se desea setear unicamente idDuenoMascota, indice para eliminar acp
    }
    
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the sexo
     */
    public char getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the nombreMascota
     */
    public String getNombreMascota() {
        return nombreMascota;
    }

    /**
     * @param nombreMascota the nombreMascota to set
     */
    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    /**
     * @return the sexoMascota
     */
    public char getSexoMascota() {
        return sexoMascota;
    }

    /**
     * @param sexoMascota the sexoMascota to set
     */
    public void setSexoMascota(char sexoMascota) {
        this.sexoMascota = sexoMascota;
    }

    /**
     * @return the idDuenoMascota
     */
    public int getIdDuenoMascota() {
        return idDuenoMascota;
    }

    /**
     * @param idDuenoMascota the idDuenoMascota to set
     */
    public void setIdDuenoMascota(int idDuenoMascota) {
        this.idDuenoMascota = idDuenoMascota;
    }
    
}
