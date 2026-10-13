# VDB_JavaConquest

Java hands-on repo — built one concept at a time, each one taken through
two levels of implementation to bridge the gap between tutorial code and
production-level Java.

## Learning Methodology

Every concept in this repo (inheritance, polymorphism, encapsulation,
arithmetic operations, etc.) is implemented at two increasing levels of rigor:

### 🟢 `local/` — Tutorial Level
The first pass. A simple, working implementation focused purely on
understanding the core language concept — no validation, no error handling,
no external dependencies. This is "does the concept make sense" code.

### 🟡 `production/` — Production Level
The same concept, rebuilt with real-world software practices:
- Input validation and proper exception handling
- Encapsulation (private final fields, controlled access)
- Immutability and defensive copying (final fields, copy mutable inputs, unmodifiable outputs)
- SLF4J logging instead of `System.out.println`
- Meaningful method design instead of static demo methods
- No framework dependencies — plain, clean Java(Lombok appears only in the Classes & Objects comparison)
- Time/space complexity noted on non-trivial methods (loops, copies, searches, sorting)
- Correct `equals`/`hashCode` for domain objects, consistent with each other

## Why this structure

Tutorials teach syntax. They rarely teach why a senior engineer's code
looks different from a beginner's for the exact same problem. Rebuilding
every concept twice — through local → production — closes that gap in
stages: first correctness and understanding, then real-world practices
and validation.

Each concept's folders are accompanied by a short per-concept `README.md`
— one paragraph per level explaining *why* that level added what it added,
not just what changed. The point is to make the progression legible to a
reviewer skimming the repo, not just to someone reading every line.

## Topics covered so far

| Topic | Local | Production |
|---|---|---|
| Arithmetic Operations | ✅ | ✅ |
| Encapsulation | ✅ | ✅ |
| Single Inheritance | ✅ | ✅ |
| Multi-level Inheritance | ✅ | ✅ |
| Heirarchial Inheritance | ✅ | ✅ |
| Polymorphism (Overloading) | ✅ | ✅ |

*(Table updated as new concepts are added.)*

## Learning Roadmap

Alongside the concept-by-concept work above, this repo follows a roadmap that
looks past basic syntax and focuses on architectural design patterns, data
structure efficiency, concurrency, memory optimization, and enterprise
scalability. Each step is worked through in code, committed to this repo, and
marked complete here only when the code is pushed.

**Status key:** ✅ Completed · ⬜ Planned

### 🏛️ Module 1: Structural Foundations & Clean Code

| Step | Topic | Focus | Status |
|---|---|---|---|
| 1 | Classes & Objects | Immutability, Builder vs. Records vs. Beans, Defensive Copying, Stack vs. Heap, `equals`/`hashCode` contract | ✅ |
| 2 | Conditionals & the Strategy Pattern | Eliminating nested `if-else` blocks, Open/Closed Principle, Map-based routing, polymorphic execution | ⬜ |
| 3 | Inheritance vs. Composition | The Fragile Base Class problem, tight vs. loose coupling, interface-driven design, Dependency Injection concepts | ⬜ |

### ⚙️ Module 2: Data, Memory, and Streams

| Step | Topic | Focus | Status |
|---|---|---|---|
| 4 | Collections Framework & Thread Safety | List/Map/Set under the hood, fail-fast vs. fail-safe iterators, concurrent collections like `ConcurrentHashMap`, memory footprints | ⬜ |
| 5 | Functional Programming & Streams API | Lambda expressions, lazy evaluation, primitive vs. object streams, debugging streams | ⬜ |
| 6 | Advanced Exception Handling & Resource Management | Checked vs. unchecked exceptions, custom domain exceptions, try-with-resources, preventing resource leaks | ⬜ |

### 🚀 Module 3: Advanced Architecture & Concurrency

| Step | Topic | Focus | Status |
|---|---|---|---|
| 7 | Generics & Metaprogramming | Type erasure, wildcards `<? extends T>` vs `<? super T>`, Reflection API, custom annotations | ⬜ |
| 8 | Multithreading, Concurrency & Virtual Threads | Java Memory Model, `synchronized` vs. locks, `CompletableFuture`, Java 21+ virtual threads (Project Loom) | ⬜ |
| 9 | Memory Management & GC Tuning | G1GC and ZGC, finding memory leaks, heap dumps, allocation profiling | ⬜ |

### 🌐 Module 4: Enterprise Scale

| Step | Topic | Focus | Status |
|---|---|---|---|
| 10 | I/O, JDBC & Scaling | File I/O vs. NIO, pagination, database streaming over open cursors, distributed caching integration | ⬜ |

> The roadmap is a plan, not a record of what is already done. Only steps
> marked ✅ have code in this repo.

## Stack

- Java 18
- Maven

## Companion Repos

| Repo | Purpose | Level |
|------|---------|-------|
| [VDB_DSAConquest](#) | DSA & LeetCode practice | — |
| [VDB_SpringConquest](#) | Spring Boot + JUnit + Mockito | 🔴 Enterprise |
| [VDB_MicroservicesConquest](#) | Microservices + Observability | ⚫ Platform |

> Enterprise and Platform level implementations are built as part of the
> Spring Boot and Microservices companion repos respectively, where
> framework dependencies, testing infrastructure and distributed concerns
> are first-class concerns rather than additions to a plain Java concept.
