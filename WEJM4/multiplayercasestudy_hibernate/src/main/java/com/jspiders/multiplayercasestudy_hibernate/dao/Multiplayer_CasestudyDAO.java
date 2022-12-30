package com.jspiders.multiplayercasestudy_hibernate.dao;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jspiders.multiplayercasestudy_hibernate.dto.Multiplayer_CasestudyDTO;

public class Multiplayer_CasestudyDAO {
	
	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;
	private static Scanner sc = new Scanner(System.in);
	private static String jpql;
	private static Query query;
	private static int result;
	static boolean loop = true;
	
   private static void openConnections() 
    {
		factory = Persistence.createEntityManagerFactory("MultiplayerHibernate");
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();
	}

   
	private static void closeConnections()
	{
		if (factory != null) {
			factory.close();
		}
		if (manager != null) {
			manager.close();
		}
		if (transaction.isActive()) {
			transaction.rollback();
		}
	}


	public static void main(String[] args) {
       
	   	 openConnections();
		 transaction.begin();

		System.out.println("*****WELCOME TO THE MUSIC PLAYER*****");

		System.out.println("Please ADD some Songs to enjoy the Music Player");
		
		while (loop) {
			System.out.println(                                                             );
			System.out.println("Please select a option from the menu given below."
					+ "\n1.Play Songs \n2.Add/Remove Songs \n3.Edit Song  \n4.Exit");

			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Please select from the given option \n1.Choose Song to Play \n2.Play All Songs"
						+ "\n3.Play Randon Song");
				int choice1 = sc.nextInt();

				switch (choice1) {
				case 1:
					try {
						chooseSongToPlay();
					} catch (Exception e1) {
						e1.printStackTrace();
					}
					break;
				case 2:
					playAllSong();

					break;
				case 3:
					playRandomSong();
					break;
				default:
					System.out.println("Invalid Input. \nPlease provide a Valid Input");
					break;
				}
				break;

			case 2:
				System.out.println("Please select from the given option \n1.Add Songs \n2.Remove Song");
				int choice2 = sc.nextInt();

				switch (choice2) {
				case 1:
					addSongs();
					break;
				case 2:
					removeSong();
					break;
				default:
					System.out.println("Invalid Input. \nPlease provide a Valid Input");
					break;
				}
				break;

			case 3:
				System.out.println("Please select from the given option \n1.Update Song");
				int choice3 = sc.nextInt();

				switch (choice3) {
				case 1:
					updateSongDetails();
					break;

				default:
					System.out.println("Invalid Input. \nPlease provide a Valid Input");
					break;
				}
				break;

			case 4:
				loop = false;
				System.out.println("See You Soon");
				break;
			default:
				
				System.out.println("Invalid Input. \nPlease provide a Valid Input");
				loop = false;
				break;
			}
		}

	}

	private static void addSongs() {
		System.out.println("Please enter the number of songs you want of ADD");
		int noOfSongs = sc.nextInt();
		
        openConnections();
		transaction.begin();

		for (int i = 0; i < noOfSongs; i++) {

			Multiplayer_CasestudyDTO song = new Multiplayer_CasestudyDTO();

//			System.out.println("Enter Song ID");
//			song.setId(sc.nextInt());
			
			System.out.println("Enter Song Name");
			song.setSongName(sc.next());
			
			System.out.println("Enter Singer Name");
			song.setSinger(sc.next());
			
			System.out.println("Enter Movie Name");
			song.setMovieAlbum(sc.next());
			
			System.out.println("Enter Lyricist Name");
			song.setLyricist(sc.next());
			
			System.out.println("Enter duration");
			song.setDuration(sc.nextDouble());
			
			manager.persist(song);

			
			System.out.println(song.toString());
			System.out.println("--------------------------------------------------");
		}

		transaction.commit();
		closeConnections();

	}

	
	private static void removeSong() {
		openConnections();
		transaction.begin();

		System.out.println("Enter the ID of song  you want to remove");
		    jpql = "delete from  Multiplayer_CasestudyDTO where id=1";
	        query = manager.createQuery(jpql);
		    result= query.executeUpdate();
		    System.out.println(result + "row(s) deleted");
	   
		transaction.commit();
		closeConnections();
		
	}

	private static void updateSongDetails() {
		openConnections();
		transaction.begin();
		
	      jpql = "update Multiplayer_CasestudyDTO set singer ='Pritam' where id = 3";
	      query = manager.createQuery(jpql);
	      result= query.executeUpdate();
		  System.out.println(result + "row(s) deleted");
		
		transaction.commit();
		closeConnections();
	}
	
	
	private static void playAllSong() {
		openConnections();
		transaction.begin();
		
		    jpql = " from Multiplayer_CasestudyDTO";
			query = manager.createQuery(jpql);
			List<Multiplayer_CasestudyDTO> resultList = query.getResultList();			
			for (Multiplayer_CasestudyDTO song : resultList) {
				System.out.println(song +"is now playing");
			}

		transaction.commit();
		closeConnections();	
	}
	
	
	private static void chooseSongToPlay() {
		openConnections();
		transaction.begin();

		  System.out.println("Please enter the id of song you want to Play.");
		    jpql = "from Multiplayer_CasestudyDTO";
			Query query = manager.createQuery(jpql);
            List<Multiplayer_CasestudyDTO> resultList = query.getResultList();
			
			int noOfSongs = sc.nextInt();
			System.out.println(resultList.get(noOfSongs - 1).getSongName() + " is now playing...");

	
		transaction.commit();
		closeConnections();
	}
	
	
	private static void playRandomSong() {
		openConnections();
		transaction.begin();
			
		    jpql = "from Multiplayer_CasestudyDTO order by rand()";
		    query = manager.createQuery(jpql);
		    List<Multiplayer_CasestudyDTO> resultList = query.getResultList();
			
		    int randomSong = (int) Math.random() * 10;
			System.out.println(resultList.get(randomSong).getSongName() + " is now playing...");
		
		transaction.commit();
		closeConnections();
		
	}
}

