# Cinema Management System

## Overview

The Cinema Management System is a Java-based application that utilizes various design patterns to manage movie scheduling, ticket booking, and user interface components in a cinema environment. This project demonstrates the implementation of the Singleton, Factory Method, Abstract Factory, Builder, and Prototype design patterns.

## Design Patterns Used

1. **Singleton Pattern**:
    - The `CinemaConfig` class ensures that there is only one instance of the cinema configuration throughout the application, providing a global point of access to it.

2. **Factory Method Pattern**:
    - The `MovieFactory` abstract class and its concrete implementations (`RegularMovieFactory`, `IMAXMovieFactory`, etc.) allow for the creation of different types of movies based on user input.

3. **Abstract Factory Pattern**:
    - The `UIFactory` interface and its implementation (`DarkThemeFactory`) provide a way to create UI components (like buttons) without specifying their concrete classes.

4. **Builder Pattern**:
    - The `TicketBooking` class and the associated `TicketBookingBuilder` allow for the step-by-step construction of a ticket booking object, ensuring that all necessary parameters are set.

5. **Prototype Pattern**:
    - The `MovieSchedule` interface and the `StandardSchedule` class enable cloning of schedule objects, allowing for easy modification without affecting the original template.


## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- An IDE (e.g., IntelliJ IDEA, Eclipse) for Java development

### Installation

1. Clone this repository:
   ```bash
   git clone https://github.com/yourusername/CinemaManagementSystem.git

