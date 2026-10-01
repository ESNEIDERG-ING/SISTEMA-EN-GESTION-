# Git Flow - SISTEMA EN GESTION

## Ramas principales

### main
Contiene las versiones estables del proyecto que están listas para entrega o producción.

### develop
Contiene la integración de las funcionalidades que están siendo desarrolladas.

## Ramas de trabajo

### feature/*
Se utilizan para desarrollar nuevas funcionalidades.

Ejemplo:

feature/login

feature/registro-productor

feature/gestion-productos

### bugfix/*
Se utilizan para corregir errores encontrados durante el desarrollo.

Ejemplo:

bugfix/error-login

### hotfix/*
Se utilizan para corregir errores críticos encontrados en la versión estable.

Ejemplo:

hotfix/error-produccion

## Flujo de trabajo

mermaid
gitGraph
    commit id: "Inicio"
    branch develop
    checkout develop
    commit id: "Desarrollo"
    branch feature/nueva-funcionalidad
    checkout feature/nueva-funcionalidad
    commit id: "Nueva funcionalidad"
    checkout develop
    merge feature/nueva-funcionalidad
    checkout main
    merge develop