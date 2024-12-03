package tum.seba.mobilityservices.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tum.seba.mobilityservices.entity.Invoice;
import tum.seba.mobilityservices.repository.InvoiceRepository;

import java.util.List;
import java.util.Optional;

@Service
public class InvoiceService {

    @Autowired
    private InvoiceRepository invoiceRepository;

    //Create
    public Invoice saveInvoice(Invoice invoice) {
        return invoiceRepository.save(invoice);
    }

    //Read all
    public List<Invoice> findAllInvoices() {
        return invoiceRepository.findAll();
    }

    //FindInvoiceById
    public Invoice findInvoiceById(int invoiceId) {
        Optional<Invoice> foundInvoice = invoiceRepository.findById(invoiceId);
        return foundInvoice.orElse(null);
    }

    //Delete
    public void deleteInvoiceById(int invoiceId) {
        try {
            invoiceRepository.deleteById(invoiceId);
        } catch (Exception e) {
            System.out.println("Unable to find and delete Invoice with ID: " + invoiceId);
        }
    }
}
