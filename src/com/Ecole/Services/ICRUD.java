/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Ecole.Services;

import java.util.List;

/**
 *
 * @author Mohamed Trabelsi
 * @param <E>
 */
public interface ICRUD<E> {
    public void ajouter(E e);
   
    public List<E> affichertt();
 
    
}
