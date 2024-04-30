package com.map;

import java.util.HashMap;
import java.util.Map;

	public class StudentDatabase {
	    public static void main(String[] args) {
	        // Create a HashMap to store student ID and name
	        Map<Integer, String> studentMap = new HashMap<>();

	        // Add students to the database
	        addStudent(studentMap, 101, "Alice");
	        addStudent(studentMap, 102, "Bob");
	        addStudent(studentMap, 103, "Charlie");
	        addStudent(studentMap, 104, "David");

	        // Print all students in the database
	        System.out.println("Students in the database:");
	        printStudents(studentMap);

	        // Retrieve a student's name by ID
	        int studentId = 102;
	        String studentName = getStudentName(studentMap, studentId);
	        System.out.println("\nName of student with ID " + studentId + ": " + studentName);

	        // Remove a student from the database
	        removeStudent(studentMap, 103);
	        System.out.println("\nAfter removing student with ID 103:");
	        printStudents(studentMap);
	    }

	    // Method to add a student to the database
	    private static void addStudent(Map<Integer, String> map, int id, String name) {
	        map.put(id, name);
	        System.out.println("Added student: ID " + id + ", Name: " + name);
	    }

	    // Method to print all students in the database
	    private static void printStudents(Map<Integer, String> map) {
	        for (Map.Entry<Integer, String> entry : map.entrySet()) {
	            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
	        }
	    }

	    // Method to get a student's name by ID
	    private static String getStudentName(Map<Integer, String> map, int id) {
	        return map.getOrDefault(id, "Student not found");
	    }

	    // Method to remove a student from the database by ID
	    private static void removeStudent(Map<Integer, String> map, int id) {
	        String removedStudent = map.remove(id);
	        if (removedStudent != null) {
	            System.out.println("Removed student: ID " + id + ", Name: " + removedStudent);
	        } else {
	            System.out.println("Student with ID " + id + " not found");
	        }
	    }
	}


