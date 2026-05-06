# Review Journal

The repository goal stays the same: design a Kotlin verification harness for worker systems, covering protocol validation, framed sample traffic, and failure-oriented tests. This note explains the added review angle.

The local checks classify each case as `ship`, `watch`, or `hold`. That gives the project a small review vocabulary that matches its backend services focus without claiming live deployment or external usage.

## Cases

- `baseline`: `queue pressure`, score 158, lane `ship`
- `stress`: `retry load`, score 109, lane `watch`
- `edge`: `worker slack`, score 118, lane `watch`
- `recovery`: `session drift`, score 234, lane `ship`
- `stale`: `queue pressure`, score 170, lane `ship`

## Note

This file is intentionally plain so the fixture remains the source of truth.
