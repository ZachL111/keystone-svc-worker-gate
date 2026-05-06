# Keystone Svc Worker Gate Walkthrough

This walk-through keeps the domain vocabulary close to the data instead of burying it in prose.

| Case | Focus | Score | Lane |
| --- | --- | ---: | --- |
| baseline | queue pressure | 158 | ship |
| stress | retry load | 109 | watch |
| edge | worker slack | 118 | watch |
| recovery | session drift | 234 | ship |
| stale | queue pressure | 170 | ship |

Start with `recovery` and `stress`. They create the widest contrast in this repository's fixture set, which makes them better review anchors than the middle cases.

If `stress` becomes less cautious without a clear reason, I would inspect the drag input first.
