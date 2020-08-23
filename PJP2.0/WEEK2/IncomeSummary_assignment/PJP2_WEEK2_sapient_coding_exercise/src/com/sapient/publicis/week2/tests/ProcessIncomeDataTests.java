package com.sapient.publicis.week2.tests;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.sapient.publicis.week2.IncomeData;
import com.sapient.publicis.week2.ProcessIncomeData;

public class ProcessIncomeDataTests {

	@Test
	public void shouldReturnIncomeDataList() {
		IncomeData d1 = new IncomeData("Junagadh", "India", "M", "INR", 6000.0);
		IncomeData d2 = new IncomeData("Berlin", "Germany", "F", "GBP", 59.0);
		IncomeData d3 = new IncomeData("Pune", "India", "M", "INR", 2000.0);

		List<IncomeData> data = new ArrayList<IncomeData>();
		data.add(d1);
		data.add(d2);
		data.add(d3);

		assertNotNull(ProcessIncomeData.process(data));
	}

	@Test
	public void shouldNotReturnIncomeDataList() {

		List<IncomeData> data = new ArrayList<IncomeData>();
		assertTrue(ProcessIncomeData.process(data).isEmpty());
	}
}
