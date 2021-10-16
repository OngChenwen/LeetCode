package Test;

import java.io.*;
import java.util.Scanner;

public class FileIO {
    public static void main(String[] args) throws IOException {


        Scanner input = new Scanner(System.in);
        String inputString = input.nextLine();

        writeFile(inputString);
        readFile();


    }

    static void writeFile(String input) throws IOException {
//        PrintWriter printWriter = new PrintWriter(new FileOutputStream("output.txt"));
//        printWriter.print(input);
//        printWriter.close();
        File file = new File("output.txt");
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(input);
        fileWriter.flush();
        fileWriter.close();
    }

    static void readFile() throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new FileReader("output.txt"));
//
//        try {
//            String s = bufferedReader.readLine();
//            while(s != null){
//                System.out.println(s);
//                s = bufferedReader.readLine();
//            }
//        } catch (IOException e){
//            System.out.println(e.toString());
//        }

        File file = new File("output.txt");
        Scanner reader = new Scanner(file);
        while(reader.hasNextLine()){
            String out = reader.nextLine();
            System.out.println(out);
        }



    }
}
