/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Model;

/**
 *
 * @author sumayyahhusain
 */
public class Game {
    
    private String gameTitle;
    private String genre;
    private String platform;

    public Game() {
    }

    public Game(String gameTitle, String genre, String platform) {
        this.gameTitle = gameTitle;
        this.genre = genre;
        this.platform = platform;
    }

    public String getGameTitle() {
        return gameTitle;
    }

    public void setGameTitle(String gameTitle) {
        this.gameTitle = gameTitle;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }
}
