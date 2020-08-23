package com.sapient.publicis.week2;

public class Transaction {
	private int tr_id;
	private int client_id;
	private int security_id;
	private String tr_type;
	private String date;
	private int market_val;
	private Boolean priority;
	private int processing_fee;

	public int getTr_id() {
		return tr_id;
	}

	public void setTr_id(String tr_id) {
		this.tr_id = Integer.parseInt(tr_id);
	}

	public int getClient_id() {
		return client_id;
	}

	public void setClient_id(String client_id) {
		this.client_id = Integer.parseInt(client_id);
	}

	public int getSecurity_id() {
		return security_id;
	}

	public void setSecurity_id(String security_id) {
		this.security_id = Integer.parseInt(security_id);
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

	public int getMarket_val() {
		return market_val;
	}

	public void setMarket_val(String market_val) {
		this.market_val = Integer.parseInt(market_val);
	}

	public Boolean getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = (priority.contains("Y")) ? true : false;
	}

	public int getProcessing_fee() {
		return processing_fee;
	}

	public void setProcessing_fee(int processing_fee) {
		this.processing_fee = processing_fee;
	}

	@Override
	public String toString() {
		return "Transaction [tr_id=" + tr_id + ", client_id=" + client_id + ", security_id=" + security_id
				+ ", tr_type=" + tr_type + ", date=" + date + ", market_val=" + market_val + ", priority=" + priority
				+ " Processing Fees=" + processing_fee + "]";
	}
}
