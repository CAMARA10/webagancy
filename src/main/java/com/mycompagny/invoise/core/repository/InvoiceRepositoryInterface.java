package com.mycompagny.invoise.core.repository;

import com.mycompagny.invoise.core.entity.Invoice;

import java.util.List;

public interface InvoiceRepositoryInterface {

    void create(Invoice invoice);
    List<Invoice> list();
}
