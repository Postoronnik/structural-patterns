#Structural Design Patterns

In this project presented all behavioral patterns with simple realization.
These examples are more for visual representation of how they are working.
These examples are small part of all power of patterns.
Each package represents each pattern.

Patterns menu:

-[Adapter](src/main/java/adapter)

-[Bridge](src/main/java/bridge)

-[Composite](src/main/java/composite)

-[Decorator](src/main/java/decorator)

-[Facade](src/main/java/fasade)

-[Flyweight](src/main/java/flyweight)

-[Proxy](src/main/java/proxy)

-[Work examples](docs/images)

Short theoretical information about each creational pattern.
Presented on English and Ukraine languages

Adapter/Адаптер
-

Adapter is a structural design pattern that allows objects with incompatible interfaces to collaborate.

___

Адаптер — це структурний патерн проектування, 
що дає змогу об’єктам із несумісними інтерфейсами працювати разом.

Bridge/Міст
-

Bridge is a structural design pattern that lets you split a large
class or a set of closely related classes into two separate 
hierarchies—abstraction and implementation—which can be developed independently of each other.

___

Міст — це структурний патерн проектування, 
який розділяє один або кілька класів на дві окремі ієрархії — абстракцію та реалізацію, 
дозволяючи змінювати код в одній гілці класів, незалежно від іншої.

Composite/Компонувальник
-

Composite is a structural design pattern that 
lets you compose objects into tree structures 
and then work with these structures as if they were individual objects.

___

Компонувальник — це структурний патерн проектування,
що дає змогу згрупувати декілька об’єктів у деревоподібну структуру, 
а потім працювати з нею так, ніби це одиничний об’єкт.

Decorator/Декоратор
-

Decorator is a structural design pattern 
that lets you attach new behaviors to 
objects by placing these objects inside special wrapper objects that contain the behaviors.

___

Декоратор — це структурний патерн проектування, 
що дає змогу динамічно додавати об’єктам нову функціональність, 
загортаючи їх у корисні «обгортки».

Facade/Фасад
-

Facade is a structural design pattern 
that provides a simplified interface to a library, 
a framework, or any other complex set of classes.

___

Фасад — це структурний патерн проектування,
який надає простий інтерфейс до складної системи класів, бібліотеки або фреймворку.

Flyweight/Легковаговик
-

Flyweight is a structural design pattern that lets you 
fit more objects into the available amount of RAM by sharing 
common parts of state between multiple objects instead of keeping all of the data in each object.

___

Легковаговик — це структурний патерн проектування, 
що дає змогу вмістити більшу кількість об’єктів у відведеній оперативній пам’яті.
Легковаговик заощаджує пам’ять, розподіляючи спільний стан об’єктів між собою, 
замість зберігання однакових даних у кожному об’єкті.

Proxy/Замісник
-

Proxy is a structural design pattern that lets you provide a substitute or placeholder for
another object. A proxy controls access to the original object, allowing you to perform 
something either before or after the request gets through to the original object.

___

Замісник — це структурний патерн проектування, 
що дає змогу підставляти замість реальних об’єктів спеціальні об’єкти-замінники. 
Ці об’єкти перехоплюють виклики до оригінального об’єкта,
дозволяючи зробити щось до чи після передачі виклику оригіналові.

