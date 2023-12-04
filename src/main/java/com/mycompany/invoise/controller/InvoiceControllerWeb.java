package com.mycompany.invoise.controller;

import com.mycompagny.invoise.core.controller.InvoiceControllerInterface;
import com.mycompagny.invoise.core.entity.Invoice;
import com.mycompagny.invoise.core.service.InvoiceServiceInterface;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class InvoiceControllerWeb implements InvoiceControllerInterface {

    
    private InvoiceServiceInterface invoiceService;

    public void createInvoice() {

        String customerName = "Bellofiss";
        Invoice invoice= new Invoice();
        invoice.setCustomerName(customerName);
        invoiceService.createInvoice(invoice);
    }

    @RequestMapping("/invoice-home")
    public @ModelAttribute("invoices") List<Invoice> displayHome() {
        System.out.println("La méthode display home a été invoquée");
        List<Invoice> invoices= invoiceService.getInvoiceList();
      return invoices;
    }
}
