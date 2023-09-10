package com.gl.question1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
	
	public static void serializeMap(String fileName, Map<Project, ArrayList<Employee>> map) throws IOException {
        FileOutputStream fout = new FileOutputStream(fileName);
        ObjectOutputStream out = new ObjectOutputStream(fout);
        out.writeObject(map);
        out.flush();
        System.out.println("Success");
    }
	
	public static Map<Project, ArrayList<Employee>> deserializeMap(String fileName) throws ClassNotFoundException, IOException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName));
        Object obj = in.readObject();
        return (Map<Project, ArrayList<Employee>>) obj;
        
    }
	
	public static void displayMap(Map<Project, ArrayList<Employee>> map) {
        if (map != null) {
            for (Map.Entry<Project, ArrayList<Employee>> entry : map.entrySet()) {
                Project project = entry.getKey();
                ArrayList<Employee> employees = entry.getValue();

                System.out.println("Project: " + project);
                for (Employee employee : employees) {
                    System.out.println("  Employee: " + employee);
                }
            }
        } else {
            System.out.println("Map is null.");
        }
    }

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Employee e1 = new Employee("E001","Harsha","9383993933","RTNagar",1000);
		Employee e2 = new Employee("E002","Harish","9354693933","Jayanagar",2000);
		Employee e3 = new Employee("E003","Meenal","9383976833","Malleswaram",1500);
		
		Employee e4 = new Employee("E004","Sundar","9334593933","Vijayanagar",3000);
		Employee e5 = new Employee("E005","Suman","9383678933","Indiranagar",2000);
		Employee e6 = new Employee("E006","Suma","9385493933","KRPuram",1750);
		
		Employee e7 = new Employee("E007","Chitra","9383978933","Koramangala",4000);
		Employee e8 = new Employee("E008","Suraj","9383992133","Malleswaram",3000);
		Employee e9 = new Employee("E009","Manu","9345193933","RTNagar",2000);


		Project project1 = new Project("P1","Music Synthesizer",23);
		Project project2 = new Project("P2","Vehicle Movement Tracker",13);
		Project project3 = new Project("P3","Liquid Viscosity Finder",15);
		
		Map<Project, ArrayList<Employee>> map1 = new HashMap<>();
	    map1.put(project1, new ArrayList<>());
	    
	    map1.get(project1).add(e1);
	    
        map1.get(project1).add(e2);
        
        map1.get(project1).add(e3);
        
        map1.put(project2, new ArrayList<>());
        map1.get(project2).add(e4);
        
        map1.get(project2).add(e5);
        
        map1.get(project2).add(e6);
        
        map1.put(project3, new ArrayList<>());
        map1.get(project3).add(e7);
        
        map1.get(project3).add(e8);
        
        map1.get(project3).add(e9);
        
        
        serializeMap("C:\\Dinesh\\ser.txt", map1);

       Map<Project, ArrayList<Employee>> deserializedMap1 = deserializeMap("C:\\Dinesh\\ser.txt");
        displayMap(deserializedMap1);

	}

}
