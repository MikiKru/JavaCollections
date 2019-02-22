package model;

import java.time.LocalDateTime;

public class Message {
    String content;
    String author;
    LocalDateTime dateTime;

    public Message(String content, String author) {
        this.content = content;
        this.author = author;
        this.dateTime = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Wiadomość od: " + author + " odebrana : " + dateTime + " o treści: " + content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getContent() {
        return content;
    }

    public String getAuthor() {
        return author;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }
}
