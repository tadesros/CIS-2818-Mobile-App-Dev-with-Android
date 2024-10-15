1) Basic Android OS Concepts:


A) What does the Android architectual stack look like?

Chapter 9 -pg 83
![alt text](image.png)


B)What Kernal does it use?
pg 84
This is the core of the OS
Provides the foundation of the Android software stack
Provides many functions, such as
Preemptive multitasking
Low-level core system services
Memory, process, power management, etc.
Network stack
Device drivers for hardware


C) What libraries are available?
pg 84

The standard Java development libraries are available
Strings, networking, file manipulation
Android libraries
Java-based libraries
Include application framework libraries
Include libraries such as:
android.app – access to application model
android.content – content access, publishing, messaging between applications and application components
android.database – used to access data with content providers,and SQLite database management classes
android.graphics – low-level 2D graphics drawing API
android.hardware – presents an API for accessing hardware suchas accelerometer and light sensor
android.opengl – Java interface to OpenGL ES 3D graphics API
android.view – fundamental building blocks of GUIs
android.widget = rich collection of pre-built components, layout managers, radio button, buttons, labels, etc.
And many more!

2) What bytecode format are Android applications in?

![alt text](image-1.png)

3) What is an activity?

pg87
![alt text](image-2.png)

4) What is a fragment?
pg 87
Activities are broken up into fragment


5) What is an intent?
  pg 88 
![alt text](image-3.png)

6) What is a broadcast receiver?
pg 88
![alt text](image-4.png)

7) What IDE and companies are most involved with the tools and languages for Android Development?

a) What is IntelliJ IDE? What is Android Studio?

  > IntelliJ IDEA
   This is a popular IDE for both Java and Kotlin development
   Made by JetBrains, who invented Kotlin
   We will use this to learn Kotlin more effectively
   Android Studio will be used for Android Development
   We will use this the most
   Android Studio is built on top of IntelliJ
   

b) What is JetBrains?

  >  JetBrains invented Kotlin

c) What is Oracle?
    
  >  Oracle is database company

8)How do you declare variables and constants in Kotlin?

>Declare variables in Kotlin:

>var x : Int     //mutable int variable

Declare constants in Kotlin:

 >val y = 10 
 >
 > //Declare and initialize an immutable Int variable


9) How do you make nullable variables in Kotlin?

> pg 100
> 
> val username: String? = null
>
> The var keyword allows us to change (or mutate) the value of a variable
var someData = 150//later…somedata = 200   //OK!
The val keyword means the value cannot be changed
val myVal = 100//latermyVal = 20   //ERROR!  myVal is immutable


10) How do you safely access methods or properties of nullable variables (ensuring you don’t get a 
null pointer exception) 
 
 >Nullable types don’t fundamentally exist in most other programming languages
 With the exception of the optional type in Swift
 By default, a variable in Kotlin cannot be assigned null
 val username : String = null     //will NOT compile
 To explicitly allow for a variable to be assigned null, you must declare it as nullable
 val username : String? = null    //this WILL compile because of the ?
 However, what if you do the following?
 val firstName : String = username    //username is nullable, firstName is not, so this is a compiler ERROR
 You can only perform this assignment (or method call!) if you somehow ensure the nullable type is NOT in fact, null
 if(username != null) {   val firstName : String = username    //OK since we know username isn’t null}
 But, there is a better way – the safe call operator, ?.
 val theLength = username?.length 
 
![alt text](image-5.png)

11)  Know about control statements in Kotlin 
  
  ![alt text](image-6.png)
  
a. Selection control (if, if-else, when) 

>![alt text](image-7.png)
![alt text](image-8.png)
![alt text](image-9.png)

b. Repetition control (while, do-while, for) 
 
 >![alt text](image-10.png)
 ![alt text](image-11.png)
![alt text](image-12.png)
12)    Basic object-oriented syntax in Kotlin 

 >More on Kotlin
and View
Binding --> .pdf 

a. How do you create an instance of a class? 

>![alt text](image-13.png)
![alt text](image-14.png)
![alt text](image-15.png)

b. What are primary and secondary constructors? 

>![alt text](image-16.png)
![alt text](image-17.png)
![alt text](image-18.png)
![alt text](image-19.png)

c. What are custom accessors? 

![alt text](image-20.png)
 
13) Know about the priorities of process states in Android 
 
lec4-lifecycle-activities - .pdf
>![alt text](image-21.png)
![alt text](image-22.png)
![alt text](image-23.png)
![alt text](image-24.png)
![alt text](image-25.png)

14) Know dynamic vs persistent state 
 
![alt text](image-26.png)


15) Know what views, layouts, and widgets are and how they are related 
 
16) Know what constraints are 
a. What is bias? 
b. What are guidelines? 
c. What are margins? 
d. What are chains? 
e. What are opposing constraints? 
 
17) How do you register event handlers? 
a. In XML or Kotlin? 
 