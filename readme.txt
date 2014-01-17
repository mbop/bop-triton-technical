1. Build Instructions
This project is configured and built with maven version 3.0.4 and 
compiled with Java version 1.7

To build and run all the JUnit tests, run the following from the project root at the command prompt
mvn clean compile test-compile test

After Junit tests have run, results can be viewed under target/surefire-reports folder.

2. Source Code Packaging
A source package was created for each exercise on the Test with the exception of the Spring
Question which is answered below.

.Unit Test exercise source code is packaged under com.mbop.java.tests.triton.service
.Fib exercise under com.mbop.java.tests.triton.fibonacci
.Incrementing an integer safely under com.mbop.java.tests.triton.threadsafety
.StwAndo exercise under com.mbop.java.tests.triton.stwando
.Algorithm exercise under com.mbop.java.tests.triton.algorithm
.Java exercise under com.mbop.java.tests.triton.aop


************************* Answer to Spring question ********************************
<bean id="myTestBean" class="com.stw.core.person.Person" scope="prototype"
	factory-method="createNew" depends-on="dataSource">
		<property name="firstName" value="${first.name}"/>
		<property name="phone" ref="phone"/>
</bean>

The following code above defines a bean myTestBean with an unknown class name or type. This bean
will be created by the createNew static factory method defined in the com.stw.core.person.Person.
The bean scope is prototype meaning every time it is referenced from another object, a new instance
of it will be created.

The depends-on attribute specifies that myTestBean depends on another bean name dataSource and
this bean will be initialized before myTestBean is initialized.

The myTestBean also defines two properties:
1. property firstName whose value is assigned the value of a property key first.name
either defined in the same configuration file or in a properties file referenced
inside the configuration file.

2. property phone referenced by another bean or object phone. 

******************************* End Answer to Spring question **************************************