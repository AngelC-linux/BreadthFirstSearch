/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package breadthFirstSearch;

/**
 *
 * @author AngelC-Linux
 */
public class MainBFS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Destination NY = new Destination("NY");
        Destination Chi = new Destination("Chi");
        Destination Tor = new Destination("Tor");
        Destination Cal = new Destination("Cal");
        Destination Den = new Destination("Den");
        Destination Hou = new Destination("Hou");
        Destination Urb = new Destination("Urb");
        Destination LA = new Destination("LA");

        NY.addConnection(Chi);
        NY.addConnection(Tor);
        NY.addConnection(Den);
        Chi.addConnection(Den);
        Tor.addConnection(Cal);
        Tor.addConnection(LA);
        Den.addConnection(Hou);
        Den.addConnection(LA);
        Den.addConnection(Urb);
        Urb.addConnection(LA);
        Hou.addConnection(LA);
        
        Destination inicio = NY;
        Destination definitivo = LA;
        
        GraphSearch gs = new GraphSearch();
        gs.breadthFirstSearch(inicio, definitivo);
        
        //GraphSearch.breadthFirstSearch(inicio, definitivo);
    }
    
}
