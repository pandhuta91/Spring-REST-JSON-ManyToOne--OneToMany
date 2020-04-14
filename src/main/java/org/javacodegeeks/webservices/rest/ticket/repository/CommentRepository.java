package org.javacodegeeks.webservices.rest.ticket.repository;

import org.javacodegeeks.webservices.rest.ticket.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

}