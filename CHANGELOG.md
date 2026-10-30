# Changelog — Better Connections (NeoForge)

## [Unreleased]

### Change

- **Licencia**: el mod pasa de `All Rights Reserved` a **AGPL-3.0-only**, para cumplir con la
  licencia del original BetterWalls (declarada AGPL-3.0 en sus páginas de Modrinth y CurseForge).
  Añadidos `LICENSE` (texto completo AGPL-3.0) y `NOTICE` (atribución a Lemonnik6484 / JX_Snack,
  origen del port y discrepancia conocida con el fichero `LICENSE` de su GitHub). El JAR ahora
  incluye `LICENSE` y `NOTICE` en `META-INF/`.
- **CHANGELOG**: las entradas anteriores ya no citan ficheros de documentación interna que no forman parte del código publicado.
- Pendiente manual: alinear el campo de licencia del proyecto en CurseForge a AGPLv3.


## [1.1.2] - 2026-10-30

### Changed

- **Variables de CurseForge**: `docs/curseforge/project_vars.md` pasa a `docs/curseforge/project.env` (formato env: `PROJECT_ID`, `GAME_VERSIONS`, `RELEASE_TYPE`, `RELATIONS`). La documentación genérica se centraliza en `codex-docs/reference/CURSEFORGE.md` y los scripts de subida y consulta leen el nuevo fichero.
- **Sin cambios en el mod**: solo documentación y tooling. Versión **exenta de subida a CurseForge** (no hay JAR nuevo que publicar); se versiona por ser un cambio de proceso importante.

## [1.1.1] - 2026-10-29

### Changed

- **Tokens de CurseForge**: el token de subida y la clave Core ya no se guardan en `docs/curseforge/project_vars.md`; se leen de las variables de entorno de usuario `API_MOD_UPLOAD_CURSEFORGE` y `API_MOD_GET_CURSEFORGE`. Los scripts de subida y consulta se han adaptado y la documentación se ha actualizado.
- **Sin cambios en el mod**: solo documentación y tooling. Versión **exenta de subida a CurseForge** (no hay JAR nuevo que publicar); se versiona por ser un cambio de proceso importante.

## [1.1.0] - 2026-08-19

### Change

- **Actualización de NeoForge**: actualizado de 26.2.0.45-beta a 26.2.0.57.
- **Nombre de JAR con versión del cargador**: el artefacto ahora se compila como `better_connections-26.2-neoforge-26.2.0.57-1.1.0.jar`.
- **Documentación del workflow**: actualizada la documentación interna para reflejar la nueva rama de trabajo.

## [1.0.3] - 2026-08-18

### Change

- **Actualización de NeoForge**: actualizado de 26.2.0.37-beta a 26.2.0.45-beta.
- **Nombre de JAR con versión del cargador**: el artefacto ahora se compila como `better_connections-26.2-neoforge-26.2.0.45-beta-1.0.3.jar`.
- **Documentación del workflow**: actualizada la documentación interna para reflejar la nueva rama de trabajo.

## [1.0.2] - 2026-08-12

### Change

- **Nombre de JAR con versión del cargador**: el artefacto ahora se compila como `better_connections-26.2-neoforge-26.2.0.37-beta-1.0.2.jar` (se añade la versión de cargador/NeoForge al nombre del archivo). Empaquetado y documentación; sin cambios de funcionalidad.

## 1.0.0 — 2026-07-27

- Primer release estable para Minecraft 26.2 / NeoForge 26.2.0.32-beta
- Fences, Iron Bars y Walls se conectan entre sí
- Mixins: `FenceBlockMixin`, `PaneBlockMixin`, `WallBlockMixin`

## 0.0.0-beta.1 — 2026-07-27

- Port a Minecraft 26.2 / NeoForge 26.2.0.32-beta
- Misma funcionalidad que la versión 26.1.2
- Fences, Iron Bars y Walls se conectan entre sí
- Mixins: `FenceBlockMixin`, `PaneBlockMixin`, `WallBlockMixin`

## 1.0.0 — 2026-07-21

- Primer release estable
- Fences, Iron Bars y Walls se conectan entre sí
- Compatible con NeoForge 26.1.2.78+

## 0.0.0-beta.2 — 2026-07-21

- Soporte para NeoForge 26.1.2.78 en adelante

## 0.0.0-beta.1 — 2026-07-21

- Port desde BetterWalls (Fabric) a NeoForge 26.1.2
- Fences, Iron Bars y Walls se conectan entre sí
- Mixins: `FenceBlockMixin`, `PaneBlockMixin`, `WallBlockMixin`---

## [1.0.1] - 2026-08-05

### Change

- **Recompilado contra NeoForge `26.2.0.37-beta`**: bump de `neo_version` en `gradle.properties` (`26.2.0.32-beta` -> `26.2.0.37-beta`). Verificado con `runServer` (arranque sin errores).

## [angelog — Better Connections (NeoForge)

## 1.0.0 — 2026-07-27

- Primer release estable para Minecraft 26.2 / NeoForge 26.2.0.32-beta
- Fences, Iron Bars y Walls se conectan entre sí
- Mixins: `FenceBlockMixin`, `PaneBlockMixin`, `WallBlockMixin`

## 0.0.0-beta.1 — 2026-07-27

- Port a Minecraft 26.2 / NeoForge 26.2.0.32-beta
- Misma funcionalidad que la versión 26.1.2
- Fences, Iron Bars y Walls se conectan entre sí
- Mixins: `FenceBlockMixin`, `PaneBlockMixin`, `WallBlockMixin`

## 1.0.0 — 2026-07-21

- Primer release estable
- Fences, Iron Bars y Walls se conectan entre sí
- Compatible con NeoForge 26.1.2.78+

## 0.0.0-beta.2 — 2026-07-21

- Soporte para NeoForge 26.1.2.78 en adelante

## 0.0.0-beta.1 — 2026-07-21

- Port desde BetterWalls (Fabric) a NeoForge 26.1.2
- Fences, Iron Bars y Walls se conectan entre sí
- Mixins: `FenceBlockMixin`, `PaneBlockMixin`, `WallBlockMixin`
