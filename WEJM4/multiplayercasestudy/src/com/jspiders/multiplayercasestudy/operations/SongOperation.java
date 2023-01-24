package com.jspiders.multiplayercasestudy.operations;

import java.util.ArrayList;
import java.util.Scanner;

import com.jspiders.multiplayercasestudy.entity.Song;

public class SongOperation {
	static Song song = new Song();
	Scanner sc = new Scanner(System.in);
	ArrayList<Song> songsList = new ArrayList();

	public void chooseSongToPlay() {

		System.out.println("Please enter the id of song you want to Play.");
		System.out.println("--------------------------------------------");
		for (Song song : songsList) {
			System.out.println(song);
		}
		System.out.println("--------------------------------------------");
		int choice = sc.nextInt();
		System.out.println(songsList.get(choice - 1).getSongName() + " is now playing...");

	}

	public void playAllSongs() {
		for (int i = 0; i < songsList.size(); i++) {
			System.out.println(songsList.get(i).getSongName() + " is now playing...");
		}

	}

	public void playRandomSong() {

		int randomSong = (int) Math.random() * 10;
		System.out.println(songsList.get(randomSong).getSongName() + " is now playing...");
	}

	public void addSongs() {

		System.out.println("Please enter how many songs you want to ADD.");
		int choice = sc.nextInt();
		System.out.println("Please enter the details of songs you want to ADD.");
		for (int i = 0; i < choice; i++) {
			Song song = new Song();

			System.out.println("Enter the song id: ");
			int id = sc.nextInt();
			song.setId(id);

			System.out.println("Enter the song name: ");
			String songName = sc.next();
			song.setSongName(songName);
			sc.nextLine();

			System.out.println("Enter the song movieAlbum: ");
			String movie = sc.nextLine();
			song.setMovieAlbum(movie);
			
			System.out.println("Enter the song singer name: ");
			String singer = sc.nextLine();
			song.setSinger(singer);

			System.out.println("Enter the song lycricist: ");
			String writer = sc.nextLine();
			song.setLyricist(writer);

			System.out.println("Enter the song length: ");
			double duration = sc.nextDouble();
			song.setDuration(duration);

			songsList.add(song);

			System.out.println("Songs added \n" + songsList.get(i));
		}
		System.out.println("--------------------------------------------");
		for (Song song : songsList) {
			System.out.println(song);
		}
		System.out.println("--------------------------------------------");
	}

	public void removeSong() {

		System.out.println("Please enter the id of songs you want to Remove.");

		int removedSong = sc.nextInt();
		System.out.println(songsList.remove(removedSong - 1).getSongName() + " is removed.");

	}

	public void updateSong() {
		System.out.println("Please select the id of song you want to update");
		System.out.println("--------------------------------------------");
		for (Song song : songsList) {
			System.out.println(song);
		}
		System.out.println("--------------------------------------------");
		int updateId = sc.nextInt();

		System.out.println("Please select what do you want to update. \n1.Id \n2.SongName \n3.SingerName"
				+ "\n4.MovieName \n5.Composer \n6.Lyricist \n7.Length");
		int choice1 = sc.nextInt();
		switch (choice1) {
		case 1:
			System.out.println("Enter the updated ID");
			int updatedId = sc.nextInt();
			songsList.get(updateId - 1).setId(updatedId);
			System.out.println("Details Updated");
			break;
		case 2:
			System.out.println("Enter the updated Song Name");
			sc.nextLine();
			songsList.get(updateId - 1).setSongName(sc.nextLine());
			System.out.println("Details Updated");
			break;
		case 3:
			System.out.println("Enter the updated Singer Name");
			sc.nextLine();
			String updatedSinger = sc.nextLine();
			songsList.get(updateId - 1).setSinger(updatedSinger);
			System.out.println("Details Updated");
			break;
		case 4:
			System.out.println("Enter the updated Movie Name");
			sc.nextLine();
			songsList.get(updateId - 1).setMovieAlbum(sc.nextLine());
			System.out.println("Details Updated");
			break;
		
		case 5:
			System.out.println("Enter the updated Lyricist");
			sc.nextLine();
			songsList.get(updateId - 1).setLyricist(sc.nextLine());
			System.out.println("Details Updated");
			break;
		case 6:
			System.out.println("Enter the updated Length");
			songsList.get(updateId - 1).setDuration(sc.nextDouble());
			System.out.println("Details Updated");
			break;
		default:
			System.out.println("Invalid Input. \nPlease provide a Valid Input");
			break;
		}
	}

}

