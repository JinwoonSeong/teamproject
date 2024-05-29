package kr.ac.kopo.transaction.vo;

import java.math.BigDecimal;
import java.sql.Date;

public class TransactionVO {
	private int transactionId;
    private String accountNum;
    private int transferId;
    private String transactionType;
    private BigDecimal amount;
    private Date transactionDate;
    private String depositorName;
    private String field;
	public TransactionVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "TransferVO [transactionId=" + transactionId + ", accountNum=" + accountNum + ", transferId="
				+ transferId + ", transactionType=" + transactionType + ", amount=" + amount + ", transactionDate="
				+ transactionDate + ", depositorName=" + depositorName + ", field=" + field + "]";
	}
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public String getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	public int getTransferId() {
		return transferId;
	}
	public void setTransferId(int transferId) {
		this.transferId = transferId;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	public String getDepositorName() {
		return depositorName;
	}
	public void setDepositorName(String depositorName) {
		this.depositorName = depositorName;
	}
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
}
