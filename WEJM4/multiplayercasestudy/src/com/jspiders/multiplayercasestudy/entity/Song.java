package com.jspiders.multiplayercasestudy.entity;

public class Song {
	     private int id;
	     private String songName;
	     private String movieAlbum;
	     private String singer;
	     private String lyricist;
	     private double duration;
	     
	     //get set method
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getSongName() {
			return songName;
		}
		public void setSongName(String songName) {
			this.songName = songName;
		}
		public String getMovieAlbum() {
			return movieAlbum;
		}
		public void setMovieAlbum(String movieAlbum) {
			this.movieAlbum = movieAlbum;
		}
		public String getSinger() {
			return singer;
		}
		public void setSinger(String singer) {
			this.singer = singer;
		}
		public String getLyricist() {
			return lyricist;
		}
		public void setLyricist(String lyricist) {
			this.lyricist = lyricist;
		}
		public double getDuration() {
			return duration;
		}
		public void setDuration(double duration) {
			this.duration = duration;
		}
	     
	}


