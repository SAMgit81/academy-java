package com.bptn.course._25_jdbc_postgressql;

import java.sql.Connection;

public class Main {

	public static void main(String[] args) {
		ToDoListClass jdbc = new ToDoListClass();
		Connection conn = jdbc.createConnection();
		jdbc.getAllUsers(conn);
		jdbc.getTaskByDate(conn, "2024");
		jdbc.closeConnection(conn);

	}

}
