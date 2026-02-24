# Sistema de Gestión de Turnos

API REST desarrollada con Spring Boot para la gestión de turnos médicos.

## Tecnologías utilizadas
- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Maven

## Funcionalidades
- Crear turnos
- Listar todos los turnos
- Buscar turno por ID
- Buscar turnos por fecha
- Actualizar turno
- Eliminar turno
- Validación de datos
- Manejo de errores con excepciones personalizadas

## Endpoints

| Método | URL | Descripción |
|--------|-----|-------------|
| GET | /turnos | Listar todos los turnos |
| GET | /turnos/{id} | Buscar turno por ID |
| GET | /turnos/buscar?fecha= | Buscar turnos por fecha |
| POST | /turnos | Crear turno |
| PUT | /turnos/{id} | Actualizar turno |
| DELETE | /turnos/{id} | Eliminar turno |

## Cómo ejecutar el proyecto
1. Clonar el repositorio
2. Crear la base de datos: `CREATE DATABASE turnos_db;`
3. Configurar usuario y contraseña de MySQL en `application.properties`
4. Ejecutar el proyecto con Maven
