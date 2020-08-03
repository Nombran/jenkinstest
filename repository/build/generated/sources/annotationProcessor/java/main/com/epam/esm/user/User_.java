package com.epam.esm.user;

import com.epam.esm.order.Order;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(User.class)
public abstract class User_ {

	public static volatile SingularAttribute<User, String> firstName;
	public static volatile SingularAttribute<User, String> lastName;
	public static volatile SingularAttribute<User, String> password;
	public static volatile SingularAttribute<User, Role> role;
	public static volatile ListAttribute<User, Order> orders;
	public static volatile SingularAttribute<User, Long> id;
	public static volatile SingularAttribute<User, String> login;

	public static final String FIRST_NAME = "firstName";
	public static final String LAST_NAME = "lastName";
	public static final String PASSWORD = "password";
	public static final String ROLE = "role";
	public static final String ORDERS = "orders";
	public static final String ID = "id";
	public static final String LOGIN = "login";

}

