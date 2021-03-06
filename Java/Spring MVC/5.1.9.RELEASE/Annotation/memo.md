﻿# Spring MVC Annotation
  - **@RequestMapping** is used to map web requests onto methods in request-handling classes and generally works with **@Controller**. Moreover, there are some convenient ways to achieve the same goal such as **@GetMapping**, **@PostMapping**, and so forth.
  - **@ResponseBody** is used to indicate a method return value should be bound to the web response body.
  - **@RestController** is a convenience annotation that is itself annotated with **@Controller** and **@ResponseBody**.
  - **@RequestParam** is used to bind a method parameter to a web request parameter.
  - **@RequestBody** is used to bind a method parameter to a web request body.
  - **@PathVariable** is used to bind a method parameter to a URI template variable.
  - **@SessionAttribute** is used to bind a method parameter to a session attribute.
  - **@ExceptionHandler** is used to handle exceptions thrown by request handling. 
  - **@ModelAttribute** is used to bind a method parameter or method return value to a named model attribute.
  - **@InitBinder** is used to identify methods which initialize the WebDataBinder and used for populating command and form object arguments of annotated handler methods.
  - **@ControllerAdvice** is used to declare **@ExceptionHandler**, **@InitBinder**, or **@ModelAttribute** methods to be shared across multiple **@Controller** classes.