package final1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
****************************************
Attention please !
Doctor, we were missing in that class working t"Stream-output-file" only on the file, and instead it was done on a "console screen", just like exactly "Stream-out-file", and unfortunately it was not completed and we had to finish it temporarily in this way until the discussion.
I hope for your approval..
****************************************
*/

public class Rectangle1 {
    /**
     * A variable that holds the file
     */
    private static Scanner file;

    /**
     * A variable that holds the skipList
     */
    private static skiplist<String, Rectangle> skipList =
        new skiplist<String, Rectangle>();

    /**
     * constructor of the class
     */
    public Rectangle1() {
        skipList = new skiplist<String, Rectangle>();
    }

    /**
     * The main method of the project
     * @param args the input file
     */
    public static void main(String[] args) {
        ProjectRunner projectRunner = new ProjectRunner();
        try {
            file = new Scanner(new File("P1test2.txt"));
            while (file.hasNextLine()) {
                String com = file.nextLine();
                projectRunner.run(com);
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * Getter method of the skipList
     * @return SkipList
     */
    public skiplist<String, Rectangle> getSkipList() {
        return skipList;
    }
}
