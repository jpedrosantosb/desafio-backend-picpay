package com.picpaysimplificado.domain.transaction;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

import com.picpaysimplificado.domain.user.User;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity(name = "transactions")
@Table(name = "transactions")
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private BigDecimal amount;

	@ManyToOne
	@JoinColumn(name = "sender_id")
	private User sender;

	@ManyToOne
	@JoinColumn(name = "receiver_id")
	private User receiver;

	private LocalDateTime timestamp;
	
	
	
	public Transaction() {}

	public Transaction(Long id, BigDecimal amount, User sender, User receiver, LocalDateTime timestamp) {
		this.id = id;
		this.amount = amount;
		this.sender = sender;
		this.receiver = receiver;
		this.timestamp = timestamp;
	}

	public Long getId() {
		return id;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public User getSender() {
		return sender;
	}

	public User getReceiver() {
		return receiver;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	@Override
	public int hashCode() {
		return Objects.hash(amount, id, receiver, sender, timestamp);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transaction other = (Transaction) obj;
		return Objects.equals(amount, other.amount) && Objects.equals(id, other.id)
				&& Objects.equals(receiver, other.receiver) && Objects.equals(sender, other.sender)
				&& Objects.equals(timestamp, other.timestamp);
	}

	@Override
	public String toString() {
		return "Transaction [id=" + id + ", amount=" + amount + ", sender=" + sender + ", receiver=" + receiver
				+ ", timestamp=" + timestamp + "]";
	}
	
	
	
	

}
