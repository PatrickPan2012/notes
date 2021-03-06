﻿# Spring Annotation
  - **@Configuration** is used to indicate a Class that will work as an XML configuration file.
  - **@ComponentScan** is used to indicate one or more packages where components that should be registered automatically are stored and generally works with **@Configuration**.
  - **@Bean** is used to indicate that a method produces a bean to be managed by the Spring container.
  - **@Autowired** is used to indicate a constructor, field, setter method, or config method as to be autowired by Spring's dependency injection facilities and works well with **@Qualifier**. In fact, it is similar to **@Resource** and **@Inject**.
  - **@Transactional** is used to describe a transaction attribute on an individual method or on a class. At the class level, this annotation applies as a default to all methods of the declaring class and its subclasses. Note that it does not apply to ancestor classes up the class hierarchy; methods need to be locally redeclared in order to participate in a subclass-level annotation.
  - **@Component**, **@Controller** **@Service** and **@Repository** are similar. Indeed, **@Controller** is often used for Spring MVC and works with **@RequestMapping** while **@Repository** is used for data exception translation.
  - **@Scope** works with **@Component** and is used to indicate the name of a scope. Moreover, its value could be *singleton*, *prototype*, and so forth.
  - **@PropertySource** is used to provide a convenient and declarative mechanism for adding a *PropertySource* to Spring's Environment. To be used in conjunction with **@Configuration** classes.
  - **@Profile** is used to indicate that a component is eligible for registration when one or more specified profiles are active.
  - **@ActiveProfile** is used to declare which active bean definition profiles should be used when loading an *ApplicationContext* for test classes. Generally, it works with **@RunWith**(*SpringJUnit4ClassRunner*.class) and **@ContextConfiguration**(classes = *App*.class).
  - **@ContextConfiguration** is used to define class-level metadata that is used to determine how to load and configure an *ApplicationContext* for integration tests. Moreover, it is similar to **@SpringBootApplication** and usually works with **@RunWith**(*SpringRunner*.class).
