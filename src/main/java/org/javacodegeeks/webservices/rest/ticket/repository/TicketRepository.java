package org.javacodegeeks.webservices.rest.ticket.repository;

import org.javacodegeeks.webservices.rest.ticket.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {


}