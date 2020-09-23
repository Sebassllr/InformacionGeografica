package client;

import client.export.JSONExportador;
import client.export.XMLExportador;
import client.graph.Graph;
import client.graph.node.Ciudad;
import client.graph.node.Industria;
import client.graph.node.LugarTurismo;

public class Main {

    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addNode(new Ciudad(1L, "Ciudad"));
        graph.addNode(new Industria(1L, "Industria"));
        graph.addNode(new LugarTurismo(1L, "LugarTurismo", 4));

        graph.setExportador(new XMLExportador());
        System.out.println(graph.exportar());

        graph.setExportador(new JSONExportador());
        System.out.println(graph.exportar());
    }
}
