
##  E-Commerce Shopping Cart — Facade & Decorator Patterns

###  Project Overview

This project is a **simplified e-commerce checkout system** built in Java to demonstrate the use of two important software design patterns: **Facade** and **Decorator**.

The idea is to show how design patterns can organize and extend code while keeping it clean and flexible.
The program simulates a customer buying a product (like a TV), applying **tax** and **discounts**, and completing the order through a simplified **checkout process**.

---

###  What I Learned

* **How to use the Facade Pattern:**
  I learned how to hide complex operations (order creation, payment processing, and confirmation) behind a single, easy-to-use interface called `Facade`.
  Instead of calling many different methods from different services, one `facade.completeOrder()` method takes care of everything.

* **How to use the Decorator Pattern:**
  I learned how to dynamically add new behavior to an object without changing its code.
  By wrapping the product in decorators (`TaxDecorator` and `DiscountDecorator`), I could apply multiple modifications (10% tax and 5% discount) in a flexible way.

* **Clean architecture:**
  I practiced separating responsibilities — `product` for product logic, `decorators` for price modifications, and `facade` for checkout operations.

---

### How It Works

1. A product (`SomeProduct`) is created with a base price.
2. The product is wrapped with decorators to add:

    * 10% tax (`TaxDecorator`)
    * 5% discount (`DiscountDecorator`)
3. The `Facade` class coordinates the checkout:

    * Creates the order
    * Sends a confirmation message
    * Processes payment

---

###  Output

```
Order created: TV 137539.5 tenge
Confirmation message sent for: TV+Tax(10%)+discount(5%)
Payment processed: 137539.5 tenge
```

---


### Folder Structure

```
src/
 ├── facade/
 │    ├── Facade.java
 │    └── Subsystems.java
 ├── decorators/
 │    ├── Decorator.java
 │    ├── DiscountDecorator.java
 │    └── TaxDecorator.java
 ├── product/
 │    ├── IProduct.java
 │    └── SomeProduct.java
 └── Main.java
```

---
