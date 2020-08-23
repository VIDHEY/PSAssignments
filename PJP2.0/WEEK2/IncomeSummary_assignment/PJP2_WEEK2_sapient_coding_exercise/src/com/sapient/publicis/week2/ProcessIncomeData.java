package com.sapient.publicis.week2;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class ProcessIncomeData {
	public static List<SummaryObj> process(List<IncomeData> inputIncomeData) {
		List<ModifiedIncomeData> processedIncomeData = new ArrayList<ModifiedIncomeData>();
		List<SummaryObj> summary = new ArrayList<SummaryObj>();

		for (IncomeData incomeData : inputIncomeData)
			processedIncomeData.add(new ModifiedIncomeData(incomeData));

		var grpIncomeData = processedIncomeData.stream().collect(
				Collectors.groupingBy(ModifiedIncomeData::getPlace, Collectors.groupingBy(ModifiedIncomeData::getGender,
						Collectors.averagingDouble(ModifiedIncomeData::getUsdAmount))));

		TreeMap<String, Map<String, Double>> sortedIncomeData = new TreeMap<String, Map<String, Double>>();
		sortedIncomeData.putAll(grpIncomeData);

		for (String place : sortedIncomeData.keySet()) {
			Map<String, Double> gen_avgIncome = sortedIncomeData.get(place);

			for (String gen : gen_avgIncome.keySet()) {
				Double sal = gen_avgIncome.get(gen);
				summary.add(new SummaryObj(place, gen, sal));
			}
		}
		return summary;
	}
}
