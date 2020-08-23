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
	public static List<Transaction> mapCSV(String ipCSVFilePath) {
		List<Transaction> transactions = new ArrayList<Transaction>();
		try {
			File inputF = new File(ipCSVFilePath);
			InputStream inputFS = new FileInputStream(inputF);
			BufferedReader br = new BufferedReader(new InputStreamReader(inputFS));

			transactions = br.lines().skip(1).map(csv2TransactionObj).collect(Collectors.toList());
			br.close();
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
		return transactions;
	}

	private static Function<String, Transaction> csv2TransactionObj = (line) -> {
		String[] record = line.split(",");
		Transaction transaction = new Transaction();

		if (record[0] != null && record[0].trim().length() > 0) {
			transaction.setTr_id(record[0]);
		}
		if (record[1] != null && record[1].trim().length() > 0) {
			transaction.setClient_id(record[1]);
		}
		if (record[2] != null && record[2].trim().length() > 0) {
			transaction.setSecurity_id(record[2]);
		}
		if (record[3] != null && record[3].trim().length() > 0) {
			transaction.setTr_type(record[3]);
		}
		if (record[4] != null && record[4].trim().length() > 0) {
			transaction.setDate(record[4]);
		}
		if (record[5] != null && record[5].trim().length() > 0) {
			transaction.setMarket_val(record[5]);
		}
		if (record[6] != null && record[6].trim().length() > 0) {
			transaction.setPriority(record[6]);
		}
		return transaction;
	};
}

//        Collections.sort(transactions, new Comparator<Transaction>(){
//
//        	  public int compare(Transaction o1, Transaction o2)
//        	  {
//        		  if(o1.client_id-o2.client_id == 0)
//        			  if(o1.tr_type.compareTo(o2.tr_type) == 0)
//        				  return o1.date.compareTo(o2.date);
//        			  else
//        				  return o1.tr_type.compareTo(o2.tr_type);
//        		  else
//        			  return o1.client_id-o2.client_id;
//        	  }
//        	});
//        
//        for(int i=0;i<transactions.size();i++)
//        {
//        	Transaction tr = transactions.get(i);
//        	System.out.print(tr.client_id);
//        	System.out.print(" , " + tr.tr_type);
//        	System.out.print(" , " + tr.date + "\n");
//        }
//	}
//}
//
////ArrayList<Integer> IntradayTransactions = new ArrayList<Integer>();
////HashMap<String, IntraDayTransaction> checkIntraDay = new HashMap<String, IntraDayTransaction>();
////
////for(int i=0;i<transactions.size();i++)
////{
////	Transaction temp = transactions.get(i);
////	IntraDayTransaction itr = new IntraDayTransaction(temp.tr_type, temp.tr_id);
////	
////	String temp_key = temp.client_id + temp.security_id + temp.date;
////	if(checkIntraDay.containsKey(temp_key))
////	{
////		
////	}
////		checkIntraDay.put(temp_key, itr);        	
////}