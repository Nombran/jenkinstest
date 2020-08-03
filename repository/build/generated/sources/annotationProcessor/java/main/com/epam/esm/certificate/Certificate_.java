package com.epam.esm.certificate;

import com.epam.esm.tag.Tag;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Certificate.class)
public abstract class Certificate_ {

	public static volatile SingularAttribute<Certificate, Integer> duration;
	public static volatile SingularAttribute<Certificate, LocalDateTime> modificationDate;
	public static volatile SingularAttribute<Certificate, BigDecimal> price;
	public static volatile SingularAttribute<Certificate, String> name;
	public static volatile SingularAttribute<Certificate, String> description;
	public static volatile SingularAttribute<Certificate, Long> id;
	public static volatile SingularAttribute<Certificate, LocalDateTime> creationDate;
	public static volatile SingularAttribute<Certificate, CertificateStatus> status;
	public static volatile ListAttribute<Certificate, Tag> tags;

	public static final String DURATION = "duration";
	public static final String MODIFICATION_DATE = "modificationDate";
	public static final String PRICE = "price";
	public static final String NAME = "name";
	public static final String DESCRIPTION = "description";
	public static final String ID = "id";
	public static final String CREATION_DATE = "creationDate";
	public static final String STATUS = "status";
	public static final String TAGS = "tags";

}

