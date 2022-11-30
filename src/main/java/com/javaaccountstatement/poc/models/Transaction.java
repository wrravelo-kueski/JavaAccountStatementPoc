package com.javaaccountstatement.poc.models;

import java.sql.Date;
import java.util.HashMap;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.javaaccountstatement.poc.utils.HexGenerator;
import com.javaaccountstatement.poc.utils.NumberGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "transactions")
public class Transaction {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @JsonIgnore
  private int id;

  private Date created_at;

  private Date updated_at;

  @JsonProperty("type")
  private String transaction_type;

  @Column(name = "\"creationDate\"")
  private Date creationDate;

  @Column(name = "\"entryDate\"")
  private Date entryDate;

  @Column(name = "\"valueDate\"")
  private Date valueDate;

  @Column(name = "\"bookingDate\"")
  private Date bookingDate;

  @Column(name = "\"transactionId\"")
  private int transactionId;

  @Column(name = "\"amount\"")
  private int amount;

  @Column(name = "\"principalPaid\"")
  private int principalPaid;

  @Column(name = "\"interestPaid\"")
  private int interestPaid;

  @Column(name = "\"interestFromArrearsAmount\"")
  private int interestFromArrearsAmount;

  @Column(name = "\"deferredInterestAmount\"")
  private int deferredInterestAmount;

  @Column(name = "\"feesPaid\"")
  private int feesPaid;

  @Column(name = "\"penaltyPaid\"")
  private int penaltyPaid;

  @Column(name = "\"taxOnInterestPaid\"")
  private int taxOnInterestPaid;

  @Column(name = "\"taxOnInterestFromArrearsAmount\"")
  private int taxOnInterestFromArrearsAmount;

  @Column(name = "\"taxOnFeesAmount\"")
  private int taxOnFeesAmount;

  @Column(name = "\"taxOnPenaltyAmount\"")
  private int taxOnPenaltyAmount;

  @Column(name = "\"deferredTaxOnInterestAmount\"")
  private int deferredTaxOnInterestAmount;

  @Column(name = "\"advancePosition\"")
  private int advancePosition;

  @Column(name = "\"arrearsPosition\"")
  private int arrearsPosition;

  @Column(name = "\"expectedPrincipalRedraw\"")
  private int expectedPrincipalRedraw;

  @Column(name = "\"balance\"")
  private int balance;

  @Column(name = "\"redrawBalance\"")
  private int redrawBalance;

  @Column(name = "\"principalBalance\"")
  private int principalBalance;

  @Column(name = "\"interestRate\"")
  private int interestRate;

  @Column(name = "\"organizationCommissionAmount\"")
  private int organizationCommissionAmount;

  @Column(name = "\"fundersInterestAmount\"")
  private int fundersInterestAmount;

  @JsonProperty("userKey")
  @Column(name = "\"user_id\"")
  private int user_id;

  @JsonProperty("productTypeKey")
  @Column(name = "\"finance_product_id\"")
  private int financeProductId;

  @Transient
  private String encodedKey;

  @Transient
  private String[] customerInformation;

  @Transient
  private String comment;

  @Transient
  private String parentAccountKey;

  @Transient
  private String branchKey;

  @Transient
  private HashMap<String, Object> details;

  public Transaction() {
  }

  public Transaction(int id, Date created_at, Date updated_at, String transaction_type, Date creationDate, Date entryDate, Date valueDate, Date bookingDate, int transactionId, int amount, int principalPaid, int interestPaid, int interestFromArrearsAmount, int deferredInterestAmount, int feesPaid, int penaltyPaid, int taxOnInterestPaid, int taxOnInterestFromArrearsAmount, int taxOnFeesAmount, int taxOnPenaltyAmount, int deferredTaxOnInterestAmount, int advancePosition, int arrearsPosition, int expectedPrincipalRedraw, int balance, int redrawBalance, int principalBalance, int interestRate, int organizationCommissionAmount, int fundersInterestAmount, int user_id, int financeProductId) {
    this.id = id;
    this.created_at = created_at;
    this.updated_at = updated_at;
    this.transaction_type = transaction_type;
    this.creationDate = creationDate;
    this.entryDate = entryDate;
    this.valueDate = valueDate;
    this.bookingDate = bookingDate;
    this.transactionId = transactionId;
    this.amount = amount;
    this.principalPaid = principalPaid;
    this.interestPaid = interestPaid;
    this.interestFromArrearsAmount = interestFromArrearsAmount;
    this.deferredInterestAmount = deferredInterestAmount;
    this.feesPaid = feesPaid;
    this.penaltyPaid = penaltyPaid;
    this.taxOnInterestPaid = taxOnInterestPaid;
    this.taxOnInterestFromArrearsAmount = taxOnInterestFromArrearsAmount;
    this.taxOnFeesAmount = taxOnFeesAmount;
    this.taxOnPenaltyAmount = taxOnPenaltyAmount;
    this.deferredTaxOnInterestAmount = deferredTaxOnInterestAmount;
    this.advancePosition = advancePosition;
    this.arrearsPosition = arrearsPosition;
    this.expectedPrincipalRedraw = expectedPrincipalRedraw;
    this.balance = balance;
    this.redrawBalance = redrawBalance;
    this.principalBalance = principalBalance;
    this.interestRate = interestRate;
    this.organizationCommissionAmount = organizationCommissionAmount;
    this.fundersInterestAmount = fundersInterestAmount;
    this.user_id = user_id;
    this.financeProductId = financeProductId;
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Date getCreated_at() {
    return this.created_at;
  }

  public void setCreated_at(Date created_at) {
    this.created_at = created_at;
  }

  public Date getUpdated_at() {
    return this.updated_at;
  }

  public void setUpdated_at(Date updated_at) {
    this.updated_at = updated_at;
  }

  public String getTransaction_type() {
    return this.transaction_type;
  }

  public void setTransaction_type(String transaction_type) {
    this.transaction_type = transaction_type;
  }

  public Date getCreationDate() {
    return this.creationDate;
  }

  public void setCreationDate(Date creationDate) {
    this.creationDate = creationDate;
  }

  public Date getEntryDate() {
    return this.entryDate;
  }

  public void setEntryDate(Date entryDate) {
    this.entryDate = entryDate;
  }

  public Date getValueDate() {
    return this.valueDate;
  }

  public void setValueDate(Date valueDate) {
    this.valueDate = valueDate;
  }

  public Date getBookingDate() {
    return this.bookingDate;
  }

  public void setBookingDate(Date bookingDate) {
    this.bookingDate = bookingDate;
  }

  public int getTransactionId() {
    return this.transactionId;
  }

  public void setTransactionId(int transactionId) {
    this.transactionId = transactionId;
  }

  public int getAmount() {
    return this.amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

  public int getPrincipalPaid() {
    return this.principalPaid;
  }

  public void setPrincipalPaid(int principalPaid) {
    this.principalPaid = principalPaid;
  }

  public int getInterestPaid() {
    return this.interestPaid;
  }

  public void setInterestPaid(int interestPaid) {
    this.interestPaid = interestPaid;
  }

  public int getInterestFromArrearsAmount() {
    return this.interestFromArrearsAmount;
  }

  public void setInterestFromArrearsAmount(int interestFromArrearsAmount) {
    this.interestFromArrearsAmount = interestFromArrearsAmount;
  }

  public int getDeferredInterestAmount() {
    return this.deferredInterestAmount;
  }

  public void setDeferredInterestAmount(int deferredInterestAmount) {
    this.deferredInterestAmount = deferredInterestAmount;
  }

  public int getFeesPaid() {
    return this.feesPaid;
  }

  public void setFeesPaid(int feesPaid) {
    this.feesPaid = feesPaid;
  }

  public int getPenaltyPaid() {
    return this.penaltyPaid;
  }

  public void setPenaltyPaid(int penaltyPaid) {
    this.penaltyPaid = penaltyPaid;
  }

  public int getTaxOnInterestPaid() {
    return this.taxOnInterestPaid;
  }

  public void setTaxOnInterestPaid(int taxOnInterestPaid) {
    this.taxOnInterestPaid = taxOnInterestPaid;
  }

  public int getTaxOnInterestFromArrearsAmount() {
    return this.taxOnInterestFromArrearsAmount;
  }

  public void setTaxOnInterestFromArrearsAmount(int taxOnInterestFromArrearsAmount) {
    this.taxOnInterestFromArrearsAmount = taxOnInterestFromArrearsAmount;
  }

  public int getTaxOnFeesAmount() {
    return this.taxOnFeesAmount;
  }

  public void setTaxOnFeesAmount(int taxOnFeesAmount) {
    this.taxOnFeesAmount = taxOnFeesAmount;
  }

  public int getTaxOnPenaltyAmount() {
    return this.taxOnPenaltyAmount;
  }

  public void setTaxOnPenaltyAmount(int taxOnPenaltyAmount) {
    this.taxOnPenaltyAmount = taxOnPenaltyAmount;
  }

  public int getDeferredTaxOnInterestAmount() {
    return this.deferredTaxOnInterestAmount;
  }

  public void setDeferredTaxOnInterestAmount(int deferredTaxOnInterestAmount) {
    this.deferredTaxOnInterestAmount = deferredTaxOnInterestAmount;
  }

  public int getAdvancePosition() {
    return this.advancePosition;
  }

  public void setAdvancePosition(int advancePosition) {
    this.advancePosition = advancePosition;
  }

  public int getArrearsPosition() {
    return this.arrearsPosition;
  }

  public void setArrearsPosition(int arrearsPosition) {
    this.arrearsPosition = arrearsPosition;
  }

  public int getExpectedPrincipalRedraw() {
    return this.expectedPrincipalRedraw;
  }

  public void setExpectedPrincipalRedraw(int expectedPrincipalRedraw) {
    this.expectedPrincipalRedraw = expectedPrincipalRedraw;
  }

  public int getBalance() {
    return this.balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  public int getRedrawBalance() {
    return this.redrawBalance;
  }

  public void setRedrawBalance(int redrawBalance) {
    this.redrawBalance = redrawBalance;
  }

  public int getPrincipalBalance() {
    return this.principalBalance;
  }

  public void setPrincipalBalance(int principalBalance) {
    this.principalBalance = principalBalance;
  }

  public int getInterestRate() {
    return this.interestRate;
  }

  public void setInterestRate(int interestRate) {
    this.interestRate = interestRate;
  }

  public int getOrganizationCommissionAmount() {
    return this.organizationCommissionAmount;
  }

  public void setOrganizationCommissionAmount(int organizationCommissionAmount) {
    this.organizationCommissionAmount = organizationCommissionAmount;
  }

  public int getFundersInterestAmount() {
    return this.fundersInterestAmount;
  }

  public void setFundersInterestAmount(int fundersInterestAmount) {
    this.fundersInterestAmount = fundersInterestAmount;
  }

  public int getUser_id() {
    return this.user_id;
  }

  public void setUser_id(int user_id) {
    this.user_id = user_id;
  }

  public int getFinanceProductId() {
    return this.financeProductId;
  }

  public void setFinanceProductId(int financeProductId) {
    this.financeProductId = financeProductId;
  }
  
  public String getEncodedKey() {
    return HexGenerator.generateHex();
  }

  public String[] getCustomerInformation() {
    return new String[0];
  }

  public String getComment() {
    return "{ source_transaction_id: " + id + "}";
  }

  public String getParentAccountKey() {
    return HexGenerator.generateHex();
  }

  public String getBranchKey() {
    return HexGenerator.generateHex();
  }

  public HashMap<String, Object> getDetails() {
    HashMap<String, Object> data = new HashMap<String, Object>();
    data.put("encodedKey", HexGenerator.generateHex());
    data.put("transactionChannelKey", HexGenerator.generateHex());
    data.put("internalTransfer", false);
    data.put("transactionChannel", generateDetailsTransactionalChannel());
    return data;
  }

  private HashMap<String, Object> generateDetailsTransactionalChannel() {
    HashMap<String, Object> data = new HashMap<String, Object>();
    data.put("encodedKey", HexGenerator.generateHex());
    data.put("id", "CONEKTA_DIRECT_DEBIT");
    data.put("name", "Conekta Direct Debit");
    data.put("createdByUserKey", HexGenerator.generateHex());
    data.put("creationDate", new java.util.Date());
    data.put("index", NumberGenerator.randomInteger(1000));
    data.put("activated", true);
    data.put("savingsConstraintsUsage", "UNCONSTRAINED_USAGE");
    data.put("savingsConstraints", generateSavingsContraints());
    data.put("usageRights", generateUsageRights());
    return data;
  }

  private HashMap<String, Object> generateSavingsContraints() {
    HashMap<String, Object> data = new HashMap<String, Object>();
    data.put("encodedKey", HexGenerator.generateHex());
    data.put("filterConstraints", new String[0]);
    return data;
  }

  private HashMap<String, Object> generateUsageRights() {
    HashMap<String, Object> data = new HashMap<String, Object>();
    data.put("encodedKey", HexGenerator.generateHex());
    data.put("isAccessibleByAllUsers", true);
    data.put("roles", new String[0]);
    return data;
  }
}
