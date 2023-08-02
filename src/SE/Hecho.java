/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SE;

/**
 *
 * @author MIRKO
 */
public class Hecho {
    int variable;
    float valor;

    public Hecho(int variable, float valor) {
        this.variable = variable;
        this.valor = valor;
    }
    
    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Hecho && ((Hecho)obj).variable == this.variable);
    }
}
