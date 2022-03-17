package com.empresa;
/**
 *
 * @author Hector
 */
public class Empregado {
    /**
     *
     * @param args
     */
    public static void main (String[] args){
    }
    /**
 *
 * @author Hector
 */
    private int id;
    /**
 *
 * @author Hector
 */
    private String nome;
    /**
 *
 * @author Hector
 */
    private String apelido1;
    /**
 *
 * @author Hector
 */
    private String apelido2;
    /**
 *
 * @author Hector
 */
    private double salario;
/**
 *
 * @author Hector
     * @param id
     * @param nome
     * @param apelido1
     * @param apelido2
     * @param salario
 */
    public Empregado(int id, String nome, String apelido1, String apelido2, double salario) {
        this.id = id;
        this.nome = nome;
        this.apelido1 = apelido1;
        this.apelido2 = apelido2;
        this.salario = salario;
    }

    /**
     * Get the value of salario
     *
     * @return the value of salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * Set the value of salario
     *
     * @param salario new value of salario
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }


    /**
     * Get the value of apelido2
     *
     * @return the value of apelido2
     */
    public String getApelido2() {
        return apelido2;
    }

    /**
     * Set the value of apelido2
     *
     * @param apelido2 new value of apelido2
     */
    public void setApelido2(String apelido2) {
        this.apelido2 = apelido2;
    }


    /**
     * Get the value of apelido1
     *
     * @return the value of apelido1
     */
    public String getApelido1() {
        return apelido1;
    }

    /**
     * Set the value of apelido1
     *
     * @param apelido1 new value of apelido1
     */
    public void setApelido1(String apelido1) {
        this.apelido1 = apelido1;
    }


    /**
     * Get the value of nome
     *
     * @return the value of nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Set the value of nome
     *
     * @param nome new value of nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    

    /**
     * Get the value of id
     *
     * @return the value of id
     */
    public int getId() {
        return id;
    }

    /**
     * Set the value of id
     *
     * @param id new value of id
     */
    public void setId(int id) {
        this.id = id;
    }
    
    /**
     * obtiene salario
     * @return el salario anual
     */
    
    public double obterSalarioAnual(){
        return this.salario*12;
    }
    /**
     * incrementa el salario
     * @param porcentaxe
     * @return 
     */
    public double incrementarSalario(int porcentaxe){
        double salarioFinal;
        salarioFinal=this.salario/100*porcentaxe;
                return salarioFinal+this.salario;
    }

    /**
     * 
     * @return una cadena
     */
    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     *
     * @return
     */
    public String amosarNomeCompleto(){
        return this.nome + " " + this.apelido1 + " " + this.apelido2;
    }
    
    

}