package com.sapient.publicis.week2;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ReadCSV {
	public static List<IncomeData> mapCSV(String ipCSVFilePath) {
		List<IncomeData> incomeData = new ArrayList<IncomeData>();
		try {
			File inputF = new File(ipCSVFilePath);
			InputStream inputFS = new FileInputStream(inputF);
			BufferedReader br = new BufferedReader(new InputStreamReader(inputFS));

			incomeData = br.lines().skip(1).map(csv2IncomeObj).collect(Collectors.toList());
			br.close();
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
		return incomeData;
	}

	private static Function<String, IncomeData> csv2IncomeObj = (line) -> {
		String[] record = line.split(",");
		IncomeData incomeData = new IncomeData();

		if (record[0] != null && record[0].trim().length() > 0) {
			incomeData.setCity(record[0]);
		}
		if (record[1] != null && record[1].trim().length() > 0) {
			incomeData.setCountry(record[1]);
		}
		if (record[2] != null && record[2].trim().length() > 0) {
			incomeData.setGender(record[2]);
		}
		if (record[3] != null && record[3].trim().length() > 0) {
			incomeData.setCurrency(record[3]);
		}
		if (record[4] != null && record[4].trim().length() > 0) {
			incomeData.setAmount(Double.valueOf(record[4]));
		}
		//System.out.println(incomeData);
		return incomeData;
	};
}
