# SISTEMA EN GESTIÓN

## Visión del producto

**Sistema en Gestión** es una plataforma orientada a conectar agricultores del Valle del Cauca con comerciantes urbanos, facilitando la publicación, búsqueda, compra, seguimiento y gestión de productos agrícolas.

### Product Vision Statement

Para agricultores y comerciantes del Valle del Cauca que necesitan una forma organizada de gestionar y comercializar productos agrícolas, **Sistema en Gestión** es una plataforma web que facilita la publicación, búsqueda, compra y seguimiento de productos. A diferencia de los procesos manuales y dispersos, el sistema centraliza la información y permite una gestión más organizada y accesible.

## Integrante

- **ESNEIDER GONZALEZ**

## Estrategia de ramas

Se utilizará una estrategia basada en **GitFlow** para organizar el desarrollo del proyecto.

Las ramas principales serán:

- `main`: contiene las versiones estables del proyecto.
- `develop`: integra los cambios preparados para futuras versiones.
- `feature/*`: se utiliza para desarrollar nuevas funcionalidades.
- `bugfix/*`: se utiliza para corregir errores durante el desarrollo.
- `hotfix/*`: se utiliza para solucionar errores críticos en producción.

### Diagrama de estrategia de ramas

```mermaid
gitGraph
   commit
   branch develop
   checkout develop
   commit
   branch feature/nueva-funcionalidad
   checkout feature/nueva-funcionalidad
   commit
   checkout develop
   merge feature/nueva-funcionalidad
   checkout main
   merge develop
   commit