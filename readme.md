# Demo of problem involving `@Context` injection into subresource methods in RESTEasy

To see the problem, issue the command:
`mvn clean package wildfly:run`
and then browse to:
http://localhost:8080/demo

You can then click on the links for trying subresources that should be initialized (with context injection) using the `getResource` method and the `initResource` method.

In this example, both fail, but in my locoal Open Liberty instance, only the `getResource` method fails.









