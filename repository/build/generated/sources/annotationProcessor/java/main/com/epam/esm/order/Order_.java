package com.epam.esm.order;

import com.epam.esm.certificate.Certificate;
import com.epam.esm.user.User;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Order.class)
public abstract class Order_ {

	public static volatile SingularAttribute<Order, LocalDateTime> purchaseDate;
	public static volatile ListAttribute<Order, Certificate> certificates;
	public static volatile SingularAttribute<Order, BigDecimal> totalPrice;
	public static volatile SingularAttribute<Order, Long> id;
	public static volatile SingularAttribute<Order, User> user;

	public static final String PURCHASE_DATE = "purchaseDate";
	public static final String CERTIFICATES = "certificates";
	public static final String TOTAL_PRICE = "totalPrice";
	public static final String ID = "id";
	public static final String USER = "user";

}

