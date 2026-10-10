# VDB_JavaConquest

Java hands-on repo — built one concept at a time, each one taken through four levels of implementation to bridge the gap between tutorial code and staff/principal-level infrastructure code.

## Learning Methodology

Every concept in this repo (inheritance, polymorphism, encapsulation, arithmetic operations, etc.) is implemented four times, at increasing levels of rigor:

### 🟢 `local/` — Tutorial Level
The first pass. A simple, working implementation focused purely on understanding the core language concept — no validation, no error handling, no external dependencies. This is "does the concept make sense" code.

### 🟡 `production/` — Production Level
The same concept, rebuilt with real-world software practices:
- Input validation and proper exception handling
- Encapsulation (private final fields, controlled access)
- SLF4J logging instead of `System.out.println`
- Meaningful method design instead of static demo methods
- No framework dependencies — plain, clean Java
- Time/space complexity noted on every method

### 🔴 `enterprise/` — Enterprise Level
The same concept again, this time built the way it would exist in a real backend service:
- Spring Boot dependency injection (`@Service`, `@Component`)
- Proper layered architecture (domain / service separation)
- `equals()`/`hashCode()` correctness, UUID-based identity where relevant
- Thread-safe collections where applicable
- JUnit 5 + AssertJ test coverage — this is where testing lives for the whole progression; the earlier two levels stay focused on their own concerns rather than duplicating a test suite three times
- Where the concept has a natural external-facing surface (a cache, a rate limiter, anything stateful an API would sit in front of): a thin controller/DTO layer with Bean Validation, kept separate from the domain object

> **Note on Mockito:** the dependency is set up, but not yet exercised here — mocking is most meaningful against real external dependencies (databases, APIs), which this repo doesn't have yet. Mockito-based tests will be built out as part of the 63-hour backend course repo, once there's a real repository/API layer worth mocking.

### ⚫ `platform/` — Staff/Principal Engineer Grade
The same concept designed as infrastructure other engineers build on — shared, concurrent, and observable:
- CPU cache line alignment — 64-byte padding between independently written volatile/atomic fields to prevent false sharing across CPU cores
- Lock-free thread safety — `AtomicLong`, `AtomicReference`, CAS-based updates instead of `synchronized`
- Full observability API — min/max/avg latency and error counters, exposed in a form that maps onto Prometheus/Grafana/DataDog
- Percentile-aware latency — p50/p99/p999 instrumentation via a fixed-capacity sample buffer
- Self-benchmarking — warmup, reset, and report phases baked into the class itself
- Self-diagnosing — `printHealthReport()` for ops teams
- Sentinel-based error signalling in concurrent paths, via pre-allocated result holders rather than thrown exceptions
- Hardware-aware algorithm design — cache line boundaries and branch-predictor-friendly guard clauses instead of exceptions on the hot path
- A lightweight correctness check under contention — not a full JUnit suite, just an assertion in the benchmark's `main()` (e.g. N threads × M increments → assert the final counter equals exactly N×M) proving the lock-free design has no lost updates
- Time/space complexity on every method

## Why this structure

Tutorials teach syntax. They rarely teach why a senior (or staff) engineer's code looks different from a beginner's for the exact same problem. Rebuilding every concept four times — through local → production → enterprise → platform — is meant to close that gap in stages: first correctness and validation, then real service architecture and testability, then the concurrency and observability concerns that only show up once code is shared infrastructure rather than a single service's internal detail.

Each concept's four folders are accompanied by a short per-concept `README.md` — one paragraph per level explaining *why* that level added what it added, not just what changed. The point is to make the progression legible to a reviewer skimming the repo, not just to someone reading every line.

## Topics covered so far

| Topic | Local | Production | Enterprise | JUnit Tests | Platform |
|---|---|---|---|---|---|
| Arithmetic Operations | ✅ | ✅ | ✅ | ✅ | ✅ |
| Encapsulation | ✅ | ✅ | ✅ | ✅ | ⬜ |
| Single Inheritance | ✅ | ✅ | ✅ | ✅ | ⬜ |
| Multi-level Inheritance | ✅ | ✅ | ✅ | ✅ | ⬜ |
| Polymorphism (Overloading) | ✅ | ✅ | ✅ | ✅ | ⬜ |

*(Table updated as new concepts are added. Platform tier is applied selectively — concepts with a genuine concurrency/shared-infrastructure story, not every concept mechanically.)*

## Stack

- Java 18
- Spring Boot 3.5.6
- JUnit 5 + AssertJ + Mockito
- Maven

## Companion Repos

- DSA practice repo (separate repository, tracked independently)
- Backend/persistence repo (Spring Data JPA, Supabase, MongoDB — separate repo, covered as part of the full backend course)