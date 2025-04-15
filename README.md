# mscovid

Microservicio desarrollado con Spring Boot para el registro de casos positivos de COVID-19.

## 🚀 Tecnologías

- Java 21
- Spring Boot 3.4.4
- Spring Data JPA
- PostgreSQL
- Lombok

## ⚙️ Configuración

```properties
spring.application.name=mscovid
server.port=8083
```

Resto de la configuración de base de datos es compartida con los demás microservicios.

## 📦 Endpoints

| Método | Ruta                            | Descripción                     |
|--------|----------------------------------|---------------------------------|
| GET    | /api/v1/positivo-covid?page=0&size=100          | Listar casos                    |
| GET    | /api/v1/positivo-covid/{id}     | Obtener por ID                  |
| POST   | /api/v1/positivo-covid          | Registrar caso positivo         |

## ▶️ Ejecutar

```bash
mvn clean install
mvn spring-boot:run
```

Puerto por defecto: `8083`