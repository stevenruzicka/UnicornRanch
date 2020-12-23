package com.ruzicka.unicorns;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ranch {
	

  final private String host = "localhost";
  final private String user = "root";
  final private String passwd = "";
  
  private Connection connect = null;
  private Statement statement = null;
  private ResultSet resultSet = null;
  
  public Ranch() {

  }
  
  public void updateUnicorn(String name, String location) throws Exception {
	    try {
	        // This will load the MySQL driver, each DB has its own driver
	        Class.forName("com.mysql.jdbc.Driver");
	        
	        // Setup the connection with the DB
	        connect = DriverManager
	            .getConnection("jdbc:mysql://" + host + "/unicorns?"
	                + "user=" + user + "&password=" + passwd );

	        statement = connect.createStatement();
	        statement.executeUpdate("update unicorns.unicorns set location = '" + location + "' where name = '" + name + "'");
	        
	    } catch (Exception e) {
	        throw e;
	    } finally {
	        close();
	    }
}

  public String getAllUnicornNames() throws Exception {
	    String result = "";
	    try {
	        // This will load the MySQL driver, each DB has its own driver
	        Class.forName("com.mysql.jdbc.Driver");
	        
	        // Setup the connection with the DB
	        connect = DriverManager
	            .getConnection("jdbc:mysql://" + host + "/unicorns?"
	                + "user=" + user + "&password=" + passwd );

	        statement = connect.createStatement();
	        resultSet = statement.executeQuery("select Name from unicorns.unicorns");
	        
	        while (resultSet.next()) {
	        	result += resultSet.getString("Name") + "|";
	        }
	    } catch (Exception e) {
	        throw e;
	    } finally {
	        close();
	    }
	  return result;
  }

  public String getAllUnicornColors() throws Exception {
	    String result = "";
	    try {
	        // This will load the MySQL driver, each DB has its own driver
	        Class.forName("com.mysql.jdbc.Driver");
	        
	        // Setup the connection with the DB
	        connect = DriverManager
	            .getConnection("jdbc:mysql://" + host + "/unicorns?"
	                + "user=" + user + "&password=" + passwd );

	        statement = connect.createStatement();
	        resultSet = statement.executeQuery("select Color from unicorns.unicorns");
	        
	        while (resultSet.next()) {
	        	result += resultSet.getString("Color") + "|";
	        }
	    } catch (Exception e) {
	        throw e;
	    } finally {
	        close();
	    }
	  return result;
}

  public String getAllUnicornLocations() throws Exception {
	    String result = "";
	    try {
	        // This will load the MySQL driver, each DB has its own driver
	        Class.forName("com.mysql.jdbc.Driver");
	        
	        // Setup the connection with the DB
	        connect = DriverManager
	            .getConnection("jdbc:mysql://" + host + "/unicorns?"
	                + "user=" + user + "&password=" + passwd );

	        statement = connect.createStatement();
	        resultSet = statement.executeQuery("select Location from unicorns.unicorns");
	        
	        while (resultSet.next()) {
	        	result += resultSet.getString("Location") + "|";
	        }
	    } catch (Exception e) {
	        throw e;
	    } finally {
	        close();
	    }
	  return result;
}

  // You need to close the resultSet
  private void close() {
    try {
      if (resultSet != null) {
        resultSet.close();
      }

      if (statement != null) {
        statement.close();
      }

      if (connect != null) {
        connect.close();
      }
    } catch (Exception e) {

    }
  }

}