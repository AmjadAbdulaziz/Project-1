package org.ex.project;

import org.ex.project.screens.WelcomeScreen;

public class projectApplication {

    public static void main(String[] args) {
    	
    	WelcomeScreen welcome = new WelcomeScreen();
    	welcome.introWS();
    	welcome.GetUserInput();

    }
}
