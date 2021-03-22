package com.example.playlist.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
public class Song {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String songName;
	private String singer;
	
	
//	@ManyToMany( mappedBy = "song" )
//	private List<Playlist> playlist;
	
	
	
	
	
	public void setId(int id) {
		this.id = id;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public int getId() {
		return id;
	}
//	public void setId(int id) {
//		this.id = id;
//	}
	
	public String getSongName() {
		return songName;
	}
//	public void setSongName(String songName) {
//		this.songName = songName;
//	}
	
	public String getSinger() {
		return singer;
	}
//	public void setSinger(String singer) {
//		this.singer = singer;
//	}
	
	
	
}
