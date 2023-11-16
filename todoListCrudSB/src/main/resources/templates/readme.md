# Documentación del Proyecto: Gestor de Tareas con Spring Boot, MySQL y Thymeleaf

Resumen:

Esta es la documentación del proyecto de gestión de tareas basado en Spring Boot, integrado con una base de datos MySQL y utilizando Thymeleaf como motor de plantillas para la interfaz de usuario. Este proyecto se ha desarrollado con el objetivo de proporcionar una aplicación que pueda crear, visualizar, modificar y eliminar tareas que contienen información básica, que son su id, nombre y descripción.

Objetivo:

El objetivo principal de esta aplicación es ofrecer una plataforma sencilla y fácil de usar para administrar tareas. La aplicación permite realizar las siguientes operaciones:

Agregar Tareas: Los usuarios pueden crear nuevas tareas proporcionando un nombre y una descripción.

Mostrar Tareas: La aplicación presenta una interfaz sencilla que muestra todas las tareas existentes.

Modificar Tareas: Los usuarios tienen la capacidad de actualizar información sobre tareas existentes, lo que incluye modificar el nombre o la descripción de una tarea.

Eliminar Tareas: Se proporciona la funcionalidad para eliminar tareas.

Tecnologías Utilizadas:

Spring Boot: Este proyecto se basa en el marco de desarrollo Spring Boot, lo que garantiza una configuración rápida y sencilla, así como la incorporación de funcionalidades esenciales para aplicaciones Java.

MySQL: La base de datos MySQL se utiliza para almacenar y gestionar la información relacionada con las tareas.

Thymeleaf: Se emplea Thymeleaf como motor de plantillas para la creación de páginas web, permitiendo una integración fácil y eficiente con el backend de Spring Boot.

Estructura y Funcionalidades: 

Capa Modelo: Se encarga de albergar las entidades, en este caso la entidad tarea que cuenta con su atributos id, nombre y descripción, su constructor vació y con parámetros, y los respectivos getters y setters sin olvidar el toString.

Capa Dao: Esta hará de conexión con la base de datos utilizando la interface CrudRepository para realizar acciones básicas necesarias para el proyecto y su funcionamiento adecuado.

Capa Interface: Acá se encontrara la interface de Tarea que tendrá la firma de los métodos que vamos a utilizar para que el controlador se comunique con el dao y por ende con la bd.

Capa Implementacion: En esta capa se encuentra la implementacion de la interface de tarea acá se realizara la lógica de los métodos correspondientes como el guarda, listar, traer y eliminar.

Capa Controller: acá se va a encontrar los distintos métodos que servirán para el control de la vista y esta con el modelo, en esta capa se presenta los end point que serán llamado para poder realizar las operación de la interface

Funcionamiento: 

1. Levantar servidor
2. En el navegador de preferencia poner la siguiente url: http://localhost:puerto/ **Atención: el "puerto" debe ser sustituido por el valor del puerto en el cual se inicio el proyecto**
3. Le aparecerá un listado de las tareas, en el caso de que no tenga ninguna , agregue una con el botón de Agregar, llene los campos y dele al botón de guardar.
4. Luego de haberla agregado tiene dos opciones, modificar o eliminar.
5. Si quiere modificar, apriete el botón "Modificar", los campos se van a llenar con los datos ya almacenado y podrá editarlos, posteriormente a eso, dele al botón de "guardar".
6. Si quiere eliminar, apriete el botón "Eliminar" le aparecera un modal con los datos de la tarea par que pueda visualizar su contenido, si esta segura dele al botón en rojo que dice "eliminar", en caso contrario puede apretar el botón que dice "cerrar"