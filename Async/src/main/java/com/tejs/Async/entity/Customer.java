package com.tejs.Async.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Customer
{
    @Id
	public Integer customer_id;
	public short store_id;
	public String first_name;
	public String last_name;
	public String email;
	public short address_id;
	public boolean activebool;
	public java.sql.Date create_date;
	public java.sql.Timestamp last_update;
	public int active;
}