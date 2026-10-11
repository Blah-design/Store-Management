# Store-Management

# Unit 2 - Store Management Project

## Introduction

You are opening a new business in your community! Businesses often need programs to manage the products and services they offer and track orders and requests from customers. Your goal is to create a store management system for your business.

## Requirements

Use your knowledge of object-oriented programming and class structure and design to create your store management system:
- **Create a class hierarchy** – Develop a superclass that represents a product or service your business offers and one or more subclasses that extend the superclass to represent more specific types of products or services.
- **Declare instance variables** – Declare instance variables in the superclass that are shared with the subclasses and instance variables in the subclasses that are not shared with the superclass.
- **Write constructors** – Write no-argument and parameterized constructors in the superclass and subclasses. Subclass constructors use the super keyword to call the superclass constructor.
- **Implement accessor and mutator methods** – Write accessor and mutator methods for instance variables that should be accessible and/or modifiable from outside of the class.
- **Implement a toString() method** – Write toString() methods in the superclass and subclasses that return information about the state of an object.

## UML Diagram

Embed your UML Diagram here. Upload the image of your UML Diagram to your repo, then use Markdown to insert your image here:

![UML Diagram for my project](Copy%20of%20UML%20Diagram.jpg)

## Description







1. **Write a description of your project here. Include what your store you made, and why you chose this topic. In your description, include as many vocab words from our class to explain how you represented the item/service from your store. If you have user input, explain how the user will interact with your store such as which questions are prompted to the user, what response is your program expecting, and how that is used to output information for your store in the console?**


I created a bakery store management system because bakeries sell a variety of baked goods that share common traits but also have unique features. I built a superclass called Bakery with shared private instance variables name and price, and three subclasses (Muffin, Pastry, and Bread) that use inheritance through the extends keyword and each have their own instance variable, such as isMini, filling, and isSliced. Each class has no-argument and parameterized constructors that use the super keyword, along with accessor and mutator methods and a toString() method. StoreRunner creates objects of each class and prints their information to the console.

2. **How is this project related to STEAM (Science, Technology, Engineering, Art, and Mathematics)? Provide explicit examples from the project and details as possible?**

This project connects to technology and engineering because I designed and built a program using object-oriented programming to solve a real business problem: keeping track of products. It connects to mathematics because the program stores prices as double values and uses a condition in setPrice() to make sure a price can never be negative. It also connects to art and design, because planning the class hierarchy meant deciding how to organize the products in a way that is clear and logical.

3. **What SLOs did you demonstrate during completing this project?**

I was a critical thinker because I solved problems in my design, like changing flavor to name so it fit every item. I was a self-directed, goal-oriented individual because I completed each requirement and checked my progress along the way. I was an effective communicator because I explained my project clearly using vocabulary from class.

