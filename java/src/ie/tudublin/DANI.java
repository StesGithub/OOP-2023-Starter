package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;

public class DANI extends PApplet {

	
	//String[] lines;
	ArrayList<String> lineList = new ArrayList<>(); 
	ArrayList<String> wordsList = new ArrayList<>(); 

	public void settings() {
		size(1000, 1000);
		//fullScreen(SPAN);
	}

    String[] sonnet;

    public String[] writeSonnet()
    {
        return null;
    }

	public void setup() {
		colorMode(HSB);
		loadFile();
		printModel();
       
	}

	public void keyPressed() {

	}
	public void loadFile(){
		String[] lines = loadStrings("small.txt");
		
	
		println("There are " + lines.length + " lines in this file");
		for(int i = 0; i < lines.length; i++){
			println(lines[i]);
			String[] words = lines[i].split(" ");
			for (String word : words) {
				wordsList.add(word); 
			}
		}
	}

	public void printModel(){
		int totalWords = wordsList.size();
		println("the number of words in this file is: " + totalWords);
		for(String word: wordsList){
			println(word);
		}
	}

	float off = 0;

	public void draw() 
    {
		background(0);
		fill(255);
		noStroke();
		textSize(20);
        textAlign(CENTER, CENTER);
        
	}
}
