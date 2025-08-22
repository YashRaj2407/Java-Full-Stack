

import java.io.*;


public class FileReadWrite {
    
    public static void main(String arg[])
    {
        try {
            FileWriter writer = new FileWriter("example.txt");
            writer.write("Hello world this is Yash\n ");
            writer.write("Hello Universe this is Yash\n ");

            writer.close();
            System.out.println("Data is successfully written");
            FileReader read =new FileReader("example.txt");
            BufferedReader br=new BufferedReader(read);
            System.out.println("Reading from 'example.txt'");
            String line;
            while ((line=br.readLine()) != null ) {
                System.out.println(line);

                
            }
            br.close();
            read.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
