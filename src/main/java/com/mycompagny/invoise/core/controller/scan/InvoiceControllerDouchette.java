package com.mycompagny.invoise.core.controller.scan;

import com.mycompagny.invoise.core.controller.InvoiceControllerInterface;
import com.mycompagny.invoise.core.entity.Invoice;
import com.mycompagny.invoise.core.service.InvoiceServiceInterface;



public class InvoiceControllerDouchette implements InvoiceControllerInterface {


    public InvoiceServiceInterface getInvoiceService() {
        return invoiceService;
    }

    public void setInvoiceService(InvoiceServiceInterface invoiceService) {
        this.invoiceService = invoiceService;
    }

    private InvoiceServiceInterface invoiceService;
    @Override
    public void createInvoice() {
        System.out.println("usage of scanner");
        Invoice invoice = new Invoice();
        invoice.setCustomerName("bellofiss 2");
        invoiceService.createInvoice(invoice);
    }

}
