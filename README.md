# Spring Concepts

### What is Spring?

Spring is a powerful `lightweight` application development `framework`. 

The `framework`, in broader sense, can be defined as a structure where we find solution of the various technical problems.


### What are the advantage of Spring Framework?

1. `POJO implementation` : Relieve developers to **inherit any class ** using Annotatons like `@Component` , `@Service` etc. 
2. `Remove boilerplate coding`: Predefined Templates , like JDBC template ( no need to write code for creating statement, commiting, closing connection etc), Hibernate, JPA etc. 
3. `Dependency Injection and Inversion of Cotnrol`: Loose coupling between objects

```java
//Employee and Address (tight coupling)
class Employee{  
Address address;  
Employee(){  
address=new Address();  
}  
}  
```

```java
//IOC container is responsible to inject the dependency
class Employee{  
Address address;  
Employee(Address address){  
this.address=address;  
}  
}  
```
### What are the different Modules of Spring Framework?

The Spring framework comprises several modules such as `IOC`, `AOP`, `DAO`, `Context`,` ORM`, `WEB MVC` etc.