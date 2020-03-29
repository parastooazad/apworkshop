package Musicorganize;

import java.util.ArrayList;


/**
 * A class to hold details of audio files.
 *
 * @author David J. Barnes and Michael Kölling
 * @version 2011.07.31
 */
public class MusicCollection
{
    // An ArrayList for stroring the songs of Music class
    private ArrayList<Music> songs;
    // A player for the music files.
    private MusicPlayer player;
    //an ArrayList of favorite songs
    private ArrayList<Music> favorites;

    /**
     * Create a MusicCollection
     */
    public MusicCollection()
    {
        songs=new ArrayList<Music>();
        player=new MusicPlayer();
        favorites=new ArrayList<Music>();
    }

    /**
     * this gets the ArrayList of songs
     * @return the array list files
     */
    public ArrayList < Music> getFiles() {
        return songs;
    }

    /**
     * this return the player
     * @return player
     */
    public MusicPlayer getPlayer() {
        return player;
    }

    /**
     * Add a file to the collection.
     * @param musicToAdd The file to be added.
     */
    public void addFile(Music musicToAdd)
    {

         songs.add(musicToAdd);
        System.out.println("your song is added successfully");
    }

    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return songs.size();
    }

    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        System.out.println("\nthe name of the file" + songs.get(index).getFile());
        System.out.println("\n the name of the singer" + songs.get(index).getSinger());
        System.out.println("\n the yea that the song is published" + songs.get(index).getYear());

    }

    /**
     * Show a list of all the files in the collection.
     */
    public void listAllFiles()
    {
        for(Music music :songs){
            System.out.println("\n the name of the file" + music.getFile());
            System.out.println("\n the name of the singer" + music.getSinger());
            System.out.println("\n the year that the song is published" + music.getYear());
        }
    }

    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {

        songs.remove(index);
        System.out.println("the song is now removed from the list");
    }

    /**
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index)
    {
        player.startPlaying(songs.get(index).getFile());
        System.out.println("the song is now playing");

    }

    /**
     * this method gets a file and ads it tp the list of favorite songs
     * @param file to be added
     */
    public void addFavoriteMusic(String file){
        for (Music music: songs){
            if(music.getFile().equals(file)){
                favorites.add(music);
                System.out.println("the song is added to your favorite songs");
                return;
            }
        }

    }

    /**
     * this gets a file and removes it from the list of favorite songs
     * @param file file to be removed
     */
    public void removeFavoriteMusic(String file){
        for(Music music : songs){
            if(music.getFile().equals(file)){
                favorites.remove(music);
                System.out.println("the song is now removed from favorite list");
                return;
            }
        }
    }

    /**
     * this method prints the list of favorite songs
     */
    public void printFavoriteSongs(){
        for(Music music : songs){
            System.out.println("\n the name of the song :" + music.getFile());
            System.out.println("\n the name of the singer : " + music.getSinger());
            System.out.println("\n the year that the song is published" + music.getYear());
        }
    }

    /**
     * this method gets a file and check if the name of the singer or the file address are the same it prints the information of that song
     * @param string the name of the singer or the address file
     */

    public void searchCollections(String string){
        for  (Music music : songs){
            if(music.getSinger().equals(string) || music.getFile().equals(string)){
                System.out.println("\n The song is found ");
                System.out.println("the name and the singer and the year of the song is as followed" + music.getFile() + music.getSinger() + music.getYear());
                return ;
            }
        }
    }

    /**
     * Stop the player.
     */
    public void stopPlaying()
    {
        player.stop();
        System.out.println("the song is now stopped");
    }


    /**
     * Determine whether the given index is valid for the collection.
     * Print an error message if it is not.
     * @param index The index to be checked.
     * @return true if the index is valid, false otherwise.
     */
    private boolean validIndex(int index) {
        if (index >= 0 && index < songs.size())
            return true;
        else
            return false;
        // The return value.
        // Set according to whether the index is valid or not.
       }
    }
