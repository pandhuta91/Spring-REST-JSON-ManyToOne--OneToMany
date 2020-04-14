package org.javacodegeeks.webservices.rest.ticket.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
public class Ticket {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="TICKET_ID")
	private Long ticketId;
	private String description;
	@OneToMany(mappedBy="ticket", cascade=CascadeType.ALL)
	private List<Comment> comments = new ArrayList<Comment>();

	public Long getTicketId() {
		return ticketId;
	}

	public Ticket setTicketId(Long ticketId) {
		this.ticketId = ticketId;
		return this;
	}

	public String getDescription() {
		return description;
	}

	public Ticket setDescription(String description) {
		this.description = description;
		return this;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public Ticket setComments(List<Comment> comments) {
		this.comments = comments;
		return this;
	}
}
