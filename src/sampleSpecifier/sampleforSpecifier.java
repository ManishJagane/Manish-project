package sampleSpecifier;

import AccessSpecifier.privateStudy;

public class sampleforSpecifier extends privateStudy 
{

	public static void main(String[] args) 
	{
		privateStudy ps2= new privateStudy();
		//ps2.test1();//calling private method from anther package--> not visble  project
		//ps2.test2();//calling default method from anther package--> not visble project
		//ps2.test3();//calling protected method from anather packege0
		ps2.test4();//calling test method from anther package--> visble throuout whole project
		
		sampleforSpecifier ss= new sampleforSpecifier();
		ss.test3();// calling protected method from from anather package by using inheritance 
		//by using inheritance protected method called to create object for this class 
		ss.test4();// it is public method using this class object

	}
	

}
