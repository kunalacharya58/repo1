package com.jdbc.demo.insert;

import com.jdbc.demo.model.Player;

public class InsertMain {

	public static void main(String[] args) {
		PlayerInsert pi = new PlayerInsert();
		pi.createPlayer(new Player(110, "Gayle", 44, "RCB", "M"));
		System.out.println("\nRow Inserted Succesfully!");
	}

}
