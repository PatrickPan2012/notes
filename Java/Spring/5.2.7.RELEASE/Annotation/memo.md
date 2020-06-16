﻿# Spring Annotation
  - **@Repository** is used to indicate that an annotated class is a "Repository". A class thus annotated is eligible for Spring *DataAccessException* translation.
  - **@Transactional** is used to describe a transaction attribute on an individual method or on a class. At the class level, this annotation applies as a default to all methods of the declaring class and its subclasses. Note that it does not apply to ancestor classes up the class hierarchy; methods need to be locally redeclared in order to participate in a subclass-level annotation. Transaction rollback occurs on *RuntimeException* and *Error* but not on checked exceptions.
  - **EnableTransactionManagement** is used to enable Spring's annotation-driven transaction management capability, similar to the support found in Spring's <tx:*> XML namespace. Actually, it should be used on **@Configuration** classes to configure traditional, imperative transaction management or reactive transaction management.
  - **EnableAspectJAutoProxy** is used to enable support for handling components marked with AspectJ's **@Aspect** annotation, similar to functionality found in Spring's <aop:aspectj-autoproxy> XML element. In fact, it should be used on **@Configuration** classes.