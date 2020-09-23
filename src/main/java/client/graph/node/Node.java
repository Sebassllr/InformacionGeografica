package client.graph.node;

import client.export.Exportador;

public abstract class Node {

    private Long id;
    private String nombre;

    public Node(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public abstract String exportar(Exportador exportador);

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
