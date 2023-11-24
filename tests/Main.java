import example.Test;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException {
        Test.helloWorld();
        ClassLoader loader = Main.class.getClassLoader();
        File example1 = new File(Objects.requireNonNull(loader.getResource("example.txt")).file);
        File example2 = new File(Objects.requireNonNull(loader.getResource("example-test.txt")).file);
        System.out.println(FileUtils.readFileToString(example1));
        System.out.println(FileUtils.readFileToString(example2));
    }
}