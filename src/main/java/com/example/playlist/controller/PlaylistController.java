package com.example.playlist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.playlist.service.PlaylistServices;

@RestController
public class PlaylistController {

	private PlaylistServices playlistService;

	@Autowired
	public PlaylistController(PlaylistServices playlistService) {
		this.playlistService = playlistService;
	}
	
	@RequestMapping("/playlist")
	public List home(Model model){
		model.addAttribute("playlist", playlistService.listAll());
		return playlistService.listAll();
	}
	
//	@RequestMapping(path = "/")
//	public String home(){
////		model.addAttribute("playlist", songServive.listAll());
//		return "index";
//	}
	
	
}
