# ProyectoAmbiental

Integrantes : 
  - Byron Cortés Gajardo
  - Fabián Molina Torrealba
  - Felipe Gallardo Estay
  
Relaciones entre clases :
 
CLASE MAIN:
	- Lectura y carga de datos desde un CSV usando las clases CsvFile.
	- Instancia la interface principal.

CLASE CSVFILE:
	- Leen y escriben desde/hacia un CSV -> Las colecciones (ArrayList) de Administradores, Noticias y Puntos de 
	  reciclaje que han sido registrados.

CLASE USUARIOS
	- Clase hija de la clase padre -> <PersonaVirtual>.
	- Muestran y consultan -> Puntos de reciclaje que se encuentran guardados en la coleccion de la clase 
	  <PuntoReciclaje>, especificamente los encontrados en la ciudad que registra el usuario o los de la ciudad que 
	  quiera buscar, haciendo llamados a metodos/comportamientos de la clase <PuntoReciclaje>.
	- Presenta -> Noticias que se encuentran guardados en la colección de la clase <Noticias> usando funciones o 
	  métodos de esta.
	  
CLASE PERSONA VIRTUAL
	- Clase padre de tipo abstracto que es heredada a la clase Usuario y la clase Admin y que posee dos atributos principales 
	de tipo privado que son "Nombre" y "Rut".
	
CLASE ADMIN
	- Contiene una coleccion (ArrayList) de tipo Admin para almacenar todos los objetos tipo Admin que se crean y se 
	  quieren registrar.
	  -Contiene una coleccion (ArrayList) de tipo Admin para almacenar todos los objetos tipo Admin que se crean y se 
	   quieren registrar, tambien se encarga de almacenar los datos en el CSVadmin. una vez que son pedidos los datos, se valida 
	   el formato en el que son ingresados.
	- Clase hija de la clase padre -> <PersonaVirtual>.
	- Muestra, crea y modifica -> Cualquier punto de reciclaje que se encuentra o sea registrado en la coleccion de la 
	  clase <PuntoReciclaje> usando funciones o metodos de esta.
	- Crea y elimina -> Cualquier noticia que se encuentra registrado en la coleccion de la clase <Noticias> haciendo 
	  llamados y usando funciones o métodos de esta.
	- Crea -> Administradores nuevos que son almacenados en la colección de la misma clase Admin. Al ser registrados 
	  pide la validación de la función "Crearpersona" de la clase padre <PersonaVirtual>. Además usando funciones o 
	  métodos de la clase Admin.

CLASE NOTICIAS
	- Contiene una colección (ArrayList) de tipo Noticia para almacenar todos los objetos tipo Noticia que se crean y 
	  se quieren registrar.
	- Maneja métodos para crear y presentar las noticias para cualquier clase que las invoque.

CLASE PUNTORECICLAJE
	- Contiene una coleccion (ArrayList) de tipo PuntoReciclaje para almacenar todos los objetos tipo PuntoReciclaje 
	  que se crean y se quieren registrar.
	- Maneja sobreescritura de métodos para crear y mostrar los puntos de reciclaje que sean solicitados a través de 
	  sus métodos.
	  
PAQUETE VISTASPUNTOSR
	-Paquete que contiene las vistas (JPanel's) de las funcionalidades que se pueden realizar a los puntos de reciclaje 
	 como por ejemplo: Agregar - Mostrar - Eliminar.
	  
PAQUETE VISTAMAIN PRUEBAS:
	- Paquete que contiene las vistas (JFrames) del administrador y el usuario para logear y registrar ambos. 
	  Ademas de sus respectivas ventanas.

	- Para el inicio de sesión en la interfaz en modo administrador el nombre del usuario por defecto es "sandra cano", su id "2241" 
	  y la contraseña es "java", esto instanciará un administrador por defecto.
        - El inicio de sesión en modo de Usuario para modo de prueba será "000-0" y contraseña "valparaiso"
	- Se recomienda no utilizar puntos ni tíldes para la creación de cualquier usuario o administrador.

Prueba : 
    INTERFAZ: 
	- Para el inicio de sesión en la interfaz en modo administrador el usuario por defecto es "user" y la contraseña es 
	  "admin", esto instanciará un administrador por defecto el cual contiene un nombre "admin"; un run, que por defecto
	  será "00000000-0"; una contraseña "admin"; y una id "1" de tipo entero. El menú de este administrador está
	  limitado a agregar punto de reciclaje.
        - El inicio de sesión en modo de Usuario no está disponible por el momento.
    CONSOLA: 
	- Para administrador el id es 4 y la contraseña es 123, ambos de tipo entero. 
	- Para ingresar como usuario se debe registrar antes de ver las opciones disponibles. 

El programa fue ejecutado en IntelliJ IDEA, usando una versión de SDK Versión 19. También es posible abrir el programa en NetBeans.
