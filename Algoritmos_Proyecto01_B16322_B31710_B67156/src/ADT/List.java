/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADT;

import Exceptions.ListException;

/**
 * Interface Specification  List
 * @version1.0
 * @author Daniel Solano
 */
public interface List {

    public int getSize() throws ListException;

    public void cancel();

    public boolean isEmpty();

    public int getPosition(Object element) throws ListException;

    public void insert(Object element);

    public void ordererInsert(Object element) throws ListException;

    public void delete(Object element) throws ListException;

    public boolean isElement(Object element);

    public Object first() throws ListException;

    public Object last() throws ListException;
    
    public Object getNode(int node) throws ListException;

}
