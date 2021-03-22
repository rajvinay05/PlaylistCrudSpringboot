package com.example.playlist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.playlist.domain.Playlist;
import com.example.playlist.repository.PlaylistRepository;

@Service
public class PlaylistServices {

	
	
	@Autowired
	PlaylistRepository playlistRepo;
	
	public List<Playlist> listAll(){
		return playlistRepo.findAll();
	}
	
	public Playlist get(Long id) {
		return playlistRepo.findById(id).get();
	}
	
	public void save(Playlist playlist) {
		playlistRepo.save(playlist);
	}
	
	public void delete(Long id) {
		playlistRepo.deleteById(id);
	}
}
