/**
 * 
 */
package com.haarisinfo.service;


/**
 * @author 
 * generic class for CRUD operations
 */
public abstract class GenericService<K,V> {
	
	/*
	 * create a data structure to store employee details
	 */

	/**
	 * 
	 * @param object object which has to be persisted
	 */
	public  abstract void add(K key, V object);
	
	/**
	 * 
	 * @param key unique identifier of an object like [email, id, etc]
	 * @return object which matches the key
	 */
	public abstract V get(K key) ;
}
