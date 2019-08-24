package com.challenge.invoice.repository;

import com.challenge.invoice.entity.Customer;
import com.challenge.invoice.entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
}