package com.selenium;

import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class Propertiestest {
	public static void main(String[] args) {
		Properties pt=new Properties();
		
		pt.put("100", "java");
		pt.put("200", "c");
		pt.put("300", ".net");
		
		Set s=pt.keySet();
		Iterator itr =s.iterator();
		while(itr.hasNext()) {
			System.out.println(pt.get((String) itr.next()));
			try {
				
			
			FileOutputStream fo= new FileOutputStream("D:\\prop.xml");
			pt.storeToXML(fo, "key-value pair");
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
