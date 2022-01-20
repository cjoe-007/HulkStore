# HulkStore

En esta primera versión se tiene el regisrto de un kardex con los eventos de entrda y salida. Consta de 2 partes 

1. cliente_hulk_store = Es el cliente front end desarrollado con angulasjs, bootstrap, bootstrap,jquery.
2. micoroservicios_hulk_store= es la parte back end desarrollado con Java 11, IDE Eclipse, jpa, base de datos en memoria hdbsql, Spring Boot, Servidor tomcat.

Para ejecutar bajar los dos proyectos y tener libre el puerto 9000. 

Empaquetado y ejecución de los microservicios;
 
 1. Bajamos el proyecto "micoroservicios_hulk_store" en el IDE eclipse dar clic derecho sobre el proyecto, ir hacia “Run As”, escoger la 4 opción maven build.

 2. En la opción Goal poner deploy y dar clic en Run
 
 3. Se ejecutará construirá  el jar y si da algún error suele ser por un tema pruebas unitarias por las dependencias usadas sólo para test.

 4. En la carpeta target se creará el jar  micoroservicios_hulk_store-0.0.1-SNAPSHOT.jar
 
 5. Este jar lo podemos ubicar en cualquier carpeta y con una terminal de comando ejecutamos 
          java -jar micoroservicios_hulk_store-0.0.1-SNAPSHOT.jar
 6. Una vez que se encuentre arriba los microservicios nos dirigimos hasta la carpeta del proyecto \cliente_hulk_store\WebContent y damos doble clic en index y se ejecutará el      kardex
