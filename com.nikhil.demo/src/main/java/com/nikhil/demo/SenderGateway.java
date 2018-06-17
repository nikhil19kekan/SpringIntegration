package com.nikhil.demo;

/*Just an interface with declared method ,
internally springs gateway function are used to carry out 
messaging related tasks(no need to extend from anything)
*/
public interface SenderGateway {
	public void print(String msg);
}
