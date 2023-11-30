/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package breadthFirstSearch;

import java.util.LinkedList;
import java.util.List;
/**
 *
 * @author AngelC-Linux
 */
class Destination {
    String name;
    List<Destination> connections;
    
    public Destination(String name){
        this.name = name;
        this.connections = new LinkedList<>();
    }
    
    public void addConnection(Destination destination){
        connections.add(destination);
    }
    
    public List<Destination> getConnections(){
        return connections;
    }
    
    @Override
    public String toString(){
        return name;
    }
}
