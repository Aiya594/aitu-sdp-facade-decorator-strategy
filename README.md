
##  E-Commerce Shopping Cart — Strategy, Facade & Decorator Patterns

###  Project Overview

This project is a **simplified e-commerce checkout system** built in Java to demonstrate the use of two important software design patterns:   
1. Facade — for simplifying complex operations
2. Decorator — for flexible price modifications
3. Strategy — for dynamically switching delivery methods

The system simulates a real-world checkout process:
a customer selects a product (e.g. a TV), 
taxes and discounts are applied dynamically, 
payment and confirmation are processed through a single entry point, 
and finally, delivery is calculated using a selected strategy.
---

###  What I Learned

* **How to use the Facade Pattern:**
  I learned how to hide complex operations (order creation, payment processing, and confirmation) behind a single, easy-to-use interface called `Facade`.
  Instead of calling many different methods from different services, one `facade.completeOrder()` method takes care of everything.

* **How to use the Decorator Pattern:**
  I learned how to dynamically add new behavior to an object without changing its code.
  By wrapping the product in decorators (`TaxDecorator` and `DiscountDecorator`), I could apply multiple modifications (10% tax and 5% discount) in a flexible way.

* **How to use the Strategy Pattern:** 
I implemented different delivery strategies that calculate delivery cost and time differently:
  1. StandardDelivery — slower but cheaper
  2. ExpressDelivery — faster with a price increase
  3. PickupPointDelivery — no delivery fee, fixed time

---

### How It Works

The user creates a product:
```java
IProduct tv = new SomeProduct("TV", 130_990f);
```


The product is wrapped with decorators:
```java
IProduct withTax = new TaxDecorator(tv);
IProduct withDiscount = new DiscountDecorator(withTax);
```


The checkout process is simplified by the Facade:
```java
OrderFacade order = new OrderFacade();
order.completeOrder(withDiscount, new ExpressDelivery());
```


The facade automatically:
* Creates the order
* Sends confirmation
* Processes payment
* Calculates delivery based on selected strategy

---

###  Output

```
Order created: TV+Tax(10%)+discount(5%) 136884.55 tenge
Confirmation message sent for: TV+Tax(10%)+discount(5%)
Payment processed: 136884.55 tenge
Delivery type: Express Delivery
Delivery days: 3
Price: 143728.77 tenge

```

---


### Folder Structure

```
src/
 ├── facade/
 │    ├── OrderFacade.java
 │    └── Subsystems.java
 ├── decorators/
 │    ├── Decorator.java
 │    ├── DiscountDecorator.java
 │    └── TaxDecorator.java
 ├── deliveryStrategy/
 │    ├── IDeliveryStrategy.java
 │    ├── DeliveryInfo.java
 │    ├── DeliveryService.java
 │    └── concrete/
 │         ├── StandardDelivery.java
 │         ├── ExpressDelivery.java
 │         └── PickupPointDelivery.java
 ├── product/
 │    ├── IProduct.java
 │    └── SomeProduct.java
 └── Main.java

```

---
