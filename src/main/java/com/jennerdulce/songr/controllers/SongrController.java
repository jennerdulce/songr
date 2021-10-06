package com.jennerdulce.songr.controllers;

import com.jennerdulce.songr.models.Album;
import com.jennerdulce.songr.repositories.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SongrController {

    // Wires up repository
    @Autowired
    AlbumRepository albumRepository;

    @GetMapping("/albums")
    public String albumPage(Model m){
//        ArrayList<Album> albums = new ArrayList<>();
//        Album acidRap = new Album("Acid Rap", "Chance The Rapper", 14, 3234, "images/AcidRap.jpeg");
//        Album confessions = new Album("Confessions", "Usher", 19, 3630, "images/Confessions.jpg");
//        Album enema = new Album("Enema of The State", "Blink-182", 12, 2117, "images/EnemaOfTheState.jpeg");
//        albums.add(acidRap);
//        albums.add(confessions);
//        albums.add(enema);
//        albumRepository.save(acidRap);
//        albumRepository.save(confessions);
//        albumRepository.save(enema);
//        albumRepository.saveAll(albums);
//        m.addAttribute("albums", albums);

        // Retrieves items from database
        List<Album> dbAlbums = albumRepository.findAll();
        m.addAttribute("albums", dbAlbums);

//        Album album = albumRepository.findByArtist("Usher");
        return "pages/albums";
    }

    @PostMapping("/")
    public RedirectView createAlbum(String title, String artist, int songCount, int lengthInS, String imageURL){
        Album newAlbum = new Album(title, artist, songCount, lengthInS, imageURL);
        albumRepository.save(newAlbum);
        return new RedirectView("/");
    }
}
