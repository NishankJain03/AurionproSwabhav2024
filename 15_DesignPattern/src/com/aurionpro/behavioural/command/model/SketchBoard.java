package com.aurionpro.behavioural.command.model;

public class SketchBoard {
	Command command;
    
    public void setCommand(Command command) {
        this.command = command;
    }
    
    public void drawTheShape() {
        command.execute();
    }
}
