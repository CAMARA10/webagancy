package com.mycompagny.invoise.core.service.number;

import com.mycompagny.invoise.core.entity.Invoice;
import com.mycompagny.invoise.core.repository.InvoiceRepositoryInterface;
import com.mycompagny.invoise.core.service.InvoiceServiceInterface;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceServiceNumber implements InvoiceServiceInterface {
    private static Long lastNumber=0L;

    public InvoiceRepositoryInterface getInvoiceRepository() {
        return invoiceRepository;
    }

    public void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    private InvoiceRepositoryInterface invoiceRepository ;
        public void createInvoice(Invoice invoice){

            invoice.setNumber(String.valueOf(++lastNumber));
            invoiceRepository.create(invoice);

        }

    @Override
    public List<Invoice> getInvoiceList() {
        return invoiceRepository.list();
    }
}
