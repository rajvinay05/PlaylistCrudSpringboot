package com.example.playlist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.playlist.domain.Song;

@Repository
public interface SongRepository extends JpaRepository<Song, Long> {

}
