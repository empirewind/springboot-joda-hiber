package com.nerv.jodahiber.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Type;
import org.joda.time.DateTime;
@Entity
public class JodaEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long jId;
	
	@Column
	@Type(type="org.joda.time.contrib.hibernate.PersistentDateTime")
	private DateTime fromDate;
}
