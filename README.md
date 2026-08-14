# VDB_JavaConquest

Java hands-on repo — built one concept at a time, each one taken through three levels of implementation to bridge the gap between tutorial code and real production/enterprise code.

## Learning Methodology

Every concept in this repo (inheritance, polymorphism, encapsulation, arithmetic operations, etc.) is implemented **three times**, at increasing levels of rigor:

### 🟢 `local/` — Tutorial Level
The first pass. A simple, working implementation focused purely on understanding the core language concept — no validation, no error handling, no external dependencies. This is "does the concept make sense" code.

### 🟡 `production/` — Production Level
The same concept, rebuilt with real-world software practices:
- Input validation and proper exception handling
- Encapsulation (`private final` fields, controlled access)
- SLF4J logging instead of `System.out.println`
- Meaningful method design instead of static demo methods
- No framework dependencies — plain, clean Java

### 🔴 `enterprise/` — Enterprise Level
The same concept again, this time built the way it would exist in a real backend service:
- Spring Boot dependency injection (`@Service`, `@Component`)
- Proper layered architecture (domain / service separation)
- `equals()`/`hashCode()` correctness, UUID-based identity where relevant
- Thread-safe collections where applicable
- **JUnit 5** test coverage
- **Mockito** for mocking external dependencies in isolated unit tests

## Why this structure

Tutorials teach syntax. They rarely teach *why* a senior engineer's code looks different from a beginner's for the exact same problem. Rebuilding every concept three times — through local → production → enterprise — is meant to close that specific gap: the same logic, but with increasing awareness of validation, maintainability, testability, and real-world architecture.

## Topics covered so far

| Topic | Local | Production | Enterprise |
|---|:---:|:---:|:---:|
| Arithmetic Operations | ✅ | ✅ | ✅ |
| Encapsulation | ✅ | ✅ | ✅ |
| Single Inheritance | ✅ | ✅ | ✅ |
| Multi-level Inheritance | ✅ | ✅ | ✅ |
| Polymorphism (Overloading) | ✅ | ✅ | ✅ |

*(Table updated as new concepts are added.)*

## Stack

- Java 18
- Spring Boot 3.5.6
- JUnit 5 + AssertJ + Mockito
- Maven

## Companion Repos

- DSA practice repo *(separate repository, tracked independently)*
- Backend/persistence repo *(Spring Data JPA, Supabase, MongoDB — separate repo, covered as part of the full backend course)*