### APAW - Práctica 1: Patrones de Diseño
> #### Asignatura: *Arquitectura y Patrones para Aplicaciones Web*
> #### [Máster en Ingeniería Web por la U.P.M.]
---

### Patrón Strategy

Se trata de un patrón de diseño que dota de **flexibilidad** al código ya que permite definir **cómo se realiza el intercambio de mensajes entre objetos** para llevar a cabo una determinada tarea. Este patrón proporciona un **conjunto de algoritmos**, de entre los cuales, el objeto que realiza la llamada elige aquel que **más le conviene**, e incluso, puede **intercambiarlo dinámicamente** según sus necesidades durante la ejecución.

#### Problema elegido

Para ilustrar el uso de este patrón se ha decidido tomar como ejemplo un programa que es capaz de calcular las *raíces reales* de una ecuación que le es pasada por parámetro. En este caso la calculadora resuleve **ecuaciones cuadráticas**. La calculadora hace uso del **patrón** ***Strategy*** para decidir **qué metodo es mejor** para resolver una ecuación. Si el valor del *discriminador* es **mayor o igual a cero** llamará el método ```solve()``` de un objeto de la clase ```RealRoot```, **en caso contrario** realizará la llamda sobre un método de la clase ```ImaginaryRoot```.

La ventaja de usar este patrón es clara, no sólo **resultaría muy sencillo añadir una forma de resolver una ecuación cuadrática** (o incluso modificar una existente), sino que sería muy fácil también **extender la funcionalidad de la calculadora** permitiendo que ésta resuelva también **otro tipo de ecuaciones** (por ejemplo lineares) **añadiendo una nueva estrategia**. Todo ello **sin necesidad de modificar el código existente**. Un patrón sencillo que dota de mucha flexibilidad al código.

#### Diagrama de clases

En el siguiente diagrama se refleja el uso del patrón strategy para la aplicación previamente descrita:
![Class diagram for Strategy Pattern](https://github.com/MiguelArber/APAW.ECP1.MiguelArber/blob/develop/docs/Strategy.png)

### Estado del código

> [![Build Status](https://travis-ci.org/MiguelArber/APAW.ECP1.MiguelArber.svg?branch=master)](https://travis-ci.org/MiguelArber/APAW.ECP1.MiguelArber)

> [![Quality Gate](https://sonarcloud.io/api/badges/gate?key=apaw.ecp1:MiguelArber)](https://sonarcloud.io/dashboard/index/apaw.ecp1:MiguelArber)
