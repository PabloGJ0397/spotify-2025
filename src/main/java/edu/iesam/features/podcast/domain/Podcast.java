package edu.iesam.features.podcast.domain;

public class Podcast {
    private String id;
    private String tittle;
    private String author;
    private String duration;

    public Podcast(String id, String tittle, String author, String duration) {
        this.id = id;
        this.tittle = tittle;
        this.author = author;
        this.duration = duration;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
    @Override
    public String toString() {
        return String.format("ID: %s   | Tittle: $s  | Author: %s", id, tittle, author);
    }
}
