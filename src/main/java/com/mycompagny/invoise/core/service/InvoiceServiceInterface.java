package com.mycompagny.invoise.core.service;

import com.mycompagny.invoise.core.entity.Invoice;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface InvoiceServiceInterface {

    void createInvoice(Invoice invoice);
    List<Invoice> getInvoiceList();
}
