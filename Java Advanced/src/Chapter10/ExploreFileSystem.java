package Chapter10;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class ExploreFileSystem {
    public static void main(String[] args) {
        FileSystem fs = FileSystems.getDefault(); // Where your project is currently located
        Path path = fs.getPath("C:\\Users\\Luvuyo Sizane\\Documents\\JAVA ADVANCED\\java-advanced\\README.md");
        System.out.println("File Name : "+path.getFileName());
        System.out.println("Root : "+path.getRoot());
        System.out.println("Parent : "+path.getParent());
        System.out.println("Name Count : "+path.getNameCount());//How many names make up the path
        System.out.println("FS : "+path.getFileSystem());

        System.out.println("=============================");
        System.out.println("Absolute Path : " + path.isAbsolute());
    }
}
