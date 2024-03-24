package com.tejs.Async.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Film
{
    @Id
	public Integer film_id;
	public String title;
	public String description;
	public short language_id;
	public short rental_duration;
	public java.math.BigDecimal rental_rate;
	public short length;
	public java.math.BigDecimal replacement_cost;
	public java.sql.Timestamp last_update;
	public String special_features;
	public Object fulltext;
}
