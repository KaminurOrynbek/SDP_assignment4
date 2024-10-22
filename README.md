# Payment Processing System with Strategy Pattern

This project implements a payment processing system for an e-commerce platform using the Strategy Pattern. It allows handling multiple payment methods such as credit card, PayPal, and cryptocurrency.

## Features

- **Payment Strategy Interface**: Define a common interface for different payment methods.
- **Concrete Strategies**: Implement various payment methods (e.g., `CreditCardPayment`, `PayPalPayment`, `CryptoPayment`).
- **Dynamic Payment Processing**: Change payment methods at runtime in the `ShoppingCart` class.
- **Flexibility**: Demonstrates processing payments using different strategies in the `Main` class.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Any IDE or text editor

### How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/KaminurOrynbek/DesignPatterns.git
