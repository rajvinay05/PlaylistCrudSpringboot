package com.example.playlist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.playlist.domain.Song;
import com.example.playlist.repository.SongRepository;

@Service
public class SongServices {

	@Autowired
	SongRepository songRepo;
	
	public List<Song> listAll(){
		return songRepo.findAll();
	}
	
	public Song get(Long id) {
		return songRepo.findById(id).get();
	}
	
	public void save(Song song) {
		songRepo.save(song);
	}
	
	public void delete(int id) {
		songRepo.deleteById((long) id);
	}
}
