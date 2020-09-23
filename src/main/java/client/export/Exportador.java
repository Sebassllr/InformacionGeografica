package client.export;

import client.graph.node.Ciudad;
import client.graph.node.Industria;
import client.graph.node.LugarTurismo;

public interface Exportador {

    String exportarCiudad(Ciudad ciudad);
    String exportarIndustria(Industria industria);
    String exportarLugarTurismo(LugarTurismo lugarTurismo, int calificacion);

}
