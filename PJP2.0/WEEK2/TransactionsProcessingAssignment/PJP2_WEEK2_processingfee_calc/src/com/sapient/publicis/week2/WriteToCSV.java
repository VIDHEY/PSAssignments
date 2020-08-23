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

	public static void write(List<Transaction> transactions, String fileName) {
		try {
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName), "UTF-8"));

			StringBuffer line = new StringBuffer();
			line.append("Clint ID" + CSV_SEPARATOR + "Transaction Type" + CSV_SEPARATOR + "Transaction Date"
					+ CSV_SEPARATOR + "Priority" + CSV_SEPARATOR + "Processing Fee");
			bw.write(line.toString());
			bw.newLine();

			for (Transaction tr : transactions) {
				line = new StringBuffer();
				line.append(tr.getClient_id());
				line.append(CSV_SEPARATOR);
				line.append(tr.getTr_type().trim().length() == 0 ? "" : tr.getTr_type());
				line.append(CSV_SEPARATOR);
				line.append(tr.getDate().trim().length() == 0 ? "" : tr.getDate());
				line.append(CSV_SEPARATOR);
				line.append(tr.getPriority());
				line.append(CSV_SEPARATOR);
				line.append(tr.getProcessing_fee());
				line.append(CSV_SEPARATOR);

				bw.write(line.toString());
				bw.newLine();
			}
			bw.flush();
			bw.close();
		} catch (UnsupportedEncodingException e) {
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		}
	}
}
