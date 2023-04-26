package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;

public class DANI extends PApplet {

	
	//String[] lines;
	ArrayList<String> lineList = new ArrayList<>(); 
	ArrayList<String> wordsList = new ArrayList<>(); 
	ArrayList<Follow> followList = new ArrayList<>();

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

	public void printModel() {
		int totalWords = wordsList.size();
		println("The number of words in this file is: " + totalWords);
	
	
		for (String word : wordsList) {
			boolean found = false;
			for (Follow follow : followList) {
				if (follow.getWord().equals(word)) {
					follow.setCount(follow.getCount() + 1);
					found = true;
					break;
				}
			}
			if (!found) {
				Follow follow = new Follow(word, 1);
				followList.add(follow);
			}
		}
	
		for (Follow follow : followList) {
			String word = follow.getWord();
			int count = follow.getCount();
			println( word + " frequency: " + count);
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
