package com.eason.runaway.model;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc {

	private String title = "Auto load";
	private String artist = "The Beatles";
	
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing " + title + "by " + artist);

	}

}
