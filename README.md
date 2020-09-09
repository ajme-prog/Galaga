# Práctica 2 - Sistemas Operativos 2

Grupo #23
#### César Reyes- 201700392
#### Alan Morataya - 201700944
#### Kevin García - 201701055

## Descripción 

En los grupos establecidos del laboratorio, se le solicita a los estudiantes desarrollar las siguientes aplicaciones y resolver los siguientes problemas utilizando el lenguaje de
programación Java y sobre todo, aplicando de forma correcta los conocimientos vistos en el laboratorio sobre programación concurrente y desarrollo de software con
múltiples hilos. Deberá analizar cada uno de los problemas y desarrollar los algoritmos necesarios para su solución. Todos los problemas deberán contar con una interfaz gráfica o forma de visualizar el comportamiento de los mismos y cómo las operaciones con múltiples procesos influyen en ellos.

Solamente se podrán utilizar las herramientas vistas en el laboratorio tales como: Thread Pools, Synchronized, ReentrantLock, etc. No se podrán utilizar otro tipo de estructuras concurrentes, se deberán desarrollar las propias. Para cada problema se deberán identificar las situaciones en las cuáles existen múltiples procesos, las variables o datos que comparten los procesos, la forma en que se sincronizan y las situaciones que pueden llevar a problemas como : condiciones de carrera, deadlocks, livelocks ó inconsistencia de datos. Además se debe indicar cómo se solucionan dichos problemas y qué herramientas y conceptos se implementaron, todo esto deberá ir en la documentación del proyecto y será de gran valor e importancia, ya que es una forma de evaluar que el estudiante tiene verdaderamente tiene conocimiento del software que implementó. 

Con el objetivo de visualizar los cambios, será necesario utilizar el método Thread.sleep(n) para realizar una pausa y que los cambios sean apreciables. En los lugares en donde se aplique dicho método el valor de “n” que representa milisegundos no deberá exceder de 50, debido a que de lo contrario no será apreciable la operación
de múltiples procesos de forma concurrente y/o paralela.


## Problema 1 : Centro de Acopio

Se tiene un centro en el cual se reciben y se entregan cajas con productos, el centro tiene
una estantería con una capacidad máxima de 20 cajas. Existen dos puertas grandes: una
para las personas que llegan a dejar su respectiva caja (cada persona lleva solamente 1
caja) y la otra para las que llegan a retirar (cada persona puede retirar solamente 1 caja).

Múltiples personas pueden llegar al mismo tiempo al centro de acopio y pueden simultáneamente colocar cada una de ellas su caja en los lugares vacíos de la estantería, si la estantería está llena no pueden entregar sus cajas y deben esperar a que lleguen personas a recoger para que existan espacios vacíos para colocar las caja que llevan. De una forma similar, múltiples personas pueden llegar al centro y simultáneamente retirar cada una de ellas una caja de la estantería, si la estantería está vacía deben esperar a que lleguen personas a dejar cajas para entonces retirar.

Se debe modelar y desarrollar un sistema capaz de representar este comportamiento con las restricciones del negocio que sean obvias y lógicas, algunos ejemplos de estas son:

```bash
- Múltiples personas no pueden colocar su caja en el mismo espacio de la estantería.
- Múltiples personas no pueden retirar la misma caja de la estantería.
```

No se pueden utilizar estructuras como BlockingQueue, solamente se pueden utilizar las herramientas vistas en el laboratorio, tales como : Synchronized, ReentrantLock, etc.


## License
[MIT](https://choosealicense.com/licenses/mit/)
