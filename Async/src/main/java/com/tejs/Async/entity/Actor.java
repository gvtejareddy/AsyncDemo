package com.tejs.Async.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "ACTOR")
public class Actor
{
    @Id
	public Integer actor_id;
	public String first_name;
	public String last_name;
	public java.sql.Timestamp last_update;
}