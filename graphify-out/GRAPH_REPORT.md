# Graph Report - 26.2  (2026-08-20)

## Corpus Check
- 24 files · ~67,361 words
- Verdict: corpus is large enough that graph structure adds value.

## Summary
- 95 nodes · 60 edges · 38 communities (14 shown, 24 thin omitted)
- Extraction: 100% EXTRACTED · 0% INFERRED · 0% AMBIGUOUS
- Token cost: 0 input · 0 output

## Graph Freshness
- Built from commit: `6febc5e7`
- Run `git rev-parse HEAD` and compare to check if the graph is stale.
- Run `graphify update .` after code changes (no API cost).

## Community Hubs (Navigation)
- FenceBlockMixin.java
- WallBlockMixin.java
- PaneBlockMixin.java
- BetterConnections
- gradlew
- BetterConnectionsClient
- Config.java
- build.gradle
- settings.gradle
- WallBlockMixin
- project_vars.md
- Config
- build.gradle
- Mod
- Mod
- BlockState
- CallbackInfoReturnable
- Direction
- Inject
- Mixin
- BlockState
- CallbackInfoReturnable
- Inject
- Mixin
- BlockState
- CallbackInfoReturnable
- Direction
- Inject
- Mixin

## God Nodes (most connected - your core abstractions)
1. `Changelog — Better Connections (NeoForge)` - 16 edges
2. `Flujo de trabajo — Better Connections (NeoForge)` - 11 edges
3. `Better Connections` - 5 edges
4. `BetterConnections` - 3 edges
5. `CLAUDE.md — better_connections (26.2)` - 3 edges
6. `BetterConnectionsClient` - 2 edges
7. `FenceBlockMixin` - 2 edges
8. `PaneBlockMixin` - 2 edges
9. `WallBlockMixin` - 2 edges
10. `[1.1.0] - 2026-08-19` - 2 edges

## Surprising Connections (you probably didn't know these)
- None detected - all connections are within the same source files.

## Import Cycles
- None detected.

## Communities (38 total, 24 thin omitted)

### Community 0 - "FenceBlockMixin.java"
Cohesion: 0.10
Nodes (20): 0.0.0-beta.1 — 2026-07-21, 0.0.0-beta.1 — 2026-07-21, 0.0.0-beta.1 — 2026-07-27, 0.0.0-beta.1 — 2026-07-27, 0.0.0-beta.2 — 2026-07-21, 0.0.0-beta.2 — 2026-07-21, 1.0.0 — 2026-07-21, 1.0.0 — 2026-07-21 (+12 more)

### Community 1 - "WallBlockMixin.java"
Cohesion: 0.17
Nodes (11): Buenas prácticas, Commits (Conventional Commits), Convenciones de nomenclatura, Específico del mod, Estructura del proyecto, Flujo de trabajo — Better Connections (NeoForge), Flujo por tarea, Idioma (+3 more)

### Community 2 - "PaneBlockMixin.java"
Cohesion: 0.33
Nodes (5): Attribution, Better Connections, Features, Installation, Requirements

### Community 4 - "gradlew"
Cohesion: 0.50
Nodes (3): CLAUDE.md — better_connections (26.2), Prioridad de instrucciones, Workflow del mod

### Community 5 - "BetterConnectionsClient"
Cohesion: 0.83
Nodes (3): gradlew script, die(), warn()

## Knowledge Gaps
- **34 isolated node(s):** `Config`, `Workflow del mod`, `Prioridad de instrucciones`, `Change`, `Change` (+29 more)
  These have ≤1 connection - possible missing edges or undocumented components.
- **24 thin communities (<3 nodes) omitted from report** — run `graphify query` to explore isolated nodes.

## Suggested Questions
_Questions this graph is uniquely positioned to answer:_

- **What connects `Config`, `Workflow del mod`, `Prioridad de instrucciones` to the rest of the system?**
  _34 weakly-connected nodes found - possible documentation gaps or missing edges._
- **Should `FenceBlockMixin.java` be split into smaller, more focused modules?**
  _Cohesion score 0.09523809523809523 - nodes in this community are weakly interconnected._