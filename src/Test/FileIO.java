package Test;

import java.io.*;
import java.util.Scanner;

public class FileIO {
    public static void main(String[] args) throws IOException {
//        int i = 18764;
//
//        try {
//            // create a new file with an ObjectOutputStream
//            FileOutputStream out = new FileOutputStream("test.txt");
//            ObjectOutputStream oout = new ObjectOutputStream(out);
//
//            // write something in the file
//            oout.writeUTF("nihao");
//            oout.writeInt(i);
//            oout.writeInt(888);
//
//            // close the stream
//            oout.close();
//
//            // create an ObjectInputStream for the file we created before
//            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("test.txt"));
//
//            // read and print what we wrote before
//            System.out.println("" + ois.readUTF());
//            System.out.println("" + ois.readInt());
//            System.out.println("" + ois.readInt());
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }

//        Scanner input = new Scanner(System.in);
//        String last = input.next();
//        String first = input.next();
//        int val = input.nextInt();
//
//        WriteBinaryFile(first,last,val);
//        readFile();
        RandomAcess();
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

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("output.txt"));
        try {
            while (true){
                String lastName = objectInputStream.readUTF();
                String firstName = objectInputStream.readUTF();
                int val = objectInputStream.readInt();
                System.out.println(lastName + " " +firstName + " " + val);
            }
        }catch (EOFException e){
            System.out.println("Finished");
        }
        objectInputStream.close();
    }

    static void WriteBinaryFile(String firstName, String lastName,int number) throws IOException {
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("output.txt"));
        outputStream.writeUTF(lastName);
        outputStream.writeUTF(firstName);
        outputStream.writeInt(number);

        outputStream.close();
    }

    static void RandomAcess() throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile("output1.txt", "rw");
        System.out.println("1 " + randomAccessFile.getFilePointer());
        // an integer is 4 bytes
        randomAccessFile.writeInt(21);
        System.out.println("2 "+ randomAccessFile.length());
        randomAccessFile.writeInt(22);
        System.out.println("3 "+ randomAccessFile.length());
        randomAccessFile.seek(0);
        System.out.println("4 "+ randomAccessFile.readInt());
    }

}
