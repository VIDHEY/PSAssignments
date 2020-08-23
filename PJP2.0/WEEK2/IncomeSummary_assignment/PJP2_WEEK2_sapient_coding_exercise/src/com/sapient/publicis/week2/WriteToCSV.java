package com.sapient.publicis.week2;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;

public class WriteToCSV {
	private static final String CSV_SEPARATOR = ",";
    public static void write(List<SummaryObj> summary, String fileName)
    {
        try
        {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName), "UTF-8"));
            
            StringBuffer line = new StringBuffer();
            line.append("Country/City Name" + CSV_SEPARATOR + "Gender" + CSV_SEPARATOR + "Average Income");
            bw.write(line.toString());
            bw.newLine();
            
            for (SummaryObj op : summary)
            {
            	line = new StringBuffer();
                line.append(op.getPlace().trim().length() == 0 ? "" : op.getPlace());
                line.append(CSV_SEPARATOR);
                line.append(op.getGender().trim().length() == 0? "" : op.getGender());
                line.append(CSV_SEPARATOR);
                line.append(op.getAvg_salary());
                line.append(CSV_SEPARATOR);

                bw.write(line.toString());
                bw.newLine();
            }
            bw.flush();
            bw.close();
        }
        catch (UnsupportedEncodingException e) {}
        catch (FileNotFoundException e){}
        catch (IOException e){}
    }
}
