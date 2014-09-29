package service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.haarisinfo.entity.Employee;
import com.haarisinfo.service.GenericService;;

public class EmployeeService<K,V> extends GenericService<K, V>{
    Map<K, V> employeeList=new HashMap<K, V>();
	@Override
	public void add(K key, V object) {
		employeeList.put(key, object);
	}

	@Override
	public V get(K key) {
		return employeeList.get(key);
	}
	public void getEmployeesList(int... args){

	Iterator<K> keyIterator=employeeList.keySet().iterator();
		
		if(args.length==0)
		{
			while(keyIterator.hasNext()){
				K key=keyIterator.next();
				Employee e=(Employee)employeeList.get(key);
				System.out.println("Emploee Name : "+e.getName());
				System.out.println("Employee Mail ID : "+e.getEmail());
				System.out.println("Employee joined year : "+e.getYear());
			}
		}
		else if(args.length==1)
		{
			while(keyIterator.hasNext()){
				K key=keyIterator.next();
				Employee e=(Employee)employeeList.get(key);
				if(args[0]==e.getYear()){
					System.out.println("Emploee Name : "+e.getName());
					System.out.println("Employee Mail ID : "+e.getEmail());
					System.out.println("Employee joined year : "+e.getYear());
					//break;
				}
			}
			
		}
		else if(args.length==2)
		{
			while(keyIterator.hasNext()){
				K key=keyIterator.next();
				Employee e=(Employee)employeeList.get(key);
				if(args[0]<=e.getYear() && args[1]>=e.getYear()){
					System.out.println("Emploee Name : "+e.getName());
					System.out.println("Employee Mail ID : "+e.getEmail());
					System.out.println("Employee joined year : "+e.getYear());
					//break;
				}
				
			}
			
		}
		
	}
	public void getEmployees(){
		Iterator<K> keyIterator=employeeList.keySet().iterator();
		while(keyIterator.hasNext()){
			K key=keyIterator.next();
			Employee e=(Employee)employeeList.get(key);
			System.out.println("Emploee Name : "+e.getName());
			System.out.println("Employee Mail ID : "+e.getEmail());
			System.out.println("Employee joined year : "+e.getYear());
		}
	}
	public void getEmployees(int year){
		Iterator<K> keyIterator=employeeList.keySet().iterator();
		while(keyIterator.hasNext()){
			K key=keyIterator.next();
			Employee e=(Employee)employeeList.get(key);
			if(year==e.getYear()){
				System.out.println("Emploee Name : "+e.getName());
				System.out.println("Employee Mail ID : "+e.getEmail());
				System.out.println("Employee joined year : "+e.getYear());
				//break;
			}
			
		}
	}
	public void getEmployees(int startyear,int endyear){
		Iterator<K> keyIterator=employeeList.keySet().iterator();
		while(keyIterator.hasNext()){
			K key=keyIterator.next();
			Employee e=(Employee)employeeList.get(key);
			if(startyear<=e.getYear() && endyear>=e.getYear()){
				System.out.println("Emploee Name : "+e.getName());
				System.out.println("Employee Mail ID : "+e.getEmail());
				System.out.println("Employee joined year : "+e.getYear());
				//break;
			}
			
		}
	}

	public void getEmployeeBykey(String emailId) {

		Iterator<K> keyIterator=employeeList.keySet().iterator();
		while(keyIterator.hasNext()){
			K key=keyIterator.next();
			Employee e=(Employee)employeeList.get(key);
			if(emailId.equals(e.getEmail())){
				System.out.println("Emploee Name : "+e.getName());
				System.out.println("Employee Mail ID : "+e.getEmail());
				System.out.println("Employee joined year : "+e.getYear());
				break;
			}
			
		}
		
	}
}
