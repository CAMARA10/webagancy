package com.mycompagny.invoise.core.service.prefix;

import com.mycompagny.invoise.core.entity.Invoice;
import com.mycompagny.invoise.core.repository.InvoiceRepositoryInterface;
import com.mycompagny.invoise.core.service.InvoiceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceServicePrefix implements InvoiceServiceInterface {

    @Value("${invoice.lastNumber}")
    private  long lastNumber;
    @Value("${invoice.prefix}")
    private String prefix;

    public Long getLastNumber() {
        return lastNumber;
    }

    public void setLastNumber(Long lastNumber) {
        this.lastNumber = lastNumber;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public InvoiceRepositoryInterface getInvoiceRepository() {
        return invoiceRepository;
    }

    public void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }
    @Autowired
    private InvoiceRepositoryInterface invoiceRepository;
        public void createInvoice(Invoice invoice){

            invoice.setNumber(String.valueOf(prefix+(++lastNumber)));
            invoiceRepository.create(invoice);

        }

    @Override
    public List<Invoice> getInvoiceList() {
        return invoiceRepository.list();
    }
}
