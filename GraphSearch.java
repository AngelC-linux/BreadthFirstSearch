/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package breadthFirstSearch;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
//import java.util.*;
/**
 *
 * @author AngelC-Linux
 */
public class GraphSearch {
    public void breadthFirstSearch(Destination inicio, Destination definitivo) {
        Queue<Destination> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        queue.add(inicio);

        while (!queue.isEmpty()) {
            Destination current = queue.poll();
            String actual = current.name;

            if (actual.equals(definitivo.name)) {
                System.out.println("Ruta desde: " + inicio + " hasta " + definitivo + ":");
                printPath(inicio, definitivo);
                return;
            }
            
            
            if (!visited.contains(actual)) {
                System.out.println("Lugar Recorrido: " + actual);
                visited.add(actual);

                List<Destination> connections = current.getConnections();
                if (connections != null) {
                    for (Destination connection : connections) {
                        if (!visited.contains(connection.name)) {
                            queue.add(connection);
                        }
                    }
                }
            }
        }
        System.out.println("Error en los nodos");
    }

    private void printPath(Destination inicio, Destination definitivo) {
        System.out.println("Ruta desde " + inicio + " hasta " + definitivo + ":");
        while (definitivo != null) {
            System.out.print("Lugar encontrado " + definitivo + " ");
            definitivo = getCommonAncestor(inicio, definitivo);
        }
        System.out.println();
    }

    private Destination getCommonAncestor(Destination inicio, Destination definitivo) {
        List<Destination> connections = definitivo.getConnections();
        return connections.isEmpty() ? null : connections.get(0);
    }
}

    
    /*private static void printPath(Destination start, Destination end){
        System.out.println(start + " ");
        if(start != end){
            Destination commonAncestor = getCommonAncestor(start, end);
            if(commonAncestor != null){
               printPath(commonAncestor,end);
            }else{
                System.out.println("No hay ancestro en común");
            }
        }
    }
    
    private static Destination getCommonAncestor(Destination start, Destination end){
        List<Destination> connections = end.getConnections();
        return connections.isEmpty() ? null : connections.get(0);
    }*/

