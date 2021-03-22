package com.example.playlist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.playlist.domain.Song;
import com.example.playlist.service.SongServices;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping(value="/api/")
public class SongController {

	private SongServices songServive;
	private Song song;

	@Autowired
	public SongController(SongServices songServive) {
		this.songServive = songServive;
	}
	
	@GetMapping("song")
	public List<Song> getSongList(){
		
		return songServive.listAll();
	}
	
	@RequestMapping(path = "addSong")
	public void addSong(){
		songServive.save(song);
	}
	
	@RequestMapping(value = "save", method = RequestMethod.POST)
	public void saveProduct(@ModelAttribute("product") Song song) {
	    songServive.save(song);
	     
	}
	
	@RequestMapping("delete/{id}")
	public void deleteSong(@PathVariable(name = "id") int id) {
	    songServive.delete(id);
	}
	
}
