package com.mycompagny.invoise.core.repository.database;

import com.mycompagny.invoise.core.entity.Invoice;
import com.mycompagny.invoise.core.repository.InvoiceRepositoryInterface;
import org.springframework.stereotype.Repository;
//import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InvoiceRepositoryDatabase implements InvoiceRepositoryInterface {

    private static List<Invoice> invoices = new ArrayList<>();

    public void create(Invoice invoice){

        invoices.add(invoice);
        System.out.println("Invoice added with number "+ invoice.getNumber() + " of "+ invoice.getCustomerName());
    }

    @Override
    public List<Invoice> list() {
        Invoice invoice1 = new Invoice();
        invoice1.setNumber("NUM_1");
        invoice1.setCustomerName("EDF");
        Invoice invoice2 = new Invoice();
        invoice2.setNumber("NUM_2");
        invoice2.setCustomerName("CACF");


        return List.of(invoice1, invoice2);
    }
}
