package ch02;
import java.io.FileReader;
import java.io.FileWriter;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

public class prgm13
{
    public static void main(String[] args) throws Exception
    {
        String csv = "data.csv";
       // CSVWriter writer = new CSVWriter(new FileWriter(csv));
        //String [] record = "4,David,Miller,Australia,30".split(",");
        //writer.writeNext(record);
        //writer.close();
        CSVReader reader = new CSVReader(new FileReader(csv));
       // String [] record1 ;
        java.util.List l=reader.readAll();

        while (l.isEmpty()==false){
            System.out.println(l.get(0));
            l.remove(0);
        }
    }

}