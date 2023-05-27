# Class diagram

This is the UML diagram for a Car.

```mermaid
---
title: Tesla Class Implementation
---
classDiagram
    note "This is a note on a class diagram."
    class Cybertruck {
        <<final>>
    }
    class Model3 {
        <<final>>
    }
    class Tesla {
        <<abstract>>
    }
    class Car {
        <<abstract>>
        - CarManufacturer manufacturer
        - String model
        - CarBody body
        - CarTire[] tires

        + getManufacturer(): CarManufacturer
        + setManufacturer(CarManufacturer manufacturer): void
        + getModel(): String
        + setModel(String model): void
    }
    
    Model3 <|-- Tesla
    Cybertruck <|-- Tesla
    Tesla <|-- Car
    
    Car "1..1" <-- "*" CarManufacturer
    Car "1..1" *-- "1..1" CarBody
    Car "0..*" *-- "1..1" CarTire
    
    class CarManufacturer {
        <<enumeration>>
        Generic
        TESLA
        ...
    }
    
    class CarBody {
    }
    
    class CarTire {
    }
```
