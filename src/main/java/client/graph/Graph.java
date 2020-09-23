package client.graph;

import client.export.Exportador;
import client.graph.node.Ciudad;
import client.graph.node.Industria;
import client.graph.node.LugarTurismo;
import client.graph.node.Node;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Graph {

    private Exportador exportador;

    private List<Node> nodes = new ArrayList<>(Arrays.asList(new Ciudad(1L, "Ciudad"),
            new Industria(2L, "Industria"),
            new LugarTurismo(3L, "Lugar turismo", 5)));

    public String exportar() {
        StringBuilder xml = new StringBuilder();
        if(exportador != null) {
            for(Node node : nodes) {
                xml.append(node.exportar(exportador));
            }
        }else {
            throw new RuntimeException("No exporter set");
        }
        return xml.toString();
    }

    public void addNode(Node node) {
        nodes.add(node);
    }

    public List<Node> getNodes() {
        return nodes;
    }

        public void setNodes(List<Node> nodes) {
        this.nodes = nodes;
    }

    public void setExportador(Exportador exportador) {
        this.exportador = exportador;
    }
}
