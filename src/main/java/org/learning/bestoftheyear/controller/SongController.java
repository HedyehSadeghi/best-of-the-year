package org.learning.bestoftheyear.controller;

import org.learning.bestoftheyear.model.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/songs")
public class SongController {

    @GetMapping
    public String songsList(Model model) {
        List<Song> songs = getSongs();


        model.addAttribute("songs", songs);
        return "song-list";

    }

    @GetMapping("/{id}")
    public String songDetail(@PathVariable String id, Model model) {
        Song song = null;
        for (Song s : getSongs()) {
            if (id.equals(s.getId())) {
                song = s;
                break;
            }
        }
        model.addAttribute("song", song);
        return "song-details";
    }

    private List<Song> getSongs() {
        List<Song> songs = new ArrayList<>();

        songs.add(new Song("123", "Take Me Out", "Franz Ferdinand"));
        songs.add(new Song("456", "Bohemian Rhapsody", "Queen"));
        songs.add(new Song("789", "Happy Christmas", "unknown"));

        return songs;

    }


}
