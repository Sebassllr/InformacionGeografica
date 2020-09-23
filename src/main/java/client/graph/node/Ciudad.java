package client.graph.node;

import client.export.Exportador;

public class Ciudad extends Node{

    public Ciudad(Long id, String nombre) {
        super(id, nombre);
    }

    @Override
    public String exportar(Exportador exportador) {
        return exportador.exportarCiudad(this);
    }



}
