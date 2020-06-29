package com.jdbc.demo.insert;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jdbc.demo.model.Player;
import com.jdbc.demo.util.MySqlConnection;

public class PlayerInsert {
	
	public int createPlayer(Player player) {
		int c = 0;
		try (Connection conn = MySqlConnection.getConnection()) {
			String sql = "INSERT INTO player(id,name,gender,teamName,age) VALUES (?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, player.getId());
			ps.setString(2, player.getName());
			ps.setString(3, player.getGender());
			ps.setString(4, player.getTeamName());
			ps.setInt(5, player.getAge());
			c = ps.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new RuntimeException("Internal Error");
		}
		return c;
	}

}
