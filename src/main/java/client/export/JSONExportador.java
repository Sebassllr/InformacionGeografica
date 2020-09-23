package client.export;

import client.graph.node.Ciudad;
import client.graph.node.Industria;
import client.graph.node.LugarTurismo;

public class JSONExportador implements Exportador {
    @Override
    public String exportarCiudad(Ciudad ciudad) {
        return String.format("{\"id\":%d, \"nombre\":%s}", ciudad.getId(), ciudad.getNombre());
    }

    @Override
    public String exportarIndustria(Industria industria) {
        return String.format("{\"id\":%d, \"nombre\":%s}", industria.getId(), industria.getNombre());
    }

    @Override
    public String exportarLugarTurismo(LugarTurismo lugarTurismo, int calificacion) {
        return String.format("{\"id\":%d, \"nombre\":%s, \"calificacion\":%d}", lugarTurismo.getId(), lugarTurismo.getNombre(), calificacion);
    }
}
