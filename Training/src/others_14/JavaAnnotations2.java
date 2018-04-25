package others_14;

import java.lang.reflect.Method;
/*@interface MyAnnotation{  
 int value1() default 1;  
 String value2() default "";  
 String value3() default "xyz";  
 }*/
//@MyAnnotation(value1=10,value2="Arun Kumar",value3="Ghaziabad")  
/*Built-in Annotations used in custom annotations in java
 @Target
 @Retention
 @Inherited
 @Documented*/
//The java.lang.annotation.ElementType enum declares many constants to specify the type of element where
//annotation is to be applied such as TYPE, METHOD, FIELD etc.
//@Retention annotation is used to specify to what level annotation will be available.
//@Inherited annotation marks the annotation to be inherited to subclasses.
//@Documented Marks the annotation for inclusion in the documentation.
import java.lang.annotation.ElementType;
//Creating annotation  
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
//@interface element is used to declare an custom annotation like: @interface MyAnnotation{}  
//Rules: Method should not have any throws clauses, it can return either of primitive data types, String, Class, enum or array of these data types.
//There are three types of annotations: 
//1. Marker Annotation: An annotation that has no method like: @Override and @Deprecated
//2. Single-Value Annotation: which has one method call.
//3. Multi-Value Annotation: which has multi method call.

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation {
	int value();
}

// Applying annotation
class Hello {
	@MyAnnotation(value = 10)
	public void sayHello() {
		System.out.println("hello annotation");
	}
}

// Accessing annotation
class JavaAnnotations2 {
	public static void main(String args[]) throws Exception {

		Hello h = new Hello();
		Method m = h.getClass().getMethod("sayHello");

		MyAnnotation manno = m.getAnnotation(MyAnnotation.class);
		System.out.println("value is: " + manno.value());
	}
}
