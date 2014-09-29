/**
 * 
 */
package com.haarisinfo.service;


/**
 * @author 
 * generic class for CRUD operations
 */
public abstract class GenericService<K,V> {
	public  abstract void add(K key, V object);
	public abstract V get(K key) ;
}
