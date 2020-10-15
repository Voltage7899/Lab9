package com.company;
import java.sql.SQLOutput;
import  java.util.*;
import java.io.*;

public class Main {


    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        Formatter f = new Formatter("temp.txt");

File file=new File("temp.txt");
        if(!file.exists())
            file.createNewFile();
        if(scanner.hasNext())
            f.format(" ");


        FileWriter fileWriter=new FileWriter(file);


        FileReader fileReader=new FileReader(file);


BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
bufferedWriter.write(s);


bufferedWriter.flush();
bufferedWriter.close();

BufferedReader bufferedReader=new BufferedReader(fileReader);
while(bufferedReader.ready())
    System.out.println(bufferedReader.readLine());








    }


}

