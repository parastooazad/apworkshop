package ceit.aut.ac.ir.utils;

import ceit.aut.ac.ir.model.Note;

import java.io.*;
import java.util.Date;

public class FileUtils {

    private static final String NOTES_PATH = "./notes2/";

    //It's a static initializer. It's executed when the class is loaded.
    //It's similar to constructor
    static {
        boolean isSuccessful = new File(NOTES_PATH).mkdirs();
        System.out.println("Creating " + NOTES_PATH + " directory is successful: " + isSuccessful);
    }

    public static File[] getFilesInDirectory() {
        return new File(NOTES_PATH).listFiles();
    }


    public static String fileReader(File file) {
        String s = "";
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader br = new BufferedReader(fileReader);
            while (br.ready())
                s += br.readLine() + "/n";
            fileReader.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return s;
    }

    public static void fileWriter(String content) {
        //TODO: write content on file
        String fileName = getProperFileName(content);
        try {
            File file = new File(fileName);
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            fw.write(content);
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    //TODO: Phase1: define method here for reading file with InputStream
    public String readStream(File file) {
        String s = "";
        try {
            FileInputStream fis = new FileInputStream(file);
            int i;
            while ((i = fis.read()) != -1)
                s += (char) i;
            fis.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return s;
    }

    //TODO: Phase1: define method here for writing file with OutputStream
    public void WriteStream(String content) {

        try {
            File file = new File(getProperFileName(content));
            FileOutputStream fos = new FileOutputStream(file);
            byte[] bytes = content.getBytes();
            fos.write(bytes);
            fos.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private static String getTitle(String content) {
        int loc = content.indexOf("\n");
        if (loc != -1) {
            return content.substring(0, loc);
        }
        if (!content.isEmpty()) {
            return content;
        }
        return System.currentTimeMillis() + "_new file";
    }

    //TODO: Phase2: proper methods for handling serialization
    public static void writeNote(String content){
        try {
            File file=new File(getProperFileName(content));
            Note note=new Note(getTitle(content), content, new Date().toString());
            FileOutputStream fos=new FileOutputStream(file);
            ObjectOutputStream oops=new ObjectOutputStream(fos);
            oops.writeObject(note);
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
    public static String  ReadNote(File file){
        try {
            FileInputStream fis=new FileInputStream(file);
            ObjectInputStream ois=new ObjectInputStream(fis);
            Note note= (Note) ois.readObject();
            return note.getContent();
        }
        catch (Exception e){
            System.out.println(e);
        }
        return "";
    }

    private static String getProperFileName(String content) {
        return NOTES_PATH + getTitle(content) + ".txt";
    }
    public static Note getNote(File file){
        try {
            FileInputStream fis=new FileInputStream(file);
            ObjectInputStream os=new ObjectInputStream(fis);
            Note note= (Note) os.readObject();
            return note;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
