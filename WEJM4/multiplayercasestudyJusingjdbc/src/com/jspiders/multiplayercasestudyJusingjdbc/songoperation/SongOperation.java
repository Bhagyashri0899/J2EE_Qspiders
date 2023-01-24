package com.jspiders.multiplayercasestudyJusingjdbc.songoperation;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

public class SongOperation {
	
	private static Connection connection;
	private static PreparedStatement preparedStatement ;
	private static int result;
	private static ResultSet resultSet;
	private static String query;
	private static FileReader fileReader;
	private static Properties properties;
	private static String filePath = "D:\\J2EE\\multiplayercasestudyJusingjdbc\\Resources\\db_info.properties";
	private static Scanner scanner ;
	
	private static int id;
	private static String name;
	private static String singer;
	private static Double duration;
	private static String movie_album;
	private static String lyricist;
	private static String composer;
	
	public void openConnection() {
		try {
			fileReader = new FileReader(filePath);
			properties = new Properties();
			properties.load(fileReader);
            Class.forName(properties.getProperty("driverPath"));	
			connection = DriverManager.getConnection(properties.getProperty("dburl"), properties);
	        scanner = new Scanner(System.in);
	
			
		}catch(FileNotFoundException e) {
		      e.printStackTrace();	
		}
		catch(IOException e){
			e.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
		public void closeConnection() {
			try {
				if(connection != null) {
					connection.close();
				}
				
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				
				if(resultSet != null) {
					resultSet.close();
				}
				
				if(scanner != null) {
					scanner.close();
				}
			
			}catch(Exception e){
				e.printStackTrace();
			}
					
}
			
		public void chooseSongToPlay() {
			try {
				
				preparedStatement = connection.prepareStatement(properties.getProperty("query"));
				resultSet = preparedStatement.executeQuery();
				while (resultSet.next()) {
					System.out.println(resultSet.getInt(1) + " | " 
				                      + resultSet.getString(2) + " | " 
							          + resultSet.getString(3) + " | "
							          + resultSet.getDouble(4) + " | " 
							          + resultSet.getString(5) + " | "
						           	  + resultSet.getString(6) + " | "
							          + resultSet.getString(7));
				}
				
				System.out.println("----------------------------------------------------------------------------");
				preparedStatement = connection.prepareStatement(properties.getProperty("query1"));
				System.out.println("Enter the id of song that you want to play.");
				preparedStatement.setInt(1, scanner.nextInt());
				resultSet = preparedStatement.executeQuery();
				while (resultSet.next()) {
					System.out.println(resultSet.getString(1) + " is now playing");
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		public void playAllSongs() {
			try {		
				preparedStatement = connection.prepareStatement(properties.getProperty("query2"));
				resultSet = preparedStatement.executeQuery();
				while (resultSet.next()) {
					System.out.println(resultSet.getString(1) + " is now playing");
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		public void playRandomSong() {
			try {
				preparedStatement = connection.prepareStatement(properties.getProperty("query3"));
				resultSet = preparedStatement.executeQuery();
				while (resultSet.next()) {
					System.out.println(resultSet.getString(1) + " is now playing");
				
				}
				System.out.println("-------------------------------------------------------------------------------------------");

			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		
		public void addSongs() {
			openConnection();
			System.out.println("Please enter the number of songs you want to ADD");
			int addSongCount = scanner.nextInt();
			for (int i = 0; i < addSongCount; i++) {
			try {
				preparedStatement = connection.prepareStatement(properties.getProperty("insert"));
				
				System.out.println("Enter the Song id: ");
				id=scanner.nextInt();
				preparedStatement.setInt(1, id);
				
				System.out.println("Enter the Song Name: ");
				name=scanner.next();
				preparedStatement.setString(2, name);		
				
				System.out.println("Enter the Song SingerName: ");
				singer=scanner.next();
				preparedStatement.setString(3, singer);
				
				System.out.println("Enter the Song duration: ");
				duration=scanner.nextDouble();
				preparedStatement.setDouble(4, duration);
				
				System.out.println("Enter the Song movie_album: ");
				movie_album=scanner.next();
				preparedStatement.setString(5, movie_album);
				
				System.out.println("Enter the Song lyricist: ");
				lyricist=scanner.next();
				preparedStatement.setString(6, lyricist);
				
				System.out.println("Enter the Song composer: ");
				composer=scanner.next();
				preparedStatement.setString(7, composer);
				
				result = preparedStatement.executeUpdate();
				if(result != 0) {
					System.out.println(name + "Succesfully added to the play list");
				}
				
				
			} catch (SQLException e) {
				e.printStackTrace();
				
			}
			//closeConnection();
		}
	
		
		try {
			preparedStatement = connection.prepareStatement(properties.getProperty("query"));
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1) + " | " 
						           + resultSet.getString(2) + " | " 
				                   + resultSet.getString(3) + " | "
				                   + resultSet.getDouble(4) + " | " 
				                   + resultSet.getString(5) + " | "
			           	           + resultSet.getString(6) + " | "
				                   + resultSet.getString(7));
			}
			System.out.println("-------------------------------------------------------------------------------------------");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
		
		public void removeSong() {
			try {
				System.out.println("-------------------------------------------------------------------------------------------");
				preparedStatement = connection.prepareStatement(properties.getProperty("query"));
				resultSet = preparedStatement.executeQuery();
				while (resultSet.next()) {
					System.out.println(resultSet.getInt(1) + " | " 
							           + resultSet.getString(2) + " | " 
					                   + resultSet.getString(3) + " | "
					                   + resultSet.getDouble(4) + " | " 
					                   + resultSet.getString(5) + " | "
				           	           + resultSet.getString(6) + " | "
					                   + resultSet.getString(7));
				}
				
				System.out.println("-------------------------------------------------------------------------------------------");
				preparedStatement = connection.prepareStatement(properties.getProperty("delete"));
				
				System.out.println("Enter the ID of song which you to remove");
				id=scanner.nextInt();
				preparedStatement.setInt(1,id);
				result = preparedStatement.executeUpdate();
				System.out.println(result + " song removed");
				System.out.println("-------------------------------------------------------------------------------------------");
				
				
				System.out.println("Updated Table \n");
				preparedStatement = connection.prepareStatement(properties.getProperty("query"));
				resultSet = preparedStatement.executeQuery();
				while (resultSet.next()) {
					System.out.println(resultSet.getInt(1) + " | " 
							           + resultSet.getString(2) + " | " 
					                   + resultSet.getString(3) + " | "
					                   + resultSet.getDouble(4) + " | " 
					                   + resultSet.getString(5) + " | "
				           	           + resultSet.getString(6) + " | "
					                   + resultSet.getString(7));
				}
				System.out.println("-------------------------------------------------------------------------------------------");
								
            }catch (SQLException e) {
    			e.printStackTrace();
    		}	
		}
		
		
		public void updateSong() {
			try {
				preparedStatement = connection.prepareStatement(properties.getProperty("query"));
				resultSet = preparedStatement.executeQuery();
				while (resultSet.next()) {
					System.out.println(resultSet.getInt(1) + " | " 
							           + resultSet.getString(2) + " | " 
					                   + resultSet.getString(3) + " | "
					                   + resultSet.getDouble(4) + " | " 
					                   + resultSet.getString(5) + " | "
				           	           + resultSet.getString(6) + " | "
					                   + resultSet.getString(7));
				}
				System.out.println("-------------------------------------------------------------------------------------------");
				
								
				System.out.println("Please select what do you want to update. \n1.Id \n2.SongName \n3.Singer"
						+ "\n4.duration \n5.movie_album \n6.Lyricist \n7.composer");
				
				int updateChoice = scanner.nextInt();
				switch (updateChoice) {
				case 1:
					query = "update songs set id = ? where id = ?";
					preparedStatement = connection.prepareStatement(query);
					System.out.println("Enter new Id ");
					id=scanner.nextInt();
					preparedStatement.setInt(1, id);
					System.out.println("Enter ID where you want to update the Id");
					name=scanner.next();
					preparedStatement.setString(2, name);
					result = preparedStatement.executeUpdate();
					System.out.println(result + " song details updated");
					break;
				case 2:
					query = "update songs set name = ? where id = ?";
					preparedStatement = connection.prepareStatement(query);
					System.out.println("Enter new songName name");
					preparedStatement.setString(1, scanner.next());
					System.out.println("Enter ID where you want to update the songName name");
					preparedStatement.setInt(2, scanner.nextInt());
					result = preparedStatement.executeUpdate();
					System.out.println(result + " song details updated");
					break;
				case 3:
					query = "update songs set singer = ? where id = ?";
					preparedStatement = connection.prepareStatement(query);
					System.out.println("Enter new singer name");
					preparedStatement.setString(1, scanner.next());
					System.out.println("Enter ID where you want to update the singer name");
					preparedStatement.setInt(2, scanner.nextInt());
					result = preparedStatement.executeUpdate();
					System.out.println(result + " song details updated");
					break;
				case 4:
					query = "update songs set duration = ? where id = ?";
					preparedStatement = connection.prepareStatement(query);
					System.out.println("Enter new duration");
					preparedStatement.setDouble(1, scanner.nextDouble());
					System.out.println("Enter ID where you want to update duration");
					preparedStatement.setInt(2, scanner.nextInt());
					result = preparedStatement.executeUpdate();
					System.out.println(result+ " song details updated");
					break;
				case 5:
					query = "update songs set movie_album = ? where id = ?";
					preparedStatement = connection.prepareStatement(query);
					System.out.println("Enter new movie_album name");
					preparedStatement.setString(1, scanner.next());
					System.out.println("Enter ID where you want to update the movie_album name");
					preparedStatement.setInt(2, scanner.nextInt());
					result = preparedStatement.executeUpdate();
					System.out.println(result + " song details updated");
					break;
				case 6:
					query = "update songs set lycricist = ? where id = ?";
					preparedStatement = connection.prepareStatement(query);
					System.out.println("Enter new lycricist name");
					preparedStatement.setString(1, scanner.next());
					System.out.println("Enter ID where you want to update the lycricist name");
					preparedStatement.setInt(2, scanner.nextInt());
					result = preparedStatement.executeUpdate();
					System.out.println(result + " song details updated");
					break;
				case 7:
					query = "update songs set composer = ? where id = ?";
					preparedStatement = connection.prepareStatement(query);
					System.out.println("Enter new composer name");
					preparedStatement.setString(1, scanner.next());
					System.out.println("Enter ID where you want to update the composer name");
					preparedStatement.setInt(2, scanner.nextInt());
					result = preparedStatement.executeUpdate();
					System.out.println(result + " song details updated");
					break;
				default:
					System.out.println("Invalid Inupt...Please provide a valid Input");
					break;
				}
				
				System.out.println("-------------------------------------------------------------------------------------------");
				System.out.println("Updated Table \n");
					
				preparedStatement = connection.prepareStatement(properties.getProperty("query"));
				resultSet = preparedStatement.executeQuery();
				while (resultSet.next()) {
					System.out.println(resultSet.getInt(1) + " | " 
							           + resultSet.getString(2) + " | " 
					                   + resultSet.getString(3) + " | "
					                   + resultSet.getDouble(4) + " | " 
					                   + resultSet.getString(5) + " | "
				           	           + resultSet.getString(6) + " | "
					                   + resultSet.getString(7));
				}
				System.out.println("-------------------------------------------------------------------------------------------");
									
				
				
            } catch (SQLException e) {
    			e.printStackTrace();
    		}
		}
		
    }

