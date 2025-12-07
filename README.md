## 📋 Información General

**Nombre del Proyecto:** spring-data-jpa
**Grupo:** com.cehn17
**Versión:** 0.0.1-SNAPSHOT
**Descripción:** Es un curso de Spring data jpa
**Java Version:** 21
**Spring Boot Version:** 3.5.3

## 🛠️ Tecnologías Utilizadas

- **Java 21** - Lenguaje de programación principal
- **Spring Boot** - Framework principal
- **Spring Data JPA** - Para manejo de persistencia de datos
- **Spring MVC** - Para la capa web
- **Jakarta EE** - APIs empresariales
- **Lombok** - Para reducir código repetitivo
- **Maven** - Gestión de dependencias y construcción
- **Docker** - Containerización
- **Postman** - Documentación de APIs

## 📁 Estructura del Proyecto

``` 
spring-data-jpa-cero-a-experto/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/cehn17/
│   │   │       ├── category/          # Módulo de categorías
│   │   │       ├── common/            # Clases comunes
│   │   │       ├── product/           # Módulo de productos
│   │   │       ├── productDetail/     # Detalles de productos
│   │   │       ├── review/            # Módulo de reseñas
│   │   │       └── SpringDataJpaApplication.java
│   │   └── resources/
│   └── test/
├── docker-config/                     # Configuración Docker
├── uploads/                          # Directorio de archivos subidos
├── .dockerignore
├── Dockerfile                        # Configuración del contenedor
├── compose.yml                       # Docker Compose
├── pom.xml                          # Configuración Maven
├── postman_collection.json         # Colección de Postman
└── README.md
```

## 🏗️ Arquitectura del Proyecto

El proyecto sigue una arquitectura modular organizada por dominios:

- **Category**: Gestión de categorías de productos
- **Product**: Gestión de productos
- **ProductDetail**: Detalles específicos de productos
- **Review**: Sistema de reseñas y comentarios
- **Common**: Componentes compartidos entre módulos

## 🚀 Cómo Ejecutar el Proyecto

### Prerrequisitos

- Java 21+
- Maven 3.8+
- Docker (opcional)

### Ejecución Local

``` bash
# Clonar el repositorio
git clone <repository-url>

# Navegar al directorio del proyecto
cd spring-data-jpa

# Ejecutar con Maven
./mvnw spring-boot:run
```

### Ejecución con Docker

``` bash
# Construir y ejecutar con Docker Compose
docker-compose up --build
```

## 📋 Funcionalidades Principales

1. **Gestión de Categorías**
    - CRUD completo de categorías
    - Relaciones entre categorías y productos

2. **Gestión de Productos**
    - Administración de productos
    - Detalles específicos de productos
    - Relaciones con categorías

3. **Sistema de Reseñas**
    - Comentarios y calificaciones
    - Relaciones con productos

4. **Características Técnicas**
    - Persistencia con JPA
    - APIs REST
    - Validaciones
    - Manejo de archivos (uploads)

## 🧪 Testing

El proyecto incluye una colección de Postman () con todos los endpoints disponibles para facilitar las pruebas.
`postman_collection.json`