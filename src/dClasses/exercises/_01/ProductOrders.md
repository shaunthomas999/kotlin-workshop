 a) Write a Kotlin program to implement a class containing order details. Order detail should contain order ID,
 ordering person ID, product name, product category, product price and quantity. Both order ID and ordering person
 ID should not be allowed to change once it is set. Consider the following data as example.

 | Order ID | Person ID | Product name  | Product Category  | Product price | Quantity  |
 | 1        | 1         | Xbox One      | Gaming            | 299.99        | 1         |
 | 2        | 1         | Nike T-shirt  | Clothing          | 50.5          | 5         |
 | 3        | 1         | PS4           | Gaming            | 250           | 1         |
 | 4        | 1         | Puma socks    | Clothing          | 6.99          | 10        |
 | 5        | 1         | iPhone charger| Electronics       | 70            | 1         |

 b) Implement the following interface that works with above data
    
```kotlin

interface OrderHelper {

    fun getTotalOrderCostForPerson(personId: Int): Double
    
    // Optional
    fun numberOfItemsWithCategory(categoryName: String): Int

    // Iterate over the order and when product category
    // is 'Gaming' or 'Electronics' print 'GEGEGE'
    // is 'Clothing' or 'Shoes' print 'shoooppiiing'
    // else 'HUMMMMMM'
    fun crazyPrinting()
}

```