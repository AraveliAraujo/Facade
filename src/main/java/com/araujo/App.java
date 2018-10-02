package com.araujo;

import com.araujo.facade.CheckFacade;

public class App {
	
	public static void main(String[] args) {
		CheckFacade cliente1 = new CheckFacade();
		cliente1.buscar("02/07/2018", "08/07/2018", "Jaén", "Cancún");
		
		CheckFacade cliente2 = new CheckFacade();
		cliente2.buscar("02/07/2018", "08/07/2018", "Jaén", "Quito");
	}

}
