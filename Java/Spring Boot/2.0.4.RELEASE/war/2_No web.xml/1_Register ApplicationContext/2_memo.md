1. Servletcontainerinitializer用于在Web Application启动阶段以编程方式注册Servlet、Filter和Listener。其实现类一般会带上HandleTypes标记；
2. SpringServletcontainerinitializer实现了Servletcontainerinitializer，并被HandleTypes标记。另外，它还依赖了WebApplicationInitializer；
3. WebApplicationInitializer与传统的web.xml方式不同，采用编程方式配置ServletContext；
4. SpringBootServletInitializer实现了WebApplicationInitializer。