package com.knoldus.Ques15;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class LastModifiedTime {

    public static void main(String[] args)
    {
        File file = new File("src/main/java/com/knoldus/Ques12/file.txt");
        long time = file.lastModified();
        DateFormat sdf
                = new SimpleDateFormat("MMMM dd, yyyy hh:mm a");
        System.out.println("file.txt modified date is : "
                + sdf.format(time));
    }
}
