import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Problem09 {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.print("Enter the path to your songtext file > ");
        final String songTextPath = sc.nextLine();

        float timeBetween = 0;
        while (true) {
            try {
                System.out.print("Enter the amount of time between lines to be printed in s > ");
                String input = sc.nextLine();
                timeBetween = Float.parseFloat(input);
                break;
            } catch (Exception e) {

            }
        }

        sc.close();

        SongInterpreter si = new SongInterpreter(songTextPath);
        si.loadFile();
        try {
            si.printsong((int) (timeBetween * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class SongInterpreter {
    private final String filename;
    private Scanner fileScanner;

    public SongInterpreter(String filename) {
        this.filename = filename;
    }

    private boolean loadedScanner = false;

    public boolean loadFile() {
        if (loadedScanner)
            return false;

        File file = new File(filename);
        try {
            fileScanner = new Scanner(file);
            loadedScanner = true;
        } catch (FileNotFoundException e) {
            System.out.println("The provided File was not found!");
            return false;
        }

        return true;
    }

    public void printsong(long time) throws InterruptedException {
        if (!fileScanner.hasNext())
            return;

        Thread.sleep(time);
        System.out.println(fileScanner.nextLine());

        printsong(time);
    }
}