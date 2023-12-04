package com.mycompagny.invoise.core.repository.memory;

import com.mycompagny.invoise.core.entity.Invoice;
import com.mycompagny.invoise.core.repository.InvoiceRepositoryInterface;

import java.util.ArrayList;
import java.util.List;


public class InvoiceRepositoryMemory implements InvoiceRepositoryInterface {

    private static List<Invoice> invoices = new ArrayList<>();

    public void create(Invoice invoice){

        invoices.add(invoice);
        System.out.println("Invoice added with number "+ invoice.getNumber() + " of "+ invoice.getCustomerName());
    }

    @Override
    public List<Invoice> list() {
        throw new UnsupportedOperationException();
    }
}
