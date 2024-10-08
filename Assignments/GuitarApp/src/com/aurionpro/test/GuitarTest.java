package com.aurionpro.test;

import java.util.Iterator;
import java.util.List;

import com.aurionpro.model.Builder;
import com.aurionpro.model.Guitar;
import com.aurionpro.model.GuitarSpec;
import com.aurionpro.model.Inventory;
import com.aurionpro.model.Type;
import com.aurionpro.model.Wood;

public class GuitarTest {
	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		
		GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, 6,  Wood.ALDER, Wood.ALDER);
		
		List matchingGuitar = inventory.search(whatErinLikes);
		if(!matchingGuitar.isEmpty()) {
			for(Iterator i = matchingGuitar.iterator(); i.hasNext();) {
				Guitar guitar = (Guitar) i.next();
				GuitarSpec spec  = guitar.getSpec();
				System.out.println("Erin you might like this " + 
						spec.getBuilder() + " " + spec.getModel() + " " + spec.getType() + " guitar:\n "+ spec.getNumStrings() + "-string " + 
						spec.getBackWood() +" back and sides,\n " + spec.getTopWood()+ " top\n You can have it for only $ " +
					guitar.getPrice() + "!");
			}
		}else {
			System.out.println("Sorry Erin, nothing for you ");
		}
	}
	public static void initializeInventory(Inventory inventory) {
		inventory.addGuitar("V95693", 1499.95, Builder.FENDER, "Stratocastor", Type.ELECTRIC, 6, Wood.ALDER, Wood.ALDER);
		inventory.addGuitar("V9512", 1549.95, Builder.FENDER, "Stratocastor", Type.ELECTRIC, 6, Wood.ALDER, Wood.ALDER);
	}
}
