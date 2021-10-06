package com.jennerdulce.songr.repositories;

import com.jennerdulce.songr.models.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumRepository extends JpaRepository<Album, Long> {
    public Album findByArtist(String artist);
}
