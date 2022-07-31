package com.BuildingFloors.main;

import java.util.*;

public class main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the total no of floors in the building");
		
		int floors=sc.nextInt();
		
		service analyze=new service();
		
		analyze.getFloorSize(floors);
		
		analyze.constructionOrder();	
		
		sc.close();

	}

}