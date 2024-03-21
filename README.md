6. Actividades
6.0 Definición textual de las principales características de su solución, definición de la estructura de datos a usar y los métodos que la conforman
   R: Para realizar la solucion implementare una matriz bidimensional, donde se utilizaran las filas como los dias de la semana y las columnas como horas del dia, esa sera la estructura de datos a usar.
   los metodos a utilizar sera:
   1. ingresarDatos, este metodo sera encargado de llenar la matriz con los valores haciendo el uso del random, retornando una matriz con los valores de los sismos.
   2. mostrarMayorSismo, este metodo busca el sismo de mayor magnitud en la matriz creada anteriormente, eso lo hara recorriendo filas y columnas buscando el valor mas alto y lo imprimira por pantalla.
   3. contarSismos, este metodo cuenta la cantidad de sismos que sean mayores a 5.0 dentro de la matriz, recorriendo la matriz y guardando los valores mayores a 5 para luego mostrar la cantidad de sismos mayores a 5.0.
   4. enviarSMS, este metodo simulara el envio de un SMS por cada sismo mayor o igual a 7.0, recorrera la matriz buscando los valores mayores o iguales a 7.0 y por cada valor encontrado se creara un mensaje de alerta.
   5. Salir(S/N), este metodo sera para salir del menu.
   6. mostrarMenu, este metodo sera el encargado de mostrar el menu cuando se ejecute el programa.
      Principales caracteristicas del programa realizado:
      1.  Es un programa interactivo, ya que permite que el usuario interactue con el menu.
      2.  El uso de la clase random, esta clase se utiliza para generar los valores dentro de la matriz, tratando de imitar la aleatoriedad de los sismos.
      3.  Facil uso, el programa se creo pensando en que sea de facil uso, con mensajes claros.
