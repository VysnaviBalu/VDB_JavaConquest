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
- SLF4J logging instead of `System.out.println`
- Meaningful method design instead of static demo methods
- No framework dependencies — plain, clean Java
- Time/space complexity noted on every method

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
| Polymorphism (Overloading) | ✅ | ✅ |

*(Table updated as new concepts are added.)*

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