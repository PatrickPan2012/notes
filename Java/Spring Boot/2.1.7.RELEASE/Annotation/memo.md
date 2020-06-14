# Spring Boot Annotation
  - **@SpringBootApplication** is used to indicate a configuration class that declares one or more **@Bean** methods and also triggers auto-configuration and component scanning. This is a convenience annotation that is equivalent to declaring **@Configuration**, **@EnableAutoConfiguration** and **@ComponentScan**.
  - **@MockBean** is used to add mocks to a *Spring ApplicationContext*. Can be used as a class level annotation or on fields in either **@Configuration** classes, or test classes that are **@RunWith** the *SpringRunner*.
  - **@AutoConfigureMockMvc** is used to apply to a test class to enable and configure auto-configuration of *MockMvc*.
  - **@SpringBootTest** is used to run Spring Boot based tests. Indeed, it would be better for programmers to read its API documents.
  - **@WebMvcTest** is used to combine with **@RunWith**(*SpringRunner*.class) for a typical Spring MVC test. Can be used when a test focuses only on Spring MVC components.
  - **@JsonComponent** is used to provide *JsonSerializer* and/or *JsonDeserializer* implementations to be registered with *Jackson* when *JsonComponentModule* is in use. Can be used to annotate *JsonSerializer* or *JsonDeserializer* implementations directly or a class that contains them as inner-classes.
  