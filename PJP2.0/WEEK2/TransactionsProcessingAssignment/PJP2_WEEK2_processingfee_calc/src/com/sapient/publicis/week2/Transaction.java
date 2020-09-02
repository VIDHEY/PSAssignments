package com.sapient.publicis.week2;

public class Transaction implements Comparable<Transaction>{
	private String tr_id;
	private String client_id;
	private String security_id;
	private String tr_type;
	private String date;
	private Double market_val;
	private Boolean priority;
	private Double processing_fee;

	public String getTr_id() {
		return tr_id;
	}

	public void setTr_id(String tr_id) {
		this.tr_id = tr_id;
	}

	public String getClient_id() {
		return client_id;
	}

	public void setClient_id(String client_id) {
		this.client_id = client_id;
	}

	public String getSecurity_id() {
		return security_id;
	}

	public void setSecurity_id(String security_id) {
		this.security_id = security_id;
	}

	public String getTr_type() {
		return tr_type;
	}

	public void setTr_type(String tr_type) {
		this.tr_type = tr_type;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Double getMarket_val() {
		return market_val;
	}

	public void setMarket_val(String market_val) {
		this.market_val = Double.parseDouble(market_val);
	}

	public Boolean getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = (priority.contains("Y")) ? true : false;
	}

	public Double getProcessing_fee() {
		return processing_fee;
	}

	public void setProcessing_fee(Double processing_fee) {
		this.processing_fee = processing_fee;
	}

	@Override
	public String toString() {
		return "Transaction [tr_id=" + tr_id + ", client_id=" + client_id + ", security_id=" + security_id
				+ ", tr_type=" + tr_type + ", date=" + date + ", market_val=" + market_val + ", priority=" + priority
				+ " Processing Fees=" + processing_fee + "]";
	}

	@Override
	public int compareTo(Transaction o) {
		int c1 = this.client_id.compareTo(o.getClient_id());
		
		if(c1 == 0)
		{
			int c2 = this.tr_type.compareTo(o.getTr_type());
			if(c2 == 0)
			{
				int c3 = this.date.compareTo(o.getDate());
				if(c3 == 0)
					return this.priority.compareTo(o.getPriority());
				else
					return c3;
			}
			else
				return c2;
		}
		else
			return c1;
		
	}
	
}
