package edu.iesam.features.songsrepeated.domain;

public class Song2 {
    private String id;
    private String title;
    private String author;
    private String duration;

    public Song2(String id, String title, String author, String duration) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.duration = duration;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
    public String toString() {
        return String.format("id: %s | title: %s | author: %s | duration: %s", id, title, author, duration);
    }
}
