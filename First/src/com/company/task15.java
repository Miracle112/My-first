package com.company;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task15 {

    public static void main(String[] args) {
        File file1 = new File("D://proga.txt");
        File file2 = new File("D://proga1.txt");
        try (BufferedReader reader = new BufferedReader(new FileReader(file1))) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file2))) {
                String s;
                boolean ok = false;
                while ((s = reader.readLine()) != null) {
                    Pattern pattern = Pattern.compile("//");
                    Matcher matcher = pattern.matcher(s);
                    StringBuilder strBuilder = new StringBuilder();
                    strBuilder.append(s);
                    if (ok){
                        pattern = Pattern.compile("\\*/");
                        matcher = pattern.matcher(s);
                        if (matcher.find()){
                            ok = false;
                            strBuilder.delete(0, strBuilder.length());
                        }
                    }
                    if (matcher.find()){
                        strBuilder.delete(matcher.start(), strBuilder.length());
                        if(strBuilder.length() != 0){
                            writer.write(String.valueOf(strBuilder.append("\n")));
                            continue;
                        }
                    } else {
                        pattern = Pattern.compile("/\\*");
                        matcher = pattern.matcher(s);
                        if (matcher.find()){
                            ok = true;
                            strBuilder.delete(matcher.start(), strBuilder.length());
                            writer.write(String.valueOf(strBuilder.append("\n")));
                        }
                    }
                    if (!ok) {
                        writer.write(String.valueOf(strBuilder.append("\n")));
                    }
                    strBuilder.delete(0, strBuilder.length());
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}