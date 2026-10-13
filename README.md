# Store-Management-Project

## Description
This project is a dance store that sells dance shoes,
dance clothes, and other dance products.

I used object oriented programming to make a
superclass called Product and two subclasses
called DanceShoes and DanceClothing.

The subclasses use inheritance to get variables
and methods from the superclass.

I used private instance variables to store product
information. Constructors create the objects,
getters return information, and setters change it.

The toString() methods print information about
the products.

The StoreRunner class creates objects and uses
a Scanner to let customers buy leotards.

## UML Diagrams

### Product
--------------------------
Product
--------------------------
- name: String
- price: double
- stock: int
--------------------------
+ Product()
+ Product(name, price)
+ Product(name, price, stock)
+ getName(): String
+ setName(name): void
+ getPrice(): double
+ setPrice(price): void
+ getStock(): int
+ setStock(stock): void
+ toString(): String

### DanceShoes
--------------------------
DanceShoes extends Product
--------------------------
- shoeSize: double
--------------------------
+ DanceShoes()
+ DanceShoes(name, price, shoeSize)
+ DanceShoes(name, price, stock, shoeSize)
+ getShoeSize(): double
+ setShoeSize(shoeSize): void
+ toString(): String

### DanceClothing
--------------------------
DanceClothing extends Product
--------------------------
- clothingSize: String
--------------------------
+ DanceClothing()
+ DanceClothing(name, price, clothingSize)
+ DanceClothing(name, price, stock, clothingSize)
+ getClothingSize(): String
+ setClothingSize(clothingSize): void
+ toString(): String