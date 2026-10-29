package org.eruiz.poointerfaces.modelo;

/**
 * Cliente que hereda los datos y el comportamiento de {@link Cliente} e
 * implementa {@link Comparable} para declarar que puede compararse con otro
 * {@code ClientePremium}.
 */
public class ClientePremium extends Cliente implements Comparable<ClientePremium>{

    public ClientePremium(String nombre, String apellido){
        super(nombre, apellido);
    }
    
    /**
     * Implementa el método exigido por {@code Comparable<ClientePremium>}.
     *
     * <p>En esta implementación siempre devuelve {@code 0}, lo que indica que
     * los dos clientes se consideran iguales en cuanto al orden de
     * comparación. No compara los atributos de los clientes.</p>
     *
     * @param clienteP cliente premium con el que se compararía este objeto
     * @return {@code 0}, indicando que ambos objetos tienen el mismo orden
     */
    @Override 
    public int compareTo(ClientePremium clienteP){
        return 0;
    }
}
