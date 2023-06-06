package part14.task55;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class NewThread implements Runnable {
    Thread t;

    public NewThread() {
        t = new Thread(this);
    }

    @Override
    public void run() {
        String userHomeDirectory;
        userHomeDirectory = System.getProperty("user.home");
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
            try {
                File file = new File(userHomeDirectory + File.separator + t.getName() + ".txt");
                FileWriter fileWriter = new FileWriter(file);
                fileWriter.write(Arrays.toString(arr));
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        void start(){
        t.start();
        }
    }

