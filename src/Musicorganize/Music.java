package Musicorganize;

/**
 * this class represents a music with the address of it ,the name of the singer and the year its published
 */
public class Music {
    private String file;
    private String singer;
    private String year;

    /**
     * this constructs a music
     * @param file address of the music
     * @param singer the name of the singer
     * @param year the year the music is published
     */
    public Music(String file,String singer,String year){
        this.file=file;
        this.singer=singer;
        this.year=year;
    }

    /**
     * gsets the the file field
     * @param file a string that is the address of music
     */
    public Music (String file){
        this.file=file;
    }

    /**
     * gets the file
     * @return a string that is the file
     */
    public String getFile() {
        return file;
    }

    /**
     * gets the singer
     * @return a string that is the name of the singer
     */
    public String getSinger() {
        return singer;
    }

    /**
     * gets the year
     * @return a string that is the year that the song is published
     */
    public String getYear() {
        return year;
    }


}
