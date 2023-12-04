package com.mycompagny.invoise.core.controller.keyboard;

import com.mycompagny.invoise.core.controller.InvoiceControllerInterface;
import com.mycompagny.invoise.core.entity.Invoice;
import com.mycompagny.invoise.core.service.InvoiceServiceInterface;

import java.util.Scanner;


public class InvoiceControllerKeyboard implements InvoiceControllerInterface {

    public InvoiceServiceInterface getInvoiceService() {
        return invoiceService;
    }

    public void setInvoiceService(InvoiceServiceInterface invoiceService) {
        this.invoiceService = invoiceService;
    }

    private InvoiceServiceInterface invoiceService;
    public void  createInvoice(){
        System.out.println( "What is the costumer name ?" );
        Scanner sc = new Scanner(System.in);
        String customerName = sc.nextLine();
        Invoice invoice= new Invoice();
        invoice.setCustomerName(customerName);
        invoiceService.createInvoice(invoice);
    }
}
