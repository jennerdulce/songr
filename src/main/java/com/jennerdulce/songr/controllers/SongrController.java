package com.jennerdulce.songr.controllers;

import com.jennerdulce.songr.models.Album;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class SongrController {

    @GetMapping("/albums")
    public String albumPage(Model m){
        Album acidRap = new Album("Acid Rap", "Chance The Rapper", 14, 3234, "images/AcidRap.jpeg");
        Album confessions = new Album("Confessions", "Usher", 19, 3630, "images/Confessions.jpg");
        Album enema = new Album("Enema of The State", "Blink-182", 12, 2117, "images/EnemaOfTheState.jpeg");
        ArrayList<Album> albums = new ArrayList<>();
        albums.add(acidRap);
        albums.add(confessions);
        albums.add(enema);
        m.addAttribute("albums", albums);
        return "pages/albums";
    }
}
