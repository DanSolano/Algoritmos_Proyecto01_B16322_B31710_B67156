package ADT;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Store a value and a pointer to next element
 * @version 1.0
 * @author Daniel Solano
 */
public class Node {

    public Object element;
    public Node next;
    public Node previoius;

    public Node(Object obbject) {
        this.element = obbject;
        this.next = null;
        this.previoius = null;
    }

    public Node(Object element, Node next) {
        this.element = element;
        this.next = next;
        this.previoius = previoius ;
    }

    public Node() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
