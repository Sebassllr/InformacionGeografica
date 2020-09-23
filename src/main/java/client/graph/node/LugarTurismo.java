package client.graph.node;

import client.export.Exportador;

public class LugarTurismo extends Node{

    private int calificacion;

    public LugarTurismo(Long id, String nombre) {
        super(id, nombre);
    }

    @Override
    public String exportar(Exportador exportador) {
        return exportador.exportarLugarTurismo(this, calificacion);
    }

    public LugarTurismo(Long id, String nombre, int calificacion) {
        super(id, nombre);
        this.calificacion = calificacion;
    }
}
