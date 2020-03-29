package Musicorganize;

/**
 * this class is for testing methods and other parts of other classes
 * @author parastooazad
 */
public class Main {
    public static void main(String[] args){
        /**
         * creating 4 objects of class music collection for 4 categories of music
         */
        MusicCollection pop=new MusicCollection();
        MusicCollection jazz = new MusicCollection();
        MusicCollection rock = new MusicCollection();
        MusicCollection country = new MusicCollection();

        /**
         * making 6 objects of class music to add to our categories
         */
        Music music1=new Music("dont start now  " ,"dua lipa" , "2019");
        Music music2=new Music("riptide","vance joy","2018");
        Music music3=new Music("wow","post malone","2020");
        Music music4=new Music("7 rings","ariana grande","2019");
        Music music5=new Music("supergirl","anna naklab","2017");
        Music music6=new Music("diamonds","rihanna","2014");
        Music music7=new Music("by your side","jonas blue","2017");
        Music music8=new Music("sorry","justine bieber","2016");
        /**
         * adding file to pop collection
         */
        pop.addFile(music1);
        pop.addFile(music7);
        /**
         * adding file to jazz collection
         */
        jazz.addFile(music2);
        jazz.addFile(music3);
        /**
         * adding file to rock collection
         */
        rock.addFile(music4);
        rock.addFile(music5);
        /**
         * adding file to country collection
         */
        country.addFile(music6);
        country.addFile(music8);
        /**
         * printing list of files in pop collection
         * this list contains the address file,name of singer and the that song is published
         */
        pop.listAllFiles();

        /**
         * adding one of the pop songs to list of favorite songs by the address file
         * for example here wa want to add music1 to favorite collections
         */
        pop.addFavoriteMusic(music1.getFile());
        pop.addFavoriteMusic(music2.getFile());

        /**
         * printing list of favorite songs
         */
        pop.printFavoriteSongs();
        /**
         * removing music1 from favorite songs of pop category
         */
        pop.removeFavoriteMusic(music1.getFile());
        /**
         * playing music4
         */
        rock.startPlaying(1);
        /**
         * searching for music4 by its name
         */
        jazz.searchCollections(music3.getFile());
    }
}
