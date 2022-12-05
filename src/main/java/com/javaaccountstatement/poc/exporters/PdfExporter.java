package com.javaaccountstatement.poc.exporters;

import java.io.FileOutputStream;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import com.javaaccountstatement.poc.models.FinanceProduct;
import com.javaaccountstatement.poc.models.Transaction;
import com.javaaccountstatement.poc.models.User;
import com.javaaccountstatement.poc.repositories.TransactionRepository;

public class PdfExporter {

  @Autowired
  TransactionRepository transactionRepository;

  private User user;
  private FinanceProduct financeProduct;
  private List<Transaction> transactions;

  public PdfExporter(User user, FinanceProduct financeProduct, List<Transaction> transactions) {
    this.user = user;
    this.financeProduct = financeProduct;
    this.transactions = transactions;
  }

  public void write() {
    try {
      Document document = new Document();
      PdfWriter.getInstance(document, new FileOutputStream("./pdfs/" + financeProduct.getId() + ".pdf"));

      document.open();
      Paragraph paragraph = new Paragraph(user.getUsername());

      PdfPTable table = new PdfPTable(4);
      table.setSpacingBefore(20);

      // Add header
      PdfPCell pdfPCell1 = new PdfPCell(new Paragraph("Created at"));
      PdfPCell pdfPCell2 = new PdfPCell(new Paragraph("Amount"));
      PdfPCell pdfPCell3 = new PdfPCell(new Paragraph("Balance"));
      PdfPCell pdfPCell4 = new PdfPCell(new Paragraph("ID"));
      table.addCell(pdfPCell1);
      table.addCell(pdfPCell2);
      table.addCell(pdfPCell3);
      table.addCell(pdfPCell4);

      for(int i = 0; i < transactions.size(); i++) {
        table.addCell(new PdfPCell(new Paragraph(transactions.get(i).getCreationDate().toString())));
        table.addCell(new PdfPCell(new Paragraph(transactions.get(i).getAmount() + "")));
        table.addCell(new PdfPCell(new Paragraph(transactions.get(i).getBalance() + "")));
        table.addCell(new PdfPCell(new Paragraph(transactions.get(i).getId() + "")));
      }

      document.add(paragraph);
      document.add(table);
      document.close();
    } catch(Exception e) {
      System.out.println("Wenas errorsinho");
    }
  }
}
